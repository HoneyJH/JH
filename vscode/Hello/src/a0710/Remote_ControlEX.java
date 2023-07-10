package a0710;

public class Remote_ControlEX {
    public static void main(String[] args) {
        Remote_Control rc;

        rc = new Remote_Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        
        rc = new Remote_Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        
    }
}
