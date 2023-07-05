public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        name = s;
        hp = maxHp;
    }

    public void attack(Monster enemy) {
        System.out.printf("[%s]의 공격 -> ", name);
        enemy.hp -= 10;
        System.out.printf("%s의 체력: %d/%d\n", enemy.name, enemy.hp, maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b; // 랜덤으로 공격자를 정함
            Monster defender = (attacker == a) ? b : a; // 정해진 공격자에 대한 방어자를 구함
            attacker.attack(defender);
        }
    }
}