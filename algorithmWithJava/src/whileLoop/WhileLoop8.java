package whileLoop;
/**
 * 자연수 n을 입력받아 while문을 사용하여 n부터 1까지 숫자를 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 50
출력 형식
첫 번째 줄에 n부터 1까지의 숫자를 순서대로 공백을 사이에 두고 출력합니다.

입출력 예제
예제1
입력:

10
출력:

10 9 8 7 6 5 4 3 2 1
 */
import java.util.*;

public class WhileLoop8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        while(a > 0) {
            System.out.print(a + " ");
            a--;
        }
        
        
    }

}
