package JAVA_BASIC.thread.sec03;

public class PriorityExample {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++) {
            Thread thread = new CalcThread("thread" + i);
            if(i != 50) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
