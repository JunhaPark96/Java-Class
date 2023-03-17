package dayNineth;

import java.util.*;
import daySixth.Game.*;

class StudentIdAsecComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class StudentIdDescComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return -Integer.compare(o1.getId(), o2.getId());
    }
}

class StudentNameAsecComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main {

    public static void main(String[] args) {
        /*
         * 1 X obj = new A(); 로 A인스턴스를 생성한 후, 변수 obj에서 호출할 수 있는 메소드를 a(), b(), c() 중에 골라보시오
         */
        // X obj = new A();
        // obj = new B();
        // System.out.println(obj);
        // 1 결과: obj에서 호출할 수 있는 메소드는 a(), 출력: "Aa"
        // 1 이유: 상속한 Y에서 구현한 X의 추상메소드가 void a()이기 때문
        // 추가내용: obj변수에 B객체를 대입해도 a메소드만 호출 가능. 출력은 "Ba"

        /*
         * 2 Y y1 = new A(); Y y2 = new B(); 로 A와 B의 인스턴스를 생성한 후 y1.a(); y2.a(); 를 실행했을 때에 화면에 표시되는
         * 내용을 말하시오
         */

        // Y y1 = new A();
        // Y y2 = new B();
        // y1.a();
        // y2.a();

        /*
         * 2. 결과: y1.a(): "Aa", y2.a(): "Bb" 2. 이유: 상위 추상클래스 Y를 다운캐스팅하였고, Y는 인터페이스 X를 구현하였다. X의
         * 추상메소드 void a() -> Y의 추상메소드 public abstract void a(); -> 각 A, B에 대한 오버라이드 void a() 실행
         */


        /*
         * 문제 13-2 에서 이용한 A클래스나 B클래스의 인스턴스를 각각 1개씩 생성하여, 요소의 수가 2개인 1차원 배열에 차례로 담는다. 그 후에 배열의 요소를
         * 루프로 차례대로 꺼내 각각의 인스턴스의 b() 메소드를 호출 하여야 한다. 이상을 전제로 다음 물음에 답하시오. 배열변수의 타입으로 무엇을 사용하여야 하는가
         * 위에서 설명하고 있는 프로그램을 작성하시오
         */

        List<Y> classes = new ArrayList<>();
        A a = new A();
        B b = new B();
        classes.add(a);
        classes.add(b);

        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).b();
        }

        /*
         * 3. 결과: Y를 배열변수 타입으로 한 결과 "Ab", "Bb" 3. 이유: Y에 공통된 추상메소드 b()가 있으니까. 만약 X로 타입을 넣으면 b() 메소드가
         * 없기 때문에 오류가난다
         */


        // Set<Student> 장학생명부 = new HashSet<>();

        // Student 반장 = new Student();
        // 반장.setName("홍길동");
        // 장학생명부.add(반장);
        // System.out.println(장학생명부);
        // 반장 = new Student();
        // 반장.setName("홍길동");
        // 장학생명부.add(반장);
        // 장학생명부.remove(반장);
        // System.out.println(장학생명부);

        // List<String> strs = new ArrayList<>();
        // strs.add("이동학");
        // strs.add("박경덕");
        // strs.add("강태근");
        // strs.add("최유림");
        //
        // Collections.sort(strs);
        // System.out.println(strs);
        //
        // List<Integer> ints = new ArrayList<>();
        // ints.add(5);
        // ints.add(4);
        // ints.add(10);
        // ints.add(1);
        //
        // Collections.sort(ints);
        // System.out.println(ints);
        //
        List<Student> students = new ArrayList<>();

        students.add(new Student(0, "이동학"));
        students.add(new Student(2, "강태근"));
        students.add(new Student(3, "최유림"));
        students.add(new Student(1, "박경덕"));
        
        students.sort(new StudentIdDescComparator());
        
        Asset asset = new Asset() {}; // 추상클래스인데 new하면서 완성할 목적
        
        // 메소드 호출 중에 새로운 클래스를 생성하여 사용
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        System.out.println(students);
        

    }

}
