package satisfiedAll;
/*
 * 소수는 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수입니다. 숫자 n이 주어졌을 때, n이 소수인지 판단하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에는 숫자 n이 주어집니다.

2 ≤ n ≤ 1,000
출력 형식
주어진 n이 소수인 경우에는 P, 아닌경우에는 C을 출력합니다.

입출력 예제
예제1
입력:

5
출력:

P
예제2
입력:

14
출력:

C
 */
import java.util.*;

public class SatisfiedAll2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        boolean ans = true;
        int n = scanner.nextInt();
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ans = !ans;
                break;
            }
        }
        
        if (ans) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }

    }

}
