public class Ex7_2 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*100);
        System.out.println("슬기가 던진 공의 위치 = " + n);
        if(30<=n && n<=40 || 60<=n && n<=70){
            System.out.println("win!!");
        }else{
            System.out.println("lose");
        }
    }
}
