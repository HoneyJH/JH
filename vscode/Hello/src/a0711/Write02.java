package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        for(int i = 1; i<11; i++){
            String data = i + "번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        output.close();
    }
}
// d드라이브에 out.txt 파일이 만들어지고
// 그 안에 i번째 줄입니다라는 글이써짐
