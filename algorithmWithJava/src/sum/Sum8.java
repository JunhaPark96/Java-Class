package sum;
/*
 * 숫자 n이 주어졌을 때, n이 완전수인지 판단하는 프로그램을 작성해보세요. 완전수란 자기 자신을 제외한 약수의 합이 자신이 되는 수를 나타냅니다. 예를 들어 6의 경우 1 + 2 + 3 = 6 이기 때문에 완전수입니다.

입력 형식
첫 번째 줄에는 정수 n이 주어집니다.

1 ≤ n ≤ 1,000
출력 형식
주어진 n이 완전수인 경우에는 P, 아닌경우에는 N을 출력합니다.

입출력 예제
예제1
입력:

6
출력:

P
예제2
입력:

15
출력:

N
 */
import java.util.*;

public class Sum8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int sumVal = 0;
        int cnt = 0;
        int n = scanner.nextInt();
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumVal += i;
            }
        }
        if (sumVal == n) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }

    }

}
