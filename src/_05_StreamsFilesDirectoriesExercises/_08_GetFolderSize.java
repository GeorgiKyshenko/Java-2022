package _05_StreamsFilesDirectoriesExercises;

import java.io.File;
import java.io.IOException;

public class _08_GetFolderSize {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvancedArchive\\src\\_05_StreamsFilesDirectoriesExercises\\05. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();

        int folderSize =0;
        for (File file : allFiles) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}
