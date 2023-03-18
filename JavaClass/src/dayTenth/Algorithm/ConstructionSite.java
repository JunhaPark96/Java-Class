package dayTenth.Algorithm;

import java.util.*;

public class ConstructionSite<T extends Location> {
    private T location;
    private int noiseLevel;
    
    
    public ConstructionSite(T location, int noiseLevel) {
        this.location = location;
        this.noiseLevel = noiseLevel;
    }
    
    public T getLocation() {
        return location;
    }
    
    public void setLocation(T location) {
        this.location = location;
    }
    
    public int getNoiseLevel() {
        return noiseLevel;
    }
    
    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }
    
//    public double calculateDistance(T location) {
//        int x = this.location.getX() - location.getX();
//        int y = this.location.getY() - location.getY();
//        return Math.sqrt(x * x + y * y);
//    }
    
    
    
    
}
