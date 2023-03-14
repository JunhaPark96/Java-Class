package cnt;
/*
 * 0일을 기점으로 2일마다 교실 청소를, 3일마다 복도 청소를, 12일마다 화장실 청소를 합니다. 날짜가 겹치는 날에는 주기가 더 긴 것을 하기로 했습니다. n일간 진행했을 때 각 장소의 청소 횟수를 차례로 출력하는 프로그램을 작성해주세요. 단, 시작 날인 0일에는 청소를 진행하지 않습니다.

입력 형식
첫 번째 줄에 정수 n이 주어집니다.

1 ≤ n ≤ 1,000
출력 형식
교실 청소 횟수, 복도 청소 횟수, 화장실 청소의 횟수를 차례로 공백을 사이에 두고 출력합니다.

입출력 예제
예제1
입력:

11
출력:

4 3 0
예제2
입력:

24
출력:

8 6 2
 */
import java.util.*;

public class Cnt3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt12 = 0;
        
        for (int i = 1; i < n + 1; i++) {
            if (i % 12 == 0) {
                cnt12++;
            } else if (i % 3 == 0) {
                cnt3++;
            } else if (i % 2 == 0){
                cnt2++;
            }
        }
        System.out.println(cnt2 + " " + cnt3 + " " + cnt12);
    }

}
