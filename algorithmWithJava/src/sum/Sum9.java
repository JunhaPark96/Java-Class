package sum;
/*
 * 자연수 n을 입력받고, n개의 정수를 입력받아 합계와 평균을 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에는 자연수 n이 주어집니다.

두 번째 줄 부터는 n개의 줄에 걸쳐 정수값이 하나씩 주어집니다.

1 ≤ n ≤ 100
1 ≤ 주어지는 숫자의 범위 ≤ 1,000
출력 형식
입력받은 숫자들의 합과 평균을 사이에 공백을 두고 출력합니다. 평균은 반올림하여 소수 첫째 자리까지 출력합니다.

입출력 예제
예제1
입력:

4
25 
43 
57 
89
출력:

214 53.5
 */
import java.util.*;

public class Sum9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int sumVal = 0;
        int cnt = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            sumVal += a;
            cnt++;
        }
        double avg = (double) sumVal / cnt;
        System.out.printf("%d %.1f", sumVal, avg);
    }

}
