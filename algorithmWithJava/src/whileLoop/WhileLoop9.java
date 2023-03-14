package whileLoop;
/**
 * 두 정수 b와 a가 주어지면 a이상 b이하의 짝수를 모두 내림차순으로 출력하는 프로그램을 작성해보세요.

단, while문을 사용하여 해결해봅니다.

입력 형식
첫 번째 줄에 정수 b와 a가 공백을 두고 주어집니다.

1 ≤ a ≤ b ≤ 50, a, b는 짝수
출력 형식
첫 번째 줄에 a부터 b까지의 자연수중 짝수들만 공백을 두고 내림차순으로 출력합니다.

입출력 예제
예제1
입력:

20 10
출력:

20 18 16 14 12 10
 */
import java.util.*;

public class WhileLoop9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        int i = b;
        while (i > a - 1) {
            System.out.print(i + " ");
            i -= 2;
        }
    }

}
