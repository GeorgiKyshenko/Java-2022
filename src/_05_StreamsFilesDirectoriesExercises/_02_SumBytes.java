package _05_StreamsFilesDirectoriesExercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _02_SumBytes {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(pathIn);

        //1-ви вариант
        int sumFirstMethod = 0;
        int oneByte = fileInputStream.read();
        while (oneByte != -1) {
            if (oneByte != 13 && oneByte != 10) {    //тука изключваме ascii стойностите на new line и carriage return (нов ред и ретърн).
                sumFirstMethod += oneByte;
            }
            oneByte = fileInputStream.read();
        }
        System.out.println(sumFirstMethod);


        // или 2-ри вариант
        int sumSecondMethod = 0;

        byte[] allBytes = Files.readAllBytes(Path.of(pathIn));
        for (byte ascii : allBytes) {
            if (ascii != 13 && ascii != 10) {
                sumSecondMethod += ascii;
            }
        }
        System.out.println(sumSecondMethod);
    }
}
