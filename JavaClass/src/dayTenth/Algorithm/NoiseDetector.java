package dayTenth.Algorithm;

import java.util.*;

public class NoiseDetector<T extends Location> {
    private List<T> locations;
    private Coordinate coordinate;
    
    public NoiseDetector(List<T> locations, Coordinate coordinate) {
        this.locations = locations;
        this.coordinate = coordinate;
    }
    // 거리 계산
    private class DistanceCalculator {
        public double calculateDistance(Location location, Coordinate coordinate) {
            int x1 = location.getX();
            int y1 = location.getY();
            int x2 = coordinate.getX();
            int y2 = coordinate.getY();
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    }
    
    public void detectNoisyLocations(double noiseLevel) {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        for (T location : locations) {
            if (distanceCalculator.calculateDistance(location, coordinate) <= noiseLevel) {
                System.out.println("noisy");
            } else {
                System.out.println("silent");
            }
        }
    }
    
}



