package infiniteLoop;
/*
 * 몇 명의 사람들의 나이가 차례대로 주어질 때, 처음으로 20대가 아닌 다른 나이대의 사람이 나오기 전까지 입력된 나이들의 평균을 구하는 프로그램을 작성해보세요.

입력 형식
각 줄마다 차례대로 나이에 해당하는 정수가 하나씩 주어집니다.

1 ≤ 주어지는 정수 ≤ 100
첫 번째 사람은 반드시 20대라고 가정해도 좋습니다.

출력 형식
첫 번째 줄에 20대가 아닌 다른 나이대의 사람이 나오기 전까지 입력된 나이들의 평균을 소수점 둘째자리까지 반올림하여 출력합니다.

입출력 예제
예제1
입력:

29
28
26
22
22
30

출력:

25.40
 */
import java.util.*;

public class InfiniteLoop6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int sumVal = 0;
        int cnt = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n / 10 != 2) {
                break;
            }
            sumVal += n;
            cnt++;
        }
        double avg = (double) sumVal / cnt;
        System.out.printf("%.2f", avg);
    }

}
