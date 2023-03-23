package dayThirteen;
import dayThirteen.PrintingThread;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("입력");
        System.out.println(Thread.currentThread().getName());
        Scanner scanner = new Scanner(System.in);
        
//        PrintingThread2 thread = new PrintingThread2();
//        thread.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("스레드 생성");
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드 생성");
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        
//        new Thread(() -> System.out.prinstln()).start();
        // 람다 변환법
        
        
        
        
        scanner.nextLine();
    }

}
