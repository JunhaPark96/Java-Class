package dayTenth.Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // 공사장 x 좌표
        int y = scanner.nextInt(); // 공사장 y 좌표
        int noiseLevel = scanner.nextInt(); // 공사장 소음의 크기
        ConstructionSite<Location> constructionSite = new ConstructionSite<>(new Coordinate(x, y), noiseLevel);
        //  주의. ConstructionSite의 타입을 Location으로 정의하였기 때문에, Coordinate는 Location을 구현해야함
        
        int n = scanner.nextInt(); // 나무 갯수
        List<Tree<Location>> trees = new ArrayList<>();
        //  Tree 객체를 원소로 갖는 리스트, 각 Tree 객체는 Location 객체를 원소로 가짐
        
        for (int i = 0; i < n; i++) {
            int treeX = scanner.nextInt();
            int treeY = scanner.nextInt();
            trees.add(new Tree<>(new Coordinate(treeX, treeY))); // x, y좌표를 갖는 Tree객체리스트에 trees add
        }
        
        NoiseDetector<Location> noiseDetector = new NoiseDetector<>(trees, constructionSite.getCoordinate(), noiseLevel);
        noiseDetector.detectNoisyLocations();
        
        // 이 부분 거리계산기를 따로
//        for (Tree<Location> tree : trees) {
//            if (constructionSite.calculateDistance(tree.getLocation()) <= constructionSite.getNoiseLevel()) {
//                System.out.println("noisy");
//            } else {
//                System.out.println("silent");
//            }
//        }
    }
}


/*      상상도
        입력값 1. 공사현장클래스[좌표클래스(x 좌표)] 공사현장클래스[좌표클래스(y 좌표)] 공사현장클래스[소음의 크기]
        입력값 2. 나무그늘의 수 -> 나무클래스를 int로 입력
        입력값 3. 나무그늘N의 좌표 나무클래스[좌표클래스(x 좌표)], [좌표클래스(y 좌표)]
                
        출력값 String
        거리계산?
        boolean is소음 (나무클래스[좌표클래스(x,y 좌표)], 공사장[좌표클래스(x, y 좌표)])
        return String
                
        좌표 클래스 = 인터페이스
        소음 측정기 = 추상클래스
        공사현장, 나무 = 그냥 클래스 상속할 예정
        
        x y R # 공사 현장의 x 좌표, 공사 현장의 y 좌표 공사장 소음의 크기
        N # 나무 그늘의 수
        x_1 y_1 # 나무 그늘1의 x 좌표, y 좌표
        x_2 y_2 # 나무 그늘2의 x 좌표, y 좌표
        ...
        x_N y_N # 나무 그늘N의 x 좌표, y 좌표*/