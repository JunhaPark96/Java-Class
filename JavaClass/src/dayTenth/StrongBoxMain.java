package dayTenth;

import dayTenth.StrongBox.*;

public class StrongBoxMain {

    public static void main(String[] args) {
        StrongBox<StrongBoxLock> sbl = new StrongBox<StrongBoxLock>(StrongBoxLock.PADLOCK);
        sbl.put(StrongBoxLock.PADLOCK);
        System.out.println(sbl.get());
        for (int i = 0; i < 1027; i++) {
            System.out.println(sbl.get());
        }
//        if (sbl.equals(StrongBox.StrongBoxLock.PADLOCK)) {
//            System.out.println(sbl.get());  
//        }
        
        
//        sbl.get();
//        
//        for (StrongBoxLock type : StrongBoxLock.values()) {
//            System.out.println(type);
//        }
        
    }

}
