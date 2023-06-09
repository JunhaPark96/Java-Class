package dayFifth.Main;

import java.util.*;

public class DayFifthAlgo {
    public static boolean coordinate(int x, int y, int a, int b, int R) {
        boolean noiseArea = false;
        double distance = (x - a) * (x - a) + (y - b) * (y - b);
        if (distance >= R * R) { // 소음 범위를 벗어나면
            noiseArea = !noiseArea;
        }
        return noiseArea;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // x좌표
        int b = scanner.nextInt(); // y좌표
        int R = scanner.nextInt(); // 소음 거리
        int N = scanner.nextInt(); // 그늘의 수

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt(); // 그늘의 x좌표
            int y = scanner.nextInt(); // 그늘의 y좌표

            boolean noiseArea = coordinate(a, b, x, y, R);
            if (noiseArea) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }

        }
    }

}
