package a0704;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex7_11_3 {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("2.45678");
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        System.out.println(rounded); // 출력: 2.46
    }
} // 소숫점 2번째 자리에서 반올림해서 출력
