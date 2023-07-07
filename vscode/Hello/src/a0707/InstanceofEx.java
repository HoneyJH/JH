package a0707;

public class InstanceofEx {
    public static void personinfo(Instanceof_Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        if (person instanceof Instanceof_Student) {
            // Instanceof_Student 객체일 경우 강제 타입 변환
            Instanceof_Student student = (Instanceof_Student) person;
            // Instanceof_Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Instanceof_Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Instanceof_Person p1 = new Instanceof_Person("홍길동");
        personinfo(p1);
        
        System.out.println();
        
        // Instanceof_Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Instanceof_Person p2 = new Instanceof_Student("김길동", 10);
        personinfo(p2);
    }

}
// 1. Instanceof_Person 객체 정보를 출력
// 2. Instanceof_Student 객체 정보를 출력
// 3. 이때 Instanceof_Student 객체는 Instanceof_Person 클래스를 상속 받았기 때문에 'personInfo()'메서드 에서 'instanceof' 연산자를 사용하여 Instanceof_Student 타입인지 확인하고, 필요에 따라 형변환 하여 Instanceof_Student 클래스에만 존재하는 필드와 메서드를 사용할 수 있게 됨