package _04_StreamsFilesDirectoriesLab;

import java.io.*;

public class _08_SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube  = new Cube("Blue",1,1,1);
        String path = "D:\\JavaAdvancedArchive\\src\\StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\myCube";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Cube cubeFromFile = (Cube) objectInputStream.readObject();
        System.out.println(cubeFromFile);
    }
}
