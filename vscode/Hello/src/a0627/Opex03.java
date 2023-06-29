public class Opex03 {
    public static void main(String[] args) {
        int score = 85;
        String result1 = ((score>90))? "가":"나";
        String result2 = (!(score>90))? "가":"나";
        System.out.println(result1);
        System.out.println(result2);
    }
}

