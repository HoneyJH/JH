package package2;

import package1.A;

public class D extends A {
    // A() 생성자 호출
    public D() {
        super();
    }
    // D클래스는 A클래스와 다른 패키지에 있지만 A의 자식 클래스 이므로 A에 접근 가능

    public void method1() {
        this.field = "value";
        this.method();
    } // 상속을 통해서만 사용 가능

    public void method2() {
        // A a = new A();
        // a.field = "value";
        // a.method();
    } // 직접 객체 생성해서 사용하는 것은 불가
}
