public class ParentChildEX1 {
   public static void main(String[] args) {
      // 객체 생성 및 자동 타입 변환
      Parent1 parent = new ParentChild1();

      // Parent 타입으로 필드와 메소드 사용
      parent.field1 = "data1";
      parent.method1();
      parent.method2();
      
      // parent.field2 = "data2"; // 불가능
      // parent.method3(); // 불가능

      //  강제 타입 변환 = 강제 형변환
      ParentChild1 child = (ParentChild1) parent;

      // ParentChild1타입으로 필드와 메소드 사용
      child.field2 = "data2";
      child.method3();
   }
} // 강제 형변환 예제
