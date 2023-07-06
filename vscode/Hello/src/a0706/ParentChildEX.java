public class ParentChildEX {
   public static void main(String[] args) {
      // 자식 객체 선언
      ParentChild child = new ParentChild();

      // 자동 타입 변환 = 형변환
      Parent parent = child;

      // 메소드 호출
      parent.method1();
      parent.method2();
      // parent.method3(); // 호출 불가능
   }
} // 형변환 예제
