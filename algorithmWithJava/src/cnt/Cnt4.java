package cnt;

import java.util.*;

/*
 * if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){ System.out.print("true"); } else{
 * System.out.print("false"); }
 */
public class Cnt4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
/*
 * n이 주어지면 1년부터 n년까지 윤년이 총 몇 번 있었는지를 구하는 프로그램을 작성해보세요. 윤년일 조건은 다음과 같습니다.

4의 배수라면 윤년입니다.
4의 배수이면서 100의 배수라면 윤년이 아닙니다.
4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년입니다.
나머지 경우에는 윤년이 아닙니다.
입력 형식
첫 번째 줄에 n의 값이 주어집니다.

1 ≤ n ≤ 2021
출력 형식
윤년의 수를 출력합니다.

입출력 예제
예제1
입력:

100
출력:

24
예제2
입력:

1000
출력:

242*/
