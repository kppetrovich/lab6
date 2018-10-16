public interface Wind {
    void incWindSpeed();
    void moveClouds(CommonCloud cloud);
    void moveStormCloud();
    default void makeWaves(){}
}
