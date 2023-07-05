public class Ex7_3 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*100);
        System.out.println("슬기가 던진 공의 위치 = " + n);
        if(50<=n && n<=70 || n%6 == 0){
            System.out.println("win!!");
        }else{
            System.out.println("lose");
        }
    }
}
