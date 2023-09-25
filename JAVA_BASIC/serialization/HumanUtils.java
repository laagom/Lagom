package JAVA_BASIC.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HumanUtils {
    public static final String path = "E:\\human.ser";

    public static void write(Human address) {
        try {
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(address);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Human read() {
        Human address;
        try {
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            address = (Human) ois.readObject();
            ois.close();

            return address;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
