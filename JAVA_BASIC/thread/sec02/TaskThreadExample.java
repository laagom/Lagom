package JAVA_BASIC.thread.sec02;

public class TaskThreadExample {
    public static void main(String[] args) {
        Runnable taskExample = new TaskExample();

        Thread thread = new Thread(taskExample);
        thread.start();
        
        System.out.println("메인 스레드.");
    }
}
