package doNotKnowLoop;
/*
 * 정수 a의 값에 따라 다음과 같은 연산을 진행할 때, n 번의 연산을 했을 때 처음으로1,000 이상이 된다고 합니다. n의 값을 구해보는 프로그램을 작성해보세요.

a가 짝수일 때, a에 3을 곱하고 1을 더합니다.

a가 홀수일 때, a에 2를 곱하고 2를 더합니다.

입력 형식
첫 번째 줄에 정수 a가 주어집니다.

1 ≤ a ≤ 100
출력 형식
첫 번째 줄에 n의 값을 출력합니다.

입출력 예제
예제1
입력:

50
출력:

4
 */
import java.util.*;

public class DoNotKnowLoop7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int n = scanner.nextInt();
        
        while (true) {
            if (n >= 1000) {
                break;
            }
            if (n % 2 == 0) {
                n = n * 3 + 1;
            } else {
                n = n * 2 + 2;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
