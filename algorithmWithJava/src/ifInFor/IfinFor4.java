package ifInFor;
/*
 * 자연수 n을 입력받아 1부터 n까지 369 게임을 진행했을 때의 결과를 출력하는 프로그램을 작성해보세요. 369 게임에서는 숫자가 3의 배수이거나 숫자에 3, 6, 9 중 하나라도 들어가있는 경우에는 0을 출력하고, 그렇지 않다면 해당 숫자를 그대로 출력합니다.

입력 형식
첫 번째 줄에는 n이 주어집니다.

1 ≤ n ≤ 100
출력 형식
1부터 n까지의 결과를 순서대로 공백을 사이에 두고 출력합니다. 각각의 숫자에 대해 3의 배수이거나 숫자에 3, 6, 9 중 하나가 들어간다면 0을 출력하고, 그렇지 않다면 해당 숫자를 그대로 출력합니다.

입출력 예제
예제1
입력:

3
출력:

1 2 0
예제2
입력:

14
출력:

1 2 0 4 5 0 7 8 0 10 11 0 0 14
 */
import java.util.*;

public class IfinFor4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 1 2 0 4 5 0 7 8 0 10 11 0 0 14 0 0 17 0 0 20 0 22 0 0 25 0 0 28 0 0 0 0 0 0 0
        // 1 2 0 4 5 0 7 8 0 10 11 0 0 14 0 0 17 0 0 20 0 22 0 0 25 0 0 28 0 0 0 0 0 0 0
        // 1 2 0 4 5 0 7 8 0 10 11 0 0 14 0 0 17 0 0 20 0 22 0 0 25 0 0 28 0 0 31 32 0 34 35 
        for (int i = 1; i < n + 1; i++) {

            if (i <= 10) {
                if (i == 3 || i == 6 || i == 9 || i % 3 == 0) {
                    System.out.print(0 + " ");
                } 
            } else if (i > 10) {
                if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i % 3 == 0) {
                    System.out.print(0 + " ");
                } 
            } else {
                System.out.print(i + " ");
            }
        }
        
        /*
         * for(int i = 1; i <= n; i++) {
            if(i % 3 == 0)
                System.out.print("0 ");
            else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
                System.out.print("0 ");
            else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
                System.out.print("0 ");
            else
                System.out.print(i + " ");
        }
         */
    }

}
