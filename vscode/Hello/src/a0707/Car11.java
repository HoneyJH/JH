package a0707;

public class Car11{
    public static void main(String[] args) {
        Car1 car01 = new Car1();
        Car1 car02 = new Car1();
        
        System.out.println(car01.toString()); 
        System.out.println(car02.toString()); 
        System.out.println(car01.equals(car02));
        
        car01 = car02; // 두 참조 변수가 같은 주소를 가리킴
        System.out.println(car01.toString()); 
        System.out.println(car02.toString()); 
        System.out.println(car01.equals(car02));
    }
}   

