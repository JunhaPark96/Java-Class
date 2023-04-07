package daySeventh;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 20);
        Person person2 = new Person("한석봉", 19);
        
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
/*
        ArrayList<String> names = new ArrayList<String>();
        names.add(person1.name);
        names.add(person2.name);
        
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }*/
        
        
//        Map<String, Integer> people = new LinkedHashMap<>();
//        people.put(person1.name, person1.age);
//        people.put(person2.name, person2.age);
//        
//        for (String key : people.keySet()) {
//            int age = people.get(key);
//            System.out.printf("%s의 나이는 %d살\n", key, age);
//        }
    }

}
