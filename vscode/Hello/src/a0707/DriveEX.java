package a0707;

public class DriveEX {
    public static void main(String[] args) {
        // Driver 객체 생성
        Drive driver = new Drive();

        // 매개값으로 Drive_Bus 객체를 제공하고 driver() 메소드 호출
        Drive_Bus bus = new Drive_Bus();
        driver.drive(bus);

        // 매개값으로 Drive_Taxi 객체를 제공하고 driver() 메소드 호출
        Drive_Taxi taxi = new Drive_Taxi();
        driver.drive(taxi);
    }
}
