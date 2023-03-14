package sum;
/*
 * 10개의 정수가 주어집니다. 입력으로 주어지는 수들 중 0이상 200이하의 정수들의 합과 평균을 출력하는 프로그램을 작성해보세요.

입력 형식
10개의 정수가 한 줄에 하나씩 주어집니다. 단, 0이상 200이하의 수가 반드시 한 번 이상 주어진다고 가정해도 좋습니다.

-500 ≤ 입력으로 주어지는 수 ≤ 500
출력 형식
합과 평균을 공백을 사이에 두고 차례로 출력합니다. 평균은 반올림하여 소수 첫째자리까지 출력합니다.

입출력 예제
예제1
입력:

-100
80 
135 
103 
5 
205 
45 
66
50
-5
출력:

484 69.1
 */
import java.util.*;

public class Sum7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int sumVal = 0;
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            if (a >= 0 && a <= 200) {
                sumVal += a;
                cnt++;
            }
        }
        double avg = (double) sumVal / cnt; 
        System.out.printf("%d %.1f", sumVal, avg);
    }

}
