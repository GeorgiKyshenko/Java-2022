package _05_StreamsFilesDirectoriesExercises;

import java.io.*;

public class _04_CountCharacterType {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\04.CharacterTypeOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(pathIn);
        PrintWriter writer = new PrintWriter(pathOut);

        int oneByte = fileInputStream.read();

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        while (oneByte != -1) {
            char currentChar = (char) oneByte;
            if ( currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowels++;
            } else if (currentChar == ',' || currentChar == '.' || currentChar == '?' || currentChar == '!') {
                punctuation++;
            } else if(currentChar != 10 && currentChar != 13 && currentChar != 32) {
                consonants++;
            }
            oneByte = fileInputStream.read();
        }

        writer.write("Vowels: " + vowels);
        writer.println();
        writer.write("Consonants: " + consonants);
        writer.println();
        writer.write("Punctuation: " + punctuation);

        writer.close();
    }
}
