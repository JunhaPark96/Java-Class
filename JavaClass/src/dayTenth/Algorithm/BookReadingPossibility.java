// 만들다 폐기
//package dayTenth.Algorithm;
//
//public class BookReadingPossibility<T extends Location>{
//    private ConstructionSite<T> constructionSite;
//
//    public BookReadingPossibility(ConstructionSite<T> constructionSite) {
//        this.constructionSite = constructionSite;
//    }
//    
//    public boolean isSilent(T treeLocation, int distance) {
//        return constructionSite.isSilent(treeLocation, distance);
//    }
//    
//    public boolean isNoisy(T treeLocation, int distance) {
//        return !isSilent(treeLocation, distance);
//    }
//    
//    
//    
//    
////    public static boolean coordinate(int x, int y, int a, int b, int R) {
////        boolean noiseArea = false;
////        double distance = (x - a) * (x - a) + (y - b) * (y - b);
////        if (distance >= R * R) { // 소음 범위를 벗어나면
////            noiseArea = !noiseArea;
////        }
////        return noiseArea;
////    }
//}
