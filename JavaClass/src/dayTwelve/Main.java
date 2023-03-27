package dayTwelve;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    interface MyFunction{
        int call(int a, int b);
    }
    
    public static int add (int x, int y) {
        return x + y;
    }
    
    
    public static void main(String[] args) {
//        IntBinaryOperator func = Main::add; // Main에 있는 add함수를 의미
        
//        int result = func.applyAsInt(5, 3);
//        System.out.println(result);
        
        MyFunction func = Main::add;
        int result = func.call(5, 3);
        System.out.println(result);
//        
//        MyFunction addFunction = (a,  b) -> {
//            return a + b;
//        };
//        
//        int ans = addFunction.call(5, 3);
//        System.out.println(ans);
//        List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        
//        for (int i = 0; i < lists.size(); i++) {
//            if (lists.get(i) % 2 == 0) {
//                System.out.println(lists.get(i) + 1);
//            }
//        }
//        
//        // filter는 리턴이 항상 stream임
//        lists.stream()
//        .filter((list) -> list % 2 == 0) // 거르기 2, 4
//        .map((list) -> list + "번") // String으로 변환 "2번, 4번" List<String>
//        .forEach(list -> System.out.println(list + 1)); // "2번" + "1" ..
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//        
//        list.stream().forEach(i -> System.out.println(i));
//        list.stream().forEach(System.out::println);
        
        List<String> names = new ArrayList<>(); 
        names.add("박경덕");
        names.add("박준하");
        names.add("이동학");
        names.add("박태현");
        
//        List<String> parks = new getParkList(names);
//        System.out.println(parks);
    }
    
    public static List<String> getParkList(List<String> names){
        List<String> results = new ArrayList<>();
        
        // 기존 배운 코드
//        for (String name : names) {
//            if (name.startsWith("박")) {
//                results.add(name);
//            }
//        }
        
        return names.stream()
                .filter(name -> name.startsWith("박"))
                .collect(Collectors.toList());
    }

}
