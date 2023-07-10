package a0710;

public class Animal_Main implements Animal_Dog, Animal_Cat{
    public static void main(String[] args) {
        Animal_Main main = new Animal_Main();
        main.crying();
        main.one();
        main.two();
    }

    @Override
    public void crying() {
        System.out.println("월월");
    }
    
    @Override
    public void one() {
        System.out.println("one");
    }
    
    @Override
    public void two() {
        System.out.println("two");
    }

}
