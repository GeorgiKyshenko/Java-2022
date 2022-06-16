package _04_StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class Lecture {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);
        int oneByte = fileStream.read();

        while (oneByte >= 0) {   // < -  когато байтовете свършат, връща - 1;
            System.out.print ((char) oneByte);   // един Byte от текста input.txt е равен на един символ от ASCII таблицата
                                                    // ако първата буква от текста е "О" sout(oneByte) отпечатва ASCII = 79. Ако е кастната към char отпечатва "О"
            oneByte = fileStream.read();
        }
        fileStream.close();  // всички стриймове накрая се затварят.
    }
}
