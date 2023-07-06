public class SmartPhone2 extends Phone2 {
    // 자식생성자 선언
    public String weight;
    public SmartPhone2(String model, String color, String weight) {
        super(model, color); // 꼭 써주어야함!
        this.weight = weight;
        System.out.println("SmartPhone2(String model, String color) 생성자 실행됨");
    }
}
