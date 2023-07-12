package a0712.EX02;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent(){
        return new Car();
    }
}

// CarAgency는 Rentable 인터페이스를 구현함
// CarAgency 클래스는 Car 객체를 생성하여 반환