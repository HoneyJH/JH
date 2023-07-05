
enum Rainbow{ RED, ORANGE, YELLOW, GREEN, BLUE, INBIGO, VIOLET}

public class Enum {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();

        for(Rainbow rb:arr){
            System.out.println(rb);
        }
    }
}
