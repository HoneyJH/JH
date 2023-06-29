class Test {
    int field1;
    String field2;
    public void method1(){
        System.out.println("자바 프로그래밍 !!");
    }
}
// public은 파일당 하나씩만 사용 가능
// public는 파일명과 동일해야함
public class Prog{
    public static void main(String[] args) {
        // 자바 프로그램이 맨처음 main() 메소드를 찾아 실행
        // main()은 클래스에 반드시 하나 존재!
        Test myTest = new Test();
        myTest.method1();
    }
}