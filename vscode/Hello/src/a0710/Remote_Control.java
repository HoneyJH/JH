package a0710;

public interface Remote_Control {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //  public 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
