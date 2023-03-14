package continueEx;
/*
 * 정수 a 를 입력받아 1부터 a까지의 수 중 다음 조건을 모두 만족하지 않는 수들을 모두 출력하는 프로그램을 작성해보세요.

짝수이면서 4의 배수가 아닌 수

8로 나눈 몫이 짝수인 수

7로 나눈 나머지가 4보다 작은 수

입력 형식
첫 번째 줄에 정수 a가 공백을 두고 주어집니다.

1 ≤ a ≤ 100
출력 형식
첫 번째 줄에 1부터 a까지의 수 중 문제의 조건을 모두 만족하지 않는 수들을 공백을 사이에 두고 오름차순으로 출력합니다.

입출력 예제
예제1
입력:

40
출력:

11 12 13 25 27 40 
 */
import java.util.*;

public class Continue4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                continue;
            } else if ((i / 8) % 2 == 0) {
                continue;
            } else if ((i % 7) < 4) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

}
