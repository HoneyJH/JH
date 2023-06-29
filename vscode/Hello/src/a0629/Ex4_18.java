package a0629;

public class Ex4_18 {
    public static void main(String[] args) {
       while(true){
        int num = (int)(Math.random()*6)+1;
        System.out.println(num);
        if(num == 6){
            break; // if문만 빠져나가는 것이 아닌 whlie문에서도 빠져나감
        }
       }
       System.out.println("프로그램 종료");
    }
} // break문
