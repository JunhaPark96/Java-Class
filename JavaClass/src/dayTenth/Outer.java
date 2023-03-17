package dayTenth;

public class Outer {
    int i = 0;
    
    void something() {
        new Inner().something();
    }
    // Outer의 something 메소드와 Inner의 something 메소드는 서로 참조하며 순환하는 상태 -> 의존관계가 역전되는 문제 
    // -> garbage collector가 지우지 않는다
    // -> 새로운 객체를 추가했을 때에 오류 가능성
    static class Inner{
        void something() {
            int i = 10;
        }
    }
}
