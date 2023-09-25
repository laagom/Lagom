package JAVA_BASIC.serialization;

import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringBuffer("Name:")
                .append(this.name)
                .append(", Age:").append(this.age)
                .toString();
    }

}