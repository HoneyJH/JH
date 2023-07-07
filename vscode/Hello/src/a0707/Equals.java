package a0707;

public class Equals {
    public String id;

    public Equals(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Equals) { // 주어진 객체가 특정 클래스의 인스턴스인지 판별
            Equals target = (Equals) obj;
            if (id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}
