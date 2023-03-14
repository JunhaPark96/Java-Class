package sum;
/*
 * 두 개의 정수 a, b를 입력받아 a부터 b까지의 수 중 5 또는 7의 배수들의 합과 평균을 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.

1 ≤ a
a + 5 ≤ b ≤ 100
출력 형식
5와 7의 배수들의 합과 평균을 공백을 두고 출력합니다.

평균은 반올림하여 소수 첫째 자리까지 출력합니다.

입출력 예제
예제1
입력:

4 21
출력:

92 13.1
예제 설명
첫 번째 예제에서는 4에서 21까지 중 5 또는 7의 배수들의 합과 평균을 구해야 합니다. 5와 7의 배수들의 합은 5 + 7 + 10 + 14 + 15 + 20 + 21 = 92이고, 평균은 92 / 7 ≈ 13.1입니다.
 */
import java.util.*;

public class Sum4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumVal = 0;
        int cnt = 0;
        for (int i = a; i < b + 1; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal += i;
                cnt++;
            }
        }
        double avg = (double) sumVal / cnt;
        System.out.printf("%d %.1f", sumVal, avg);
    }

}
