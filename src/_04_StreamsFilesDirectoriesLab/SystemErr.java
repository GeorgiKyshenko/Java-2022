package _04_StreamsFilesDirectoriesLab;

import java.io.*;

public class SystemErr {
    public static void main(String[] args) throws IOException {
        System.err.println("System error test.");
        /*Всички грешки се принтират от System.err, и са в червен цвят. Пиша го просто за да знам, че съществува такова нещо.
        * Както и BufferedStream, които не използваме в задачите */
        String pathIn = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(pathIn));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(pathOut));
        /*in може и да не се затваря, понеже е текстов документ, който се намира на хард паметта. */
        in.close();
        out.close();
    }
}
