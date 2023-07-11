package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        output.close();
    }
} // d드라이브에 out.txt 파일이 만들어짐
