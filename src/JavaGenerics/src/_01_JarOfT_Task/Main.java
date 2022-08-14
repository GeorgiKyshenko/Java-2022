package _01_JarOfT_Task;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(10);
        integerJar.add(20);

        System.out.println(integerJar.remove());
        System.out.println(integerJar.remove());
    }
}
