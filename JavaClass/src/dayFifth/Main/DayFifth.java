package dayFifth.Main;

import java.util.*;
import dayFifth.Calc.*;

public class DayFifth {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int total = CalcLogic.add(a, b);
        int delta = CalcLogic.minus(a, b);
    
        int[] heights = {1, 3, 1, 10, 5};
        Arrays.sort(heights);
        
        for (int height : heights) {
            System.out.println(height);
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i]);
        }
    }
}
