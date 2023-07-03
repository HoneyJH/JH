package a0703;

public class Ex6_10 {
    public static void main(String[] args) {
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        int sum = 0;
        int p = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[i][j];
            }
            p = array.length * array[i].length;
        }
        double avg = (double) sum / p ;
        System.out.println("배열의 총 합은" + sum);
        System.out.println("배열의 평균은" + avg);
    }
} // 항목의 전체 합과 평균 구하기
