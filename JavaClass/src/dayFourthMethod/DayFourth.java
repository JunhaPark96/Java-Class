package dayFourthMethod;

import java.util.*;


public class DayFourth {

    public static void hello(String name) {
        System.out.println(name + "씨 Hello");
        add(10, 20);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }


    public static String add(String x, String y) {
        String result = x + y;
        return result;
    }
    
    public static int add(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void incrementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static void main(String[] args) {
        // System.out.println(add(add(10, 20), add(20, 30)));
        // hello("dada"); // f2 문서보기 , ctrl + space 제안
        int[] array = makeArray(3);
        incrementArray(array);
        
        for (int i : array) {
            System.out.println(i);
        }
    }

}
