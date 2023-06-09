package dayFifth.Main;

import java.util.*;

public class DayFifthQuiz4 {

    public static boolean coordinate(double x, double y) {
        boolean result = false;
        double distance = Math.PI * Math.sqrt(x * x + y * y);
//        System.out.println(distance);
        if (distance <= Math.PI) {
            result = !result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hits = 0;

        System.out.println("던질 횟수를 입력해주세요");
        long tries = scanner.nextLong();
        
        for (int i = 0; i < tries; i++) {
            double x = new Random().nextDouble() * 2 - 1;
            double y = new Random().nextDouble() * 2 - 1;
//            System.out.println(x);
            boolean ans = coordinate(x, y);
            if (ans == true) {
                hits++;
            }
        }
        double piEstimate = 4 * (double)hits / tries;
        System.out.println(hits);
        System.out.println(tries);
        System.out.println(piEstimate);
        
        
    }

}
