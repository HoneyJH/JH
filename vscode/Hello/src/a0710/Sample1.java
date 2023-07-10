package a0710;

public class Sample1 {
     public static void main(String[] args) {
        ZooKeeper1 zookeeper = new ZooKeeper1();
        Tiger1 tiger = new Tiger1();
        Lion1 lion = new Lion1();
        Crocodile1 crocodile = new Crocodile1();
        Leopard1 leopard = new Leopard1();
        zookeeper.feed(tiger);  // feed apple 출력
        zookeeper.feed(lion);  // feed banana 출력  
        zookeeper.feed(crocodile); // feed strawberry 출력
        zookeeper.feed(leopard); // feed orange 출력
    }
}
interface Feedable1{
     void feed();
}
class Animal1{
    String name;
    public Animal1() {
        // 기본 생성자 내용
    }
    public Animal1(String name) {
        this.name = name;
    }

}
class Tiger1 extends Animal1 implements Feedable1{

    @Override
    public void feed() {
      System.out.println("feed apple");
    
    }

}
class Lion1 extends Animal1 implements Feedable1{

    @Override
    public void feed() {
      System.out.println("feed banana");
    
    }
}
class Crocodile1 extends Animal1 implements Feedable1 {
    @Override
    public void feed() {
        System.out.println("feed strawberry");
    }
}

class Leopard1 extends Animal1 implements Feedable1 {
    @Override
    public void feed() {
        System.out.println("feed orange");
    }
}
class ZooKeeper1 {
    void feed(Feedable1 animal) {
        animal.feed();
    }
}