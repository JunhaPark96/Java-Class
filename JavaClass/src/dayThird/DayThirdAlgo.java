package dayThird;

import java.util.*;

public class DayThirdAlgo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] name = new String[n];
        // n번 이름 입력
        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();

        }
        String sumName = String.join(",", name);
        System.out.println("Hello " + sumName + ".");

        scanner.close();
    }

}
