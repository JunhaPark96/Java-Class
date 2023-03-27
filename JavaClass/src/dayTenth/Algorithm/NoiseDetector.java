package dayTenth.Algorithm;

import java.util.*;

public class NoiseDetector {
    private List<Tree> locations;
//    private Location constructionSiteLocation;
    private ConstructionSite<Location> constructionSite;
    
    public NoiseDetector(List<Tree> locations, ConstructionSite<Location> constructionSite) {
        this.locations = locations;
        this.constructionSite = constructionSite;
    }
    
    public void detectNoise() {
        for (Tree tree : locations) {
            if (isNoisy(tree.getLocation())) {
                System.out.println("noisy");
            } else {
                System.out.println("silent");
            }
        }
    }
    
    // 거리 계산

    // static 붙여주자. 순환의 오류가 생길 수 있다
    private static class DistanceCalculator {
        public double calculateDistance(Location location1, Location location2) {
            int x1 = location1.getX();
            int y1 = location2.getY();
            int x2 = location2.getX();
            int y2 = location2.getY();
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    }
    // 판별
    private boolean isNoisy(Location location) {
        DistanceCalculator calculator = new DistanceCalculator();
        double distance = calculator.calculateDistance(constructionSite.getLocation(), location);
        return distance <= constructionSite.getNoiseLevel();
    }

    @Override
    public String toString() {
        return "NoiseDetector [locations=" + locations + ", constructionSite=" + constructionSite
                + "]";
    }
    
//    public void detectNoisyLocations(int noiseLevel) {
//        ConstructionSite<Coordinate> constructionSite = new ConstructionSite<Coordinate>(constructionSite, noiseLevel);
//        DistanceCalculator distanceCalculator = new DistanceCalculator();
//        for (T location : locations) {
//            if (distanceCalculator.calculateDistance(location, constructionSite.getLocation()) <= constructionSite.getNoiseLevel()) {
//                System.out.println("noisy");
//            } else {
//                System.out.println("silent");
//            }
//        }
//    }

    
}



