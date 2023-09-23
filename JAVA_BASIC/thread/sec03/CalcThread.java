package JAVA_BASIC.thread.sec03;

public class CalcThread extends ThreadA {
    public CalcThread(String name) {
        setName(name);
    }

    public void run() {
        for(int i=0; i<2000000000; i++) {

        }
        System.out.println(getName());
    }
}
