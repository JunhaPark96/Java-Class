package breakEx;
/*
 * n이 주어졌을 때, 1부터 차례대로 10까지 1씩 증가시키며 곱을 구하다가 처음으로 그 곱이 n 이상이 되는 순간에 곱해진 숫자가 무엇인지를 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 3,000,000
출력 형식
첫 번째 줄에 마지막으로 곱해진 숫자를 출력합니다.

입출력 예제
예제1
입력:

5
출력:

3
예제2
입력:

121
출력:

6
 */
import java.util.*;

public class Break2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = 1;
        
        for (int i = 1; i <= 10; i++) {
            prod *= i;
            if (prod >= n) {
                System.out.println(i);
                break;
            }
        }
    }

}
