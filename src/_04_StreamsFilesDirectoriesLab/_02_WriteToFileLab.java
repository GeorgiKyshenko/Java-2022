package _04_StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class _02_WriteToFileLab {
    public static void main(String[] args) {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        //ако не е зададено правилно името на файла в който ще презаписваме текст, "WriteToFileOutput" IntelliJ създава автоматично такъв текстов документ.

        Set<Character> forbiddenSing = new HashSet<>();
        Collections.addAll(forbiddenSing, '.', ',', '!', '?');

//        други варианти за добавяне в Set.
//        forbiddenSing.addAll(Arrays.asList('.', ',', '!', '?'));
//        или
//        Set<Character> forbiddenSing = new HashSet<>(Arrays.asList('.', ',', '!', '?'));


        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                char myByteAsChar = (char) oneByte;
                if (!forbiddenSing.contains(myByteAsChar)) {
                    out.write(oneByte);
                }
                oneByte = in.read();
            }
        } catch (Exception ignored) {        //на catch можем да му кажем ignored, и спира да свети. (понеже няма блок от код в условието си)
        }
    }
}
