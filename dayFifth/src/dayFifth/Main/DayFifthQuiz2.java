package dayFifth.Main;

public class DayFifthQuiz2 {

    public static void main(String[] args) {
        //구구단을 작성하시오
        for (int i = 1; i < 10; i++) {
            // System.out.print(i + " * ");
            for (int j = 2; j < 10; j++) {
//                System.out.print(j + " * " + i + " = " + j * i + "\t");
                System.out.printf("%d * %d = %2d\t", j, i, j * i);
            }
            if (i != 9) {
                System.out.println();
            }
        }
    }

}
