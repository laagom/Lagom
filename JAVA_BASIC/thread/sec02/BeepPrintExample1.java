package JAVA_BASIC.thread.sec02;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        // Toolkit을 이용하여 beep음을 발생
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            toolkit.beep();

            // 0.5초 텀을 발생
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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
