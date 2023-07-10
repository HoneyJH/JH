package a0710;

// 난 동물원의 사육사임
// 육식 동물이 들어오면 난 먹이를 던져줌
// 호랑이가 오면 사과를 던져준다
// 사자가 오면 바나나를 던져준다
// 악어가 오면 스트로베리를 던져준다
// 표범이 오면 오렌지를 던져준다

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        zookeeper.feed(tiger); // feed apple 출력
        zookeeper.feed(lion); // feed banana 출력
        zookeeper.feed(crocodile); // feed strawberry 출력
        zookeeper.feed(leopard); // feed orange 출력
    }
}

class Animal{
    String name;
    public Animal(){
        // 기본 생성자 내용
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Tiger extends Animal{
}

class Lion extends Animal{
}

class Crocodile extends Animal{
}

class Leopard extends Animal{
}

class Zookeeper{
    void feed(Tiger tiger){
        // 호랑이가 오면 사과를 던져준다
        System.out.println("feed apple");
    }
    void feed(Lion lion){
        // 사자가 오면 바나나를 던져준다
        System.out.println("feed banana");
    }

    void feed(Crocodile crocodile){
        System.out.println("feed strawberry");
    }
    void feed(Leopard leopard){
        System.out.println("feed orange");
    }
}