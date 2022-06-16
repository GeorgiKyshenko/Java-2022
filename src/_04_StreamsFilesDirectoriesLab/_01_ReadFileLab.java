package _04_StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_ReadFileLab {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);
        int oneByte = fileStream.read();

        while (oneByte >= 0) {
            System.out.printf("%s ", Integer.toBinaryString(oneByte));  // превръщане в двоична бройна система
            oneByte = fileStream.read();
        }
    }
}
