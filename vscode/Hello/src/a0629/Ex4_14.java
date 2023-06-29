package a0629;

public class Ex4_14 {
    public static void main(String[] args) {
        int sum = 0;
        int i= 0;
        while(sum <= 100){
            System.out.printf("%d - %d%n",i,sum);
            // i++;
            // sum += i;
            sum += ++i;
        }
    }
} // whlie문