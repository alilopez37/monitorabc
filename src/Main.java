import models.Monitor;
import threads.HiloA;
import threads.HiloB;
import threads.HiloC;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        Thread h1 = new Thread(new HiloA(monitor));
        Thread h2 = new Thread(new HiloB(monitor));
        Thread h3 = new Thread(new HiloC(monitor));

        h1.start();
        h2.start();
        h3.start();
    }
}