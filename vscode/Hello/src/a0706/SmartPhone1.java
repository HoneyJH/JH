public class SmartPhone1 extends Phone1 {
    // 자식생성자 선언
    public SmartPhone1(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone1(String model, String color) 생성자 실행됨");
    }
}
