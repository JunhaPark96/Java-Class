package dayFourthMethod;

import java.util.*;

public class DayFourthAlgo1 {
    
    public static String solution (int n, int m) {
        // 첫 번째 풀이
        boolean answer = true;
        String string;
        // 홀수와 짝수의 쌍이 아닌 경우
        if ((n % 2 == 0 && m % 2 != 0) || (n % 2 != 0 && m % 2 == 0)) {
            answer = !answer;
        }

        if (answer == true) {
            string = "YES";
        } else {
            string = "NO";
        }
        
        return string;
        
    }
    
    public static boolean solution2 (int n, int m) {
        // 두 번째 풀이
        boolean answer = true;

        // 홀수와 짝수의 쌍이 아닌 경우
        if ((n % 2 == 0 && m % 2 != 0) || (n % 2 != 0 && m % 2 == 0)) {
            answer = !answer;
        }        
        return answer;

    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        /*
        if ((num1 + num2) % 2 == 0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }*/
        
        System.out.println(solution(num1, num2));
        
        if (solution2(num1, num2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }

}
