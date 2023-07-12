package a0712;

public class BoxGenericEX {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>(); // 객체는 int로 받을 수 없음
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
