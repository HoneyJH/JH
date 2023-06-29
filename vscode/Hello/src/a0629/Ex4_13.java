package a0629;

public class Ex4_13 {
    public static void main(String[] args) {
        int i = 5;
        while(i--!=0){
            // i-- 후위형이므로 조건식이 평가된 후에 i 값이 감소
            System.out.println(i + " - I can do it.");
        }
    }
} // whlie문