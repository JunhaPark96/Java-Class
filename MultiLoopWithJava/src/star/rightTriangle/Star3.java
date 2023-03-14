package star.rightTriangle;
/*
 * 정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.

예)

n에 2를 입력받는 경우

** **
*
n에 3을 입력받는 경우

*** *** ***
** ** 
*
입력 형식
첫 번째 줄에 n이 주어집니다.

1 ≤ n ≤ 10
출력 형식
주어지는 n의 값에 따른 별표를 입출력 예제와 같이 출력합니다.

입출력 예제
예제1
입력:

4
출력:

**** **** **** ****
*** *** ***        
** **
*정수 n의 값을 입력받아 별표를 출력하는 프로그램을 아래 예를 참고하여 작성해보세요.

예)

n에 2를 입력받는 경우

** **
*
n에 3을 입력받는 경우

*** *** ***
** ** 
*
입력 형식
첫 번째 줄에 n이 주어집니다.

1 ≤ n ≤ 10
출력 형식
주어지는 n의 값에 따른 별표를 입출력 예제와 같이 출력합니다.

입출력 예제
예제1
입력:

4
출력:

**** **** **** ****
*** *** ***        
** **
*
 */
import java.util.*;

public class Star3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                for (int k = i; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
