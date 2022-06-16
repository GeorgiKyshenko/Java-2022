package _05_StreamsFilesDirectoriesExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class _05_LineNumbers {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\05.LineNumbersOutput.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathIn));
        PrintWriter printWriter = new PrintWriter(pathOut);
        //List<String> allLines = Files.readAllLines(Path.of(pathIn));

        String line = bufferedReader.readLine();

        int count = 1;
        while (line != null) {
            printWriter.write(count + ". " + line);
            printWriter.println();
            count++;
            line = bufferedReader.readLine();
        }
        printWriter.close();   // НЕ ЗАБРАВЯЙ ДА ГО ЗАТВОРИШ !!!
    }
}
