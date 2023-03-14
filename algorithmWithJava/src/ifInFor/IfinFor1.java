package ifInFor;

import java.util.*;

public class IfinFor1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

    }

}
