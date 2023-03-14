package repeatNtime;
/**
 * 정수 a, n이 주어졌을 때, a에 n을 더하는 과정을 n번 반복하려고 합니다.

각 연산 결과값을 순서대로 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 a, n 가 공백을 두고 주어집니다.

1 ≤ a, n ≤ 10
출력 형식
첫 번째 줄부터 n개의 줄에 걸쳐, a에 n을 더한 결과값을 한 줄에 하나씩 출력합니다.

입출력 예제
예제1
입력:

5 6
출력:

11
17
23
29
35
41
 */
import java.util.*;

public class RepeatNtime4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = a + b;
        for (int i = 0; i < b; i++) {
            System.out.println(ans);
            ans += b;
        }
    }

}
