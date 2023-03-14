package star.rightTriangle;
/*
 * 정수 n이 주어졌을 때, 아래 예를 참고하여 * 로 이루어진 직각삼각형을 출력하는 프로그램을 작성해보세요.

예) n = 3 일 때

*
***
*****
예) n = 5 일 때

*
***
*****
*******
*********
입력 형식
첫 번째 줄에 n이 주어집니다.

1 ≤ n ≤ 10
출력 형식
n의 값에 따른 별표를 입출력 예제와 같이 출력합니다.

입출력 예제
예제1
입력:

5
출력:

*
***
*****
*******
*********
 */
import java.util.*;

public class Star4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


