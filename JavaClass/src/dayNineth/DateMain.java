package dayNineth;

import java.text.*;
import java.util.*;

public class DateMain {

    public static void main(String[] args) throws ParseException {
        // 1 현재의 날짜를 Date 형으로 얻는다
        Date now = new Date(); 
        Calendar calendar = Calendar.getInstance();
        // 2 얻은 날짜정보를 Calendar 에 설정한다
        calendar.setTime(now); 
        // 3 Calendar 에서 일(day) 값을 얻는다.
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        // 4 얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다
        calendar.set(Calendar.DAY_OF_MONTH, day + 100);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        // 5 Calendar 의 날짜정보를 Date 형으로 변환한다
        Date baekDate = calendar.getTime();
        System.out.println(baekDate);
        
        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        // 6 SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다
        String string = simFormat.format(baekDate);
        System.out.println(string);

        /* 기초 14장 강의 내용*/
        // long start = System.currentTimeMillis();
        //
        // long end = System.currentTimeMillis();
        // System.out.println("처리 시간 : " + (end - start) + "ms");
        //
        // Date now = new Date();
        // System.out.println(now);
        // System.out.println(now.getTime());
        // Date past = new Date(11111111111111L);
        // System.out.println(past);
        //
        // Date now = new Date();
        // Calendar calendar = Calendar.getInstance();
        // calendar.setTime(now);
        //
        // int year = calendar.get(Calendar.YEAR);
        // System.out.println(year);
        // calendar.set(2010, 8, 22, 1, 23, 45);
        // calendar.set(Calendar.YEAR, 2011);
        // Date past = calendar.getTime();

    }

}
