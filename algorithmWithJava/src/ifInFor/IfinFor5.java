package ifInFor;
/*
 * n개의 정수가 주어졌을 때, 주어진 숫자 중 홀수이면서 3의 배수인 수들만 순서대로 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 n이 주어집니다.

두 번째 줄부터 n개의 줄에 걸쳐 한 줄에 정수가 하나씩 주어집니다.

1 ≤ n ≤ 10

1 ≤ 주어지는 정수 ≤ 100

출력 형식
주어진 숫자 중 홀수이면서 3의 배수인 수들을 주어진 순서대로 한 줄에 하나씩 출력합니다.

입출력 예제
예제1
입력:

5
2
7
3
9
4
출력:

3
9
 */
import java.util.*;

public class IfinFor5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a % 2 != 0 && a % 3 == 0) {
                System.out.println(a);
            }
        }

    }

}
