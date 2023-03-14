package whileLoop;
/**
 * while문을 사용해 1부터 정수 n까지의 3의 배수를 모두 출력하는 프로그램을 작성해보세요

입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 100
출력 형식
첫 번째 줄에 1부터 n까지의 3의 배수를 공백을 사이에 두고 모두 출력합니다.

입출력 예제
예제1
입력:

27
출력:

3 6 9 12 15 18 21 24 27
 */
import java.util.*;

public class WhileLoop5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i < n + 1) {
            if (i % 3 == 0) {
                System.out.print(i + " ");                
            }
            i++;
        }
    }

}
