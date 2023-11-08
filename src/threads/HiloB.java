package threads;

import models.Monitor;

public class HiloB implements Runnable{
    private Monitor monitor;
    public HiloB(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printB();
    }
}
