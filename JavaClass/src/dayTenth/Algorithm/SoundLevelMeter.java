//// 만들다 폐기
//package dayTenth.Algorithm;
//
//import java.util.*;
//
//public class SoundLevelMeter<T extends Location> {
//    private T location;
//    private Map<T, Integer> soundLevels;
//
//
//    public SoundLevelMeter(T location) {
//        this.location = location;
//        this.soundLevels = new HashMap<>();
//    }
//
//    public void measureSoundLevel(T source, int soundLevel) {
//        soundLevels.put(source, soundLevel);
//    }
//
//    public int getSoundLevel(T source) {
//        Integer soundLevel = soundLevels.get(source);
//        return soundLevel == null ? 0 : soundLevel;
//    }
//
//    public int getAverageSoundLevel(int distance) {
//        int count = 0;
//        int totalSoundLevel = 0;
//        for (Map.Entry<T, Integer> entry : soundLevels.entrySet()) {
//            T source = entry.getKey();
//            int soundLevel = entry.getValue();
//            int x = location.getX() - source.getX();
//            int y = location.getY() - source.getY();
//            double dist = Math.sqrt(x * x + y * y);
//            if (dist <= distance) {
//                count++;
//                totalSoundLevel += soundLevel;
//            }
//        }
//        return count == 0 ? 0 : totalSoundLevel / count;
//    }
//
//
//}
