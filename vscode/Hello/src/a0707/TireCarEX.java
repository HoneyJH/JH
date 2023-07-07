package a0707;

public class TireCarEX {
    public static void main(String[] args) {
        // TireCar 객체생성
        TireCar myCar = new TireCar();

        //  Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();
        
        //  Tire_Hankook 객체 장착
        myCar.tire = new Tire_Hankook();
        myCar.run();
        
        //  Tire_Kumho 객체 장착
        myCar.tire = new Tire_Kumho();
        myCar.run();
    }
}
