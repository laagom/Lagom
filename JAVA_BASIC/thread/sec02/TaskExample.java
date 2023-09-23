package JAVA_BASIC.thread.sec02;

public class TaskExample implements Runnable {
    public void run() {
        System.out.println("Runnable 상속받은 스레드.");
    }
}