package repeatNtime;
/**
 * 두 자연수 a, b를 입력받아 a / b 결과를 소수점 20째자리까지 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 a, b가 공백을 사이에 두고 주어집니다.

1 ≤ a, b ≤ 100
출력 형식
a / b 결과를 소수점 20째자리까지 출력합니다.

입출력 예제
예제1
입력:

3 5
출력:

0.60000000000000000000
예제2
입력:

3 7
출력:

0.42857142857142857142
 */
import java.util.*;

public class RepeatNtime3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a / b + ".");
        a %= b;
        
        for (int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a / b);
            a %= b;
        }
    }

}
