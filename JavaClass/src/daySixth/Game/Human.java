package daySixth.Game;

public interface Human extends Creature{
    void run();
    void watch();
    
    default void hear() {
        
    }
}
