package DayFourthMethod;

public class DayFourthSelf {

    public static void summ(String s, String... str) {
        for (String a : str)
            System.out.print(a + s);
    }
//    public static void printNames(String... names) {
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
    
    public static void print(String s) {
        System.out.println("String: " + s);
    }
    
//    public static void print(String s1, String s2) {
//        System.out.println("String: " + s1);
//        System.out.println("String: " + s2);
//    }
    
    public static void print(String... strings) {
        System.out.println("String: " + strings);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        summ("-", "a", "b", "c");
//        printNames("Alice", "Bob", "Charlie");
        String[] strings = {"Hello", "world"};
        print(strings);
    }

}
