package whileLoop;
/**
 * 정수 a, b이 주어졌을 때, a부터 b까지의 자연수중 짝수만 출력하는 프로그램을 작성해보세요.

단, while문을 사용하여 해결해봅니다.

입력 형식
첫 번째 줄에 정수 a와 b가 공백을 두고 주어집니다.

1 ≤ a ≤ b ≤ 50, a, b는 짝수
출력 형식
첫 번째 줄에 a부터 b까지의 자연수중 짝수들만 공백을 두고 오름차순으로 출력합니다.

입출력 예제
예제1
입력:

10 20
출력:

10 12 14 16 18 20
 */
import java.util.*;

public class WhileLoop6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while (a < b + 1) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }

}
