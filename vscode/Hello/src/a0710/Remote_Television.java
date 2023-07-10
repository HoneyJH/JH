package a0710;

public class Remote_Television implements Remote_Control {
  private int volume;

  @Override
  public void turnOn() {
    System.out.println("Tv를 켭니다.");
  }
  
  @Override
  public void turnOff() {
    System.out.println("Tv를 끕니다.");
  }

  @Override
  public void setVolume(int volume) {
    if(volume>Remote_Control.MAX_VOLUME){
      this.volume = Remote_Control.MAX_VOLUME;
    } else if(volume<Remote_Control.MIN_VOLUME){
      this.volume = Remote_Control.MIN_VOLUME;
    } else{
      this.volume = volume;
    }
    System.out.println("현재 Tv 볼륨: " + this.volume);
  }
  
}
