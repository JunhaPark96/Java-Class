package breakEx;
/*
 * 정수 n이 주어졌을 때, n을 차례대로 1, 2, 3, ... 으로 나누었을 때 1 이하가 되는 순간까지 나눗셈을 진행한 총 횟수를 구하는 프로그램을 작성해보세요.

단, 나눗셈 진행시 각 나눗셈 연산에서 몫을 저장합니다.

입력 형식
첫 번째 줄에 정수 n이 주어집니다.

2 ≤ n ≤ 5000
출력 형식
첫 번째 줄에 1 이하가 되는 순간까지 나눗셈을 진행한 총 횟수를 출력합니다.

입출력 예제
예제1
입력:

50
출력:

5
예제 설명
다음 순서대로 진행됩니다.

50 / 1 = 50

50 / 2 = 25

25 / 3 = 8

8 / 4 = 2

2 / 5 = 0

2을 5로 나누었을 때 답이 0으로 1 이하가 되는 순간이므로, 이 때까지 나눗셈을 진행한 총 횟수인 5를 출력합니다.
 */
import java.util.*;

public class Break5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i < 5000; i++) {
            cnt++;
            n /= i;
            if (n <= 1) {
                break;
            }
        }
        System.out.println(cnt);

    }

}
