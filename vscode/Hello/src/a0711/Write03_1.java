package a0711;

import java.io.FileWriter;
import java.io.IOException;

public class Write03_1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:/out.txt");
        for(int i = 1; i<11; i++){
            String data = i + "번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("d:/out.txt",true);
        // 파일을 추가 모드로 연다.
        for(int i = 11; i<21; i++){
            String data = i + "번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
// d드라이브에 out.txt 파일이 만들어지고
// 그 안에 i번째 줄입니다라는 글이써짐