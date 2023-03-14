package doNotKnowLoop;
/*
 * 
자연수 n이 주어집니다. n에서 시작하여 n이 짝수면 2로 나누고, n이 홀수면 3을 곱하고 1을 더하는 것을 n이 1이 되기 전까지 계속 반복하려고 합니다. 총 몇 번을 반복해야 1이 되는지를 계산하는 프로그램을 작성해보세요.

예를 들어 n = 3인 경우 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 순서로 1이 되므로 답이 7이 됩니다.

입력 형식
첫 번째 줄에 n이 주어집니다.

1 ≤ n ≤ 100
출력 형식
n이 1이 되기 위해서는 몇 번의 과정을 거쳐야 하는지를 출력합니다.

입출력 예제
예제1
입력:

3
출력:

7
예제2
입력:

1
출력:

0
 */
import java.util.*;

public class DoNotKnowLoop1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        
        int n = scanner.nextInt();
        while (true) {
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            cnt++;
        }
        
        System.out.println(cnt);
    }

}
