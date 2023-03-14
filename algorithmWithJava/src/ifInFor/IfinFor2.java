package ifInFor;
/*
 * 시험점수에 따라 등급을

90점 이상을 A,

80점 이상을 B,

70점 이상을 C,

60점 이상을 D,

60점 미만을 F 라고 합니다.

주어지는 점수 n부터 100점까지 1점씩 증가하며 각 점수에 해당하는 등급을 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 n의 값이 주어집니다.

0 ≤ n ≤ 100
출력 형식
첫 번째 줄에 주어지는 점수 n부터 100점까지 각 시험 등급을 순서대로 공백을 사이에 두고 출력합니다.

입출력 예제
예제1
입력:

85
출력:

B B B B B A A A A A A A A A A A
 */
import java.util.*;

public class IfinFor2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = n; i < 101; i++) {
            if (i >= 90) {
                System.out.print("A" + " ");
            } else if (i >= 80) {
                System.out.print("B ");
            } else if (i >= 70) {
                System.out.print("C ");
            } else if (i >= 60) {
                System.out.print("D ");
            } else {
                System.out.print("F");
            }
        }
    }

}
