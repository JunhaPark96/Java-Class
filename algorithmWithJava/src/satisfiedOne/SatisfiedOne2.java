package satisfiedOne;
/*
 * 정수 n의 값이 주어지면 n이 합성수인지 아닌지 판별하는 프로그램을 작성해보세요. 합성수란, 1보다 큰 자연수 중 소수가 아닌 수 입니다.

입력 형식
첫 번째 줄에 n이 주어집니다.

2 ≤ n ≤ 500
출력 형식
주어진 정수 n이 합성수면 첫번째 줄에 'C', 아니라면 'N'을 출력합니다.

입출력 예제
예제1
입력:

6
출력:

C
예제2
입력:

13
출력:

N
 */
import java.util.*;

public class SatisfiedOne2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean ans = false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ans = !ans;
                break;      // break를 안걸어주면 ans의 값이 true false 계속 바뀌면서 오답이 나올 수 있음
            }
        }
        if (ans) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
    }

}
