package quiz1;

import java.util.*;

public class quiz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String sumName = "";
        // n번 이름 입력
        for (int i = 0; i < n; i++) {
            String name = sc.next();

            if (i == (n - 1)) {
                sumName += name + ".";
            } else {
                sumName += name + ",";
            }
        }
        System.out.println("Hello " + sumName);


        sc.close();
    }

}

