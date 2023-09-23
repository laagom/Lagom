package JAVA_BASIC.thread.sec03;

public class ThreadNameExample {
    public static void main(String[] args) {
        // 메인 스레드 이름
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        // 이름 부여한 스레드
        System.out.println("이름 부여한 스레드");
        Thread threadA = new ThreadA();
        threadA.start();
        
        // 이름 부여하지 않은 스레드
        System.out.println("이름 부여하지 않은 스레드");
        Thread threadB = new ThreadB();
        threadB.start();
    }
}