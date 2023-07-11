package a0711;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write04_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter fw = new PrintWriter("d:/out.txt");
        for(int i = 1; i<11; i++){
            String data = i + "번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        // PrintWriter를 사용할 경우에는 생성자 파라미터로 파일명 대신 추가로 열린 FileWriter에 객체를 전달해야한다.
        PrintWriter fw2 = new PrintWriter(new FileWriter("d:/out.txt",true));
        for(int i = 11; i<21; i++){
            String data = i + "번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
// d드라이브에 out.txt 파일이 만들어지고
// 그 안에 i번째 줄입니다라는 글이써짐
