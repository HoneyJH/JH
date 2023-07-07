package a0707;

public class EqualsEX {
    public static void main(String[] args) {
        Equals obj1 = new Equals("blue");
        Equals obj2 = new Equals("blue");
        Equals obj3 = new Equals("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다");
        } else{
            System.out.println("obj1과 obj2는 동등하지 않습니다");
        }
        
        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다");
        } else{
            System.out.println("obj1과 obj3는 동등하지 않습니다");
        }
        
    }
}
