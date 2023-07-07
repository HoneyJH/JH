package a0707;

public class Car1{
    public static void main(String[] args) {
        Car1 car01 = new Car1();
        Car1 car02 = new Car1();
        
        System.out.println(car01.toString()); // a0707.Car1@5aaa6d82 
        System.out.println(car02.toString()); // a0707.Car1@73a28541
    }
}   
// toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스 이름과 함께 구분자로 @가 사용되며, 그 뒤로 해시코드가 추가 된다.
