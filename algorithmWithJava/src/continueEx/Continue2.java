package continueEx;
/*
 * 1이상 n이하의 수 중 온전수를 출력하는 프로그램을 작성해보세요.

온전수란 다음 조건을 모두 만족하지 않는 수를 뜻합니다.

2로 나누어 떨어지는 경우
일의 자리가 5인 경우
3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수
입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 200
출력 형식
첫 번째 줄에 조건을 만족하는 온전수를 공백을 사이에두고 출력합니다.

입출력 예제
예제1
입력:

9
출력:

1 7 9
 */
import java.util.*;

public class Continue2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        
        for (int i = 1; i <= n; i ++) {
            if (i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

}
