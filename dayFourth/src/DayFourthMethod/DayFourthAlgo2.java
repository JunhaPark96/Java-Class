package DayFourthMethod;

import java.util.*;

public class DayFourthAlgo2 {

    public static int[] sequence(int m, int n) {
        int[] ans = new int[10];

        for (int i = 0; i < ans.length; i++) {
            // ans[i] += ans[i - 1] + n;
            ans[i] += m + (i * n);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int answer[] = sequence(num1, num2);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
            if (i == answer.length - 1) {
                System.out.println(answer[i]);
            }
        }
        // Scanner scanner = new Scanner(System.in);
        // int[] answer = sequence(scanner.nextInt(), scanner.nextInt());
        // System.out.println(Arrays.toString(answer));
        // scanner.close();
        // scanner.close();

        // public static String sequence(int a, int d) {
        // int n = 10; // 출력할 항의 개수
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < n; i++) {
        // int num = a + (i * d);
        // sb.append(num);
        // if (i != n - 1) {
        // sb.append(" ");
        // }
        // }
        // return sb.toString();
        // }
        //
        // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // int d = scanner.nextInt();
        //
        // String result = sequence(a, d);
        // System.out.println(result);
        //
        // scanner.close();
    }
}

