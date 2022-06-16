package _05_StreamsFilesDirectoriesExercises;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class _01_SumLines {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathIn));

        for (String line : allLines) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                sum += currentChar;
            }
            System.out.println(sum);
        }
        System.out.println();

        //или 2-ри вариант !
        allLines.stream()
                .map(line-> line.toCharArray())
                .forEach(arr-> {
                    int sum = 0;
                    for (char symbol:arr) {
                        sum+=symbol;
                    }
                    System.out.println(sum);
                });


    }
}
