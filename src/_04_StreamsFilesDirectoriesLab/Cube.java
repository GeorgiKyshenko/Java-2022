package _04_StreamsFilesDirectoriesLab;

import java.io.Serializable;

public class Cube implements Serializable {
    String color;
    int length;
    int width;
    int depth;

    public Cube(String color, int length, int width, int depth) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.depth = depth;
    }
}
