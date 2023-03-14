package satisfiedOne;
/*
 * 정수 a, b가 주어지면, a이상 b이하의 수 중에서 1,920과 2,880의 공약수가 존재하는지 판단해보는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 두 정수a, b가 공백을 사이에 두고 주어집니다.

1 ≤ a ≤ b ≤ 1,000
출력 형식
첫 번째 줄에, 공약수가 존재한다면 1을, 존재하지 않는다면 0을 출력합니다.

입출력 예제
예제1
입력:

12 14
출력:

1
예제2
입력:

42 45
출력:

0
 */
import java.util.*;

public class SatisfiedOne3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean ans = false;
        
        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                ans = true;
                break;
            }
        }
        
        if (ans) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
