package _04_StreamsFilesDirectoriesLab;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _05_WriteEveryThirdLaneLab {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        Scanner scanner = new Scanner(new FileReader(pathIn));
        PrintWriter out = new PrintWriter(pathOut);

        String line = scanner.nextLine();
        int counter = 1;
        while (scanner.hasNextLine()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = scanner.nextLine();
        }
        out.close();
    }
}
