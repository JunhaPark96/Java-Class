package infiniteLoop;

import java.util.*;

public class InfiniteLoop1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(n);

        }
    }

}
