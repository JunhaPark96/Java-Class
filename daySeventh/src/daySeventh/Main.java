//package daySeventh;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        double[] points = new double[n];
//        for (int i = 0; i < n; i++) {
//            int point = scanner.nextInt();
//            points[i] += point;
//        }
//        int maxNum = 0;
//        int sumVal = 0;
//        for (int i = 1; i < points.length; i++) {
//            maxNum = Math.max(points[i], points[i-1]);
//        }
//        for (int i = 0; i < points.length; i++) {
//            System.out.print(points[i] + " ");
//            points[i] = points[i] / maxNum * 100;
//            System.out.println(points[i]);
//            sumVal += points[i];
//            System.out.println(sumVal);
//        }
//        
////        double avg = 
//    }
//
//}
