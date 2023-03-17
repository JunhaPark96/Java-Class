package dayTenth;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        List list = new ArrayList<>();

        list.add(1);
        list.add("홍길동");
        list.add(null);
        list.add(3.0);
        list.add(true);
        
        // 개발자가 하는 캐스팅의 아주 큰 위험 요소
        System.out.println((int) list.get(0) + 10);
        System.out.println((int) list.get(1) + 10); // 배열의 1버ㄴ은 String인데 오류 표시가 안난다*/
        
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.sort(null);
        Collections.sort(list);
        System.out.println(list);
        
        Pocket<String> pocket = new Pocket<String>("박경덕");
        
    }

}
