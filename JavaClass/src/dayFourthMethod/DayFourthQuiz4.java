package dayFourthMethod;

import java.util.*;

public class DayFourthQuiz4 {

    public static double calcTriangleArea(double bottom, double height) {
        double triangleArea = bottom * height / 2;
        return triangleArea;
    }

    public static double calcCircleArea(double radius) {
        double circleArea = Math.PI * radius * radius; // 자바에서 제공하는 pi
        return circleArea;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형의 넓이를 계산합니다");
        System.out.println("밑변의 길이를 입력하세요");
        double bottom = scanner.nextDouble();
        System.out.println("높이의 길이를 입력하세요");
        double height = scanner.nextDouble();
        System.out.println("원의 넓이를 계산합니다");
        System.out.println("반지름의 길이를 입력하세요");
        double radius = scanner.nextDouble();
        
        double TriangleArea = calcTriangleArea(bottom, height);
        double CircleArea = calcCircleArea(radius);
        System.out.println("삼각형의 넓이는 " + TriangleArea);
        System.out.println("원의 넓이는 " + CircleArea);
        
        scanner.close();
    }

}
