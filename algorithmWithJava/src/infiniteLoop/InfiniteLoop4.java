package infiniteLoop;
/*
 * 어떤 수가 주어졌을 때 홀수면 아무 작업도 하지 않고, 짝수면 2로 나눈 몫을 출력하는 작업을 3번까지 반복하는 프로그램을 작성해보세요.

입력 형식
입력으로 몇 개의 수가 들어올지는 정해져 있지는 않습니다. 첫 번째 줄부터 숫자는 한 줄에 하나씩 주어집니다. 단, 주어지는 수 중 3개 이상의 짝수가 반드시 있다는 것을 가정해도 좋습니다.

1 ≤ 주어지는 수 ≤ 100
출력 형식
입력값에 해당하는 출력값을 한 줄에 하나씩 출력합니다.

입출력 예제
예제1
입력:

8
6
3
20
출력:

4
3
10
 */
import java.util.*;

public class InfiniteLoop4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                n /= 2;
                System.out.println(n);
                cnt++;
            }
            
            if (cnt == 3) {
                break;
            }
        }
    }

}
