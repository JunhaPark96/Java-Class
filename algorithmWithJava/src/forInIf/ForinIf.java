package forInIf;
/**
 * 문자 c와 숫자 n을 입력받아 c가 'A'면 1부터 n까지 숫자를 증가하는 순으로 출력하고, 'D'면 n부터 1까지 숫자를 감소하는 순으로 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 문자 c와 숫자 n을 공백을 사이에 두고 입력받습니다. c는 'A' 또는 'D'로 주어진다고 가정해도 좋습니다.

1 ≤ n ≤ 10
출력 형식
모든 출력값 사이엔 공백을 두고 있습니다.

입출력 예제
예제1
입력:

A 9
출력:

1 2 3 4 5 6 7 8 9
예제2
입력:

D 7
출력:

7 6 5 4 3 2 1
 */
import java.util.*;

public class ForinIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = a; i > b - 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i > a - 1; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
