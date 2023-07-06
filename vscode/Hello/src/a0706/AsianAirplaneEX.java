public class AsianAirplaneEX {
   public static void main(String[] args) {
    AsianAirplane aa = new AsianAirplane();
    aa.takeOff();
    aa.fly();
    aa.flyMode = AsianAirplane.SUPERSONIC;
    aa.fly();
    aa.flyMode = AsianAirplane.NORMAL;
    aa.fly();
    aa.land();
   }
}
