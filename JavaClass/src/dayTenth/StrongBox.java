package dayTenth;

import java.util.*;

public class StrongBox<T> {
    private StrongBoxLock strongBoxLock;
    private int i = 0;
    private int lockTries = 0;
    public enum StrongBoxLock {
        PADLOCK, BUTTON, DIAL, FINGER;
    }
    
    /*
     * 금고 종류 호출 
     * get()메소드 호출 시 카운트 증가 
     * 열쇠 사용횟수에 도달하기 전에는 null 리턴
     */
    
    public StrongBox(StrongBoxLock strongBoxLock) {
        this.strongBoxLock = strongBoxLock;
        
        switch (this.strongBoxLock) {
            case PADLOCK:
                this.lockTries = 1024;
                break;
            case BUTTON:
                this.lockTries = 10_000;
                break;
            case DIAL:
                this.lockTries = 30_000;
                break;
            case FINGER:
                this.lockTries = 1_000_000;
                break;
        }      
    }


    public StrongBoxLock get() {
        this.lockTries--;
        this.i++;
        if (lockTries < 0) {
            System.out.print(i + " ");
            return this.strongBoxLock;
        } else {
            return null;
        }
        
    }


    public void put(StrongBoxLock strongBoxLock) {
        this.strongBoxLock = strongBoxLock;
    }
    
    
    @Override
    public int hashCode() {
        return Objects.hash(strongBoxLock);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StrongBox other = (StrongBox) obj;
        return strongBoxLock == other.strongBoxLock;
    }
    

}
