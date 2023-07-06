
class A{
}

class B extends A{
}

class C extends A{
}

class D extends B{
}

class E extends C{
}

public class PromotionEX {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        System.out.println(a1 +"a2="+ a2 +"a3="+ a3 +"a4="+ a4 +"b1="+ b1 +"c1="+ c1); // 주의 뜨는 거 싫어서 써놓음

        // B b3 = e;  //컴파일 에러(상속 관계에 있지 않음)
        // C c2 = d;  //컴파일 에러(상속 관계에 있지 않음)
    }
}