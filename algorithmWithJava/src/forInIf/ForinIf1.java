package forInIf;
/**
 * 두 개의 정수a, b를 입력받아 큰 수부터 작은 수까지 차례대로 출력하는 프로그램을 작성해보세요.

입력 형식
정수 a, b를 공백을 사이에 두고 주어집니다.

1 ≤ a, b ≤ 50
출력 형식
a, b중 큰 수에서 작은 수까지 차례로 1씩 감소하며 공백을 사이에 두고 출력합니다.

입출력 예제
예제1
입력:

22 31
출력:

31 30 29 28 27 26 25 24 23 22
 */
import java.util.*;

public class ForinIf1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        int n = scanner.nextInt();
        
        if (c.equals("A")) {
            for (int i = 0; i < n; i++) {
                System.out.print(i + 1 + " ");
            } 
        } else {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
