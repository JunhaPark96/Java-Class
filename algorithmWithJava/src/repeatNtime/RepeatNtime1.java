package repeatNtime;
/**
 * 문자를 입력받아서 8회 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 문자를 입력받습니다.

출력 형식
입력받은 문자를 사이에 공백없이 8회 출력합니다.

입출력 예제
예제1
입력:

G
출력:

GGGGGGGG
 */
import java.util.*;

public class RepeatNtime1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < 8; i++) {
            System.out.print(s);
        }
    }

}
