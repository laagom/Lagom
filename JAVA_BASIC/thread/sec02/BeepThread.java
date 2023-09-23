package JAVA_BASIC.thread.sec02;

import java.awt.Toolkit;

public class BeepThread extends Thread {
    @Override
    public void run() {
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
    }
}
