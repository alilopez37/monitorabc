package models;

public class Monitor {
    private boolean a;
    private boolean b;
    private boolean c;
    public Monitor(){
        a = true;
        b = false;
        c = false;
    }
    public synchronized  void printA(){
        while (true) {
            while (!a){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //System.out.println(Thread.currentThread().getName());
            System.out.print("A");
            a = false;
            b = true;
            this.notifyAll();
        }
    }
    public synchronized void printB(){
        while (true) {
            while (!b) {
                //System.out.println(Thread.currentThread().getName());
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.print("B");
            b = false;
            c = true;
            this.notifyAll();
        }
    }
    public synchronized void printC() {
        while (true) {

            while (!c) {
                //System.out.println(Thread.currentThread().getName());
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("C");
            c = false;
            a = true;
            this.notifyAll();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
