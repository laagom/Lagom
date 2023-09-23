package JAVA_BASIC.thread.sec02;

public class BeepPrintExample5 {
    public static void main(String[] args) {
        // Thread 하위 클래스로 생성한 작업 스레드
        Thread thread = new BeepThread();
        thread.start();

        // beep음을 발생시킨다는 내용을 프린팅
        for(int i=0; i<5; i++) {
            System.out.println("삡!");

            // 0.5초 텀을 발생
            try { 
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
