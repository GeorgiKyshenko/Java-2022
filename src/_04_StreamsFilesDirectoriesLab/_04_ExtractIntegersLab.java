package _04_StreamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04_ExtractIntegersLab {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(pathIn));
        PrintWriter out = new PrintWriter(new FileOutputStream(pathOut)); // може и само да му зададем pathOut, без - new FileOutputStream().
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();   //PrintWriter-ра, трябва да се затвори !

        /* С FileOutputStream можем да записваме само по един байт (има char-ове от ASCII които са повече от 1 байт),
        * за да четем и записваме повече от един байт използваме функциите на скенера като му задаваме FileInputStream
        * и за записване (отпечатване) използваме PrintWriter като му задаваме FileOutputStream !   */
    }
}
