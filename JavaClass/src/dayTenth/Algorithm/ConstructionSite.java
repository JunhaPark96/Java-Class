package dayTenth.Algorithm;

import java.util.*;

public class ConstructionSite<T extends Location> {
    private T location;
    private int noiseLevel;
//    private Coordinate coordinate;
    
    
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
    
//    public Coordinate getCoordinate() {
//        return coordinate;
//    }
    
    @Override
    public String toString() {
        return "ConstructionSite [location=" + location + ", noiseLevel=" + noiseLevel + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, noiseLevel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConstructionSite other = (ConstructionSite) obj;
        return Objects.equals(location, other.location) && noiseLevel == other.noiseLevel;
    }
    
//    public double calculateDistance(T location) {
//        int x = this.location.getX() - location.getX();
//        int y = this.location.getY() - location.getY();
//        return Math.sqrt(x * x + y * y);
//    }
    
    
    
    
}
