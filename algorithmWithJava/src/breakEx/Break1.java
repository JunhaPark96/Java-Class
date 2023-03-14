package breakEx;
/**
 * 정수 n이 주어졌을 때, 1부터 차례대로 100까지 1씩 증가시키며 합을 구하다가 처음으로 그 합이 n 이상이 되는 순간에 더해진 숫자가 무엇인지를 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 5,000
출력 형식
첫 번째 줄에는 1부터 증가시키며 더한 값이 n 이상이 되는 순간 더해진 숫자를 출력합니다.

입출력 예제
예제1
입력:

5
출력:

3
 */
import java.util.*;

public class Break1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
            if (result >= n) {
                System.out.println(result);
                break;
            }
        }
    }

}
