package satisfiedAll;
/*
 * 정수 a, b가 주어지면, a이상 b이하에 c의 배수가 전혀 없는지 판단하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 a, b, c가 공백을 사이에 두고 주어집니다.

1 ≤ a, b, c ≤ 100
a ≤ b
출력 형식
a이상 b이하에 c의 배수가 없다면 YES를, 있다면 NO를 출력해보세요.

입출력 예제
예제1
입력:

5 15 16
출력:

YES
예제2
입력:

3 20 5
출력:

NO
 */
import java.util.*;

public class SatisfiedAll1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        boolean ans = true;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                ans = false;
            }
        }
        if (ans == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}
