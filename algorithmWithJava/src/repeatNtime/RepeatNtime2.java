package repeatNtime;
/**
 * 정수 n의 값을 입력받고 그 값의 횟수만큼 LeebrosCode를 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 n이 주어집니다.

1 ≤ n ≤ 10
출력 형식
입력받은 값의 횟수만큼 LeebrosCode를 줄에 한 번씩 출력합니다.

입출력 예제
예제1
입력:

6
출력:

LeebrosCode
LeebrosCode
LeebrosCode
LeebrosCode
LeebrosCode
LeebrosCode
 */
import java.util.*;

public class RepeatNtime2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("LeebrosCode");
        }
    }

}
