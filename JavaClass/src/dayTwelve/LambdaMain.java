package dayTwelve;

interface Func1 {
    boolean odd(int n);
}


interface Func2 {
    String onesName(boolean g, String s);
}


public class LambdaMain {

//    public static boolean isOdd(int n) {
//        return n % 2 == 1;
//    }

//    public static String addNamePrefix(boolean male, String name) {
//        if (male == true) {
//            return "Mr." + name;
//        }
//        return "Ms." + name;
//    }


    public static void main(String[] args) {
        // // 1
        // Func1 isOdd = LambdaMain::isOdd;
        //
        // boolean result = isOdd.odd(5);
        // System.out.println(result);
        //
        // // 2
        // Func2 whosName = LambdaMain::addNamePrefix;
        // String name = whosName.onesName(true, "Park");
        // System.out.println(name);

        Func1 isOdd = (int n) -> {
            return n % 2 == 1;
        };
        boolean result = isOdd.odd(5);
        System.out.println(result);
                
        Func2 whosName = (boolean male, String name) -> {
            if (male == true) {
                return "Mr." + name;
            }
            return "Ms." + name;
        };
        
        String name = whosName.onesName(false, "성춘향");
        System.out.println(name);
    }

}
