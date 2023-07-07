package a0707;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("음식을 2개 선택해주세요");
        System.out.println("1.치즈버거 | 2.야채버거 | 3.우유 | 4.계란말이 | 5.샐러드");
        System.out.print("첫번째 음식>");
        int a = scan.nextInt();
        System.out.print("두번째 음식>");
        int b = scan.nextInt();

        String[] arr1 = {"치즈버거","야채버거","우유","계란말이","샐러드"} ;
        int[] arr2 = {400,340,170,100,70};

        System.out.println("첫번째 음식: "+arr1[a-1]+"( "+arr2[a-1]+"kcal )");
        System.out.println("두번째 음식: "+arr1[b-1]+"( "+arr2[b-1]+"kcal )");

        a = arr2[a-1];
        b = arr2[b-1];
        if(a+b>500){
            System.out.println("Total: "+(a+b)+"kcal");
            System.out.println("어머니 기분 : angry");
        } else{
            System.out.println("Total: "+(a+b)+"kcal");
            System.out.println("어머니 기분 : no angry");
        }

        scan.close();
    }
} // 메뉴를 선택했을때 칼로리를 계산하여 500이 넘으면 "angry" 안넘으면 "no angry"를 출력하기

