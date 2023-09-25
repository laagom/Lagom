package JAVA_BASIC.serialization;

public class HumanOnlyRead {
    public static void main(String[] args) {
        Human readingHuman = HumanUtils.read();
        System.out.println("==========Reading Object==========");
        System.out.println(readingHuman);
    }
}
