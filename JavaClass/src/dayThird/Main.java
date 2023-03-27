package dayThird;

public class Main {
    public static int[] incArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i ++) {
            sb.append("java");
        }
        String s = sb.toString();
        System.out.println(s);
        
    }

}
