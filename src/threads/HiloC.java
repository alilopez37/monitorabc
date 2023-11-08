package threads;

import models.Monitor;

public class HiloC implements Runnable{
    private Monitor monitor;
    public HiloC(Monitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        monitor.printC();
    }
}
