package satisfiedAll;
/*
 * 5개의 정수가 주어졌을 때, 주어진 모든 수가 3의 배수인지 판단하는 프로그램을 작성해보세요.

입력 형식
5개의 숫자가 한 줄에 하나씩 주어집니다.

1 ≤ 주어지는 정수 ≤ 100
출력 형식
첫 번째 줄에, 모든 수가 3의 배수라면 1을, 그렇지 않다면 0을 출력합니다.

입출력 예제
예제1
입력:

3
6
9
12
15
출력:

1
예제2
입력:

4
6
9
12
15
출력:

0
 */
import java.util.*;

public class SatisfiedAll3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        boolean ans = true;
        
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n % 3 != 0) {
                ans = false;
            }
        }
        
        if (ans) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
