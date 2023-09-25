package JAVA_BASIC.serialization;

public class HumanWriteRead {
    public static void main(String[] args) {
        Human human = new Human();

        human.setName("LAGOM");
        human.setAge(30);

        HumanUtils.write(human);
        System.out.println("==========Writing Object==========");
        System.out.println(human);

        Human readingHuman = HumanUtils.read();
        System.out.println("==========Reading Object==========");
        System.out.println(readingHuman);
    }
}
