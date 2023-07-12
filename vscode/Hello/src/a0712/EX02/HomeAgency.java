package a0712.EX02;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent(){
        return new Home();
    }
}
// HomeAgency는 Rentable 인터페이스를 구현함
// HomeAgency 클래스는 Home 객체를 생성하여 반환
