package a0712.EX01;

public class Product<K, M> {
    private K kind;
    private M model;

    public K getKind() {
        return kind;
    }

    public M getModel() {
        return model;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

// 제네릭을 사용해서 제품(Product)를 나타내는 클래스를 구현
// Product 클래스에는 K,M을 사용하여 두개의 타입변수를 가지고 있음
// 이를 통해서 제품의 종류(Kind) 와 모델(Model)에 대한 타입을 유연하게 설정할 수 있음