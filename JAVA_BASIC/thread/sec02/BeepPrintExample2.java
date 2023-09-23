package JAVA_BASIC.thread.sec02;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        // beep 작업 스레드 생성
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        
        // beep 작업 스레드 실행
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
