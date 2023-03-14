package sum;
/*
 * 두 정수 a, b를 입력받고, a이상 b이하 수 중 다음 조건에 맞는 수들의 합을 구하는 프로그램을 작성해보세요.

6의 배수이면서, 8의 배수가 아닌 수
입력 형식
첫 번째 줄에 두 정수 a, b가 공백을 두고 주어집니다.

1 ≤ a ≤ b ≤ 100
출력 형식
첫 번째 줄에 a이상 b이하의 수 중, 문제의 조건에 맞는 수들의 합을 출력합니다.

입출력 예제
예제1
입력:

15 30
출력:

48
 */
import java.util.*;

public class Sum10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumVal = 0;
        
        for (int i = a; i < b + 1; i++) {
            if (i % 6 == 0 && i % 8 != 0) {
                sumVal += i;
            }
        }
        System.out.println(sumVal);
    }

}
