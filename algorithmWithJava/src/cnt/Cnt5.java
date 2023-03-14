package cnt;

import java.util.*;

public class Cnt5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
/*
 * 5개의 숫자가 주어졌을 때, 짝수가 몇 번 등장했는지 확인해보는 프로그램을 작성해보세요.

입력 형식
5개의 숫자가 한 줄에 하나씩 주어집니다.

1 ≤ 주어지는 정수 ≤ 1,000
출력 형식
첫 번째 줄에 짝수가 등장한 횟수를 출력합니다.

입출력 예제
예제1
입력:

124
341
547
56
23
출력:

2*/
