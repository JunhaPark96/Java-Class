package dayFourthMethod;

public class DayFourthQuiz3 {

    public static void email(String address, String title, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }

    // 오버로딩
    public static void email(String address, String text) {
//        System.out.println(address + " 에 아래의 메일을 송신한다.");
        email(address, "제목 : 제목없음", text);
//        System.out.println("제목 : 제목없음");
//        System.out.println("본문 : " + text);
    }

    public static void main(String[] args) {
        email("njk116@naver.com", "0309 자바 과제 제출합니다", "자바 알고리즘은 재미있어요");
        email("njk116@naver.com", "자바 알고리즘은 재미있어요");
    }
}
