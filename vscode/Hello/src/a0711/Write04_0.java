package a0711;

import java.io.IOException;
import java.io.PrintWriter;

public class Write04_0 {
    public static void main(String[] args) throws IOException {
        PrintWriter fw = new PrintWriter("d:/out.txt");
        for(int i = 1; i<11; i++){
            String data = i + "번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
    }
}
// d드라이브에 out.txt 파일이 만들어지고
// 그 안에 i번째 줄입니다라는 글이써짐
