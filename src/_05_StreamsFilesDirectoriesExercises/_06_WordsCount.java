package _05_StreamsFilesDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class _06_WordsCount {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String textDoc = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        List<String> pathInWords = Files.readAllLines(Path.of(pathIn));

        for (String line : pathInWords) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                wordsCount.put(word, 0);
            });
        }
        List<String> allLines = Files.readAllLines(Path.of(textDoc));
        for (String line : allLines) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (wordsCount.containsKey(word)) {
                    wordsCount.put(word, wordsCount.get(word) + 1);
                }
            });
        }
        PrintWriter writer = new PrintWriter("D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");
        wordsCount.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();

        // wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey() + " " +  entry.getValue()));
        // това е друг начин за сравнение на стойности, малко по - чисто.
    }
}
