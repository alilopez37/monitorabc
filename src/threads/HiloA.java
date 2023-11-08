package threads;

import models.Monitor;

public class HiloA implements Runnable{
    private Monitor monitor;
    public HiloA(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printA();
    }
}
