public class AvangerTest {
    public static void main(String[] args) {
        Avanger thor = new Avanger("토르", 150);
        Avanger thanos = new Avanger("타노스",160);
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);
    }
}

class Avanger{
    String name;
    int hp;
    // public Avanger(String name, int hp) {
    //     this.name = name;  같은 이름이면 this를 써야함!!
    //     this.hp = hp;
    // }
    public Avanger(String s, int i) {
        name = s;
        hp = i;
    }
    void punch(Avanger enemy){
        // Avanger 클래스 이름, enemy 매개변수의 이름
        System.out.printf("[%s]의 펀치!", name);
        enemy.hp -= 10;
        System.out.printf("-> %s의 체력: %d\n",enemy.name,enemy.hp);
    }
}