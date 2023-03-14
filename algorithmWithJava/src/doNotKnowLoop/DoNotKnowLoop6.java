package doNotKnowLoop;
/*
 * 2의 거듭제곱수 중 하나인 n을 입력받아, n=2 
x
  를 만족하는 x 값을 구하는 코드를 작성해보세요.

입력 형식
첫 번째 줄에 n이 주어집니다.

2 ≤ n ≤ 1,024
출력 형식
x값을 출력합니다.

입출력 예제
예제1
입력:

4
출력:

2
 */
import java.util.*;

public class DoNotKnowLoop6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        
        int n = scanner.nextInt();
        while (true) {
            if (n == 1) {
                break;
            }
            n /= 2;
            cnt++;
        }
        System.out.println(cnt);

    }

}
