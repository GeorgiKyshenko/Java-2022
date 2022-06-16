package _05_StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class _07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathOne = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathTwo = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String outputPath = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputThree.txt";
        PrintWriter printWriter = new PrintWriter(outputPath);

        List<String> allLinesOne = Files.readAllLines(Path.of(pathOne));
        List<String> allLinesTwo = Files.readAllLines(Path.of(pathTwo));

        for (String line : allLinesOne) {
            printWriter.println(line);
        }
        for (String line2 : allLinesTwo) {
            printWriter.println(line2);
        }
        printWriter.close();
    }
}
