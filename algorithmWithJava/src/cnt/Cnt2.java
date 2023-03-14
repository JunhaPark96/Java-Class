package cnt;
/*
 * 10개의 숫자가 주어졌을 때, 3의 배수의 개수와 5의 배수의 개수를 출력하는 프로그램을 작성해보세요.

입력 형식
입력으로 10개의 숫자가 한 줄에 하나씩 주어집니다.

1 ≤ 주어지는 수 ≤ 100
출력 형식
첫 번째 줄에 3과 5의 배수의 개수를 공백을 사이에 두고 출력합니다.

입출력 예제
예제1
입력:

7 
42 
10 
54 
34 
55 
57 
60 
30 
50
출력:

5 5
 */
import java.util.*;

public class Cnt2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            if (n % 3 == 0) {
                cnt1++;
            }
            if (n % 5 == 0) {
                cnt2++;
            }
        }
        System.out.println(cnt1 + " " + cnt2);

    }

}
