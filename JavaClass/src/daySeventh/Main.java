package daySeventh;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "홍길동";
        person2.name = "한석봉";
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
        
        person1.age = 20;
        person2.age = 25;
        
        Map<String, Integer> people = new LinkedHashMap<>();
        people.put(person1.name, person1.age);
        people.put(person2.name, person2.age);
        
        for (String key : people.keySet()) {
            int age = people.get(key);
            System.out.printf("%s의 나이는 %d살\n", key, age);
        }
        
    }

}
