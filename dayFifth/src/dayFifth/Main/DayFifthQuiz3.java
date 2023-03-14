package dayFifth.Main;

public class DayFifthQuiz3 {

    public static void main(String[] args) {
        // 전자시계 프로그램을 작성하시오
        for (int i = 0; i < 60; i++) {
            for (int j = 1; j < 13; j++) {
                System.out.printf("%d:%02d ", j, i);
            }
            if (i != 59) {
                System.out.println();
            }

        }
    }

}
