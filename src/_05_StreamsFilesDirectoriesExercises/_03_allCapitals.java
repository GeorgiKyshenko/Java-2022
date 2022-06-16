package _05_StreamsFilesDirectoriesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _03_allCapitals {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        //1-ви вариант
        FileInputStream fileInputStream = new FileInputStream(pathIn);
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);


        int oneByte = fileInputStream.read();

        while (oneByte != -1) {
            char currentChar = (char) oneByte;
            fileOutputStream.write(Character.toUpperCase(currentChar));
            oneByte = fileInputStream.read();
        }

        fileOutputStream.close();

        // 2-ри вариант
        String pathOut2 = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\output2.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut2));

        List<String> allLines = Files.readAllLines(Path.of(pathIn));

        for (String line : allLines) {
            bufferedWriter.write(line.toUpperCase());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
