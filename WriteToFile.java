
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class WriteToFile implements Serializable {
    // public static void main(String[] args) {
    // public static void write(YongMan olga) {

    // try {
    // FileOutputStream fos = new FileOutputStream("human.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);
    // oos.writeObject(olga);
    // // oos.writeObject(YongMan.class.getClass());
    // // oos.writeObject(AdultMan.class);

    // oos.close();

    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // }
    public static void write(ArrayList<YongMan> yongMans) {

        try {
            FileOutputStream fos = new FileOutputStream("human.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(yongMans);

            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void read() {
        try {

            FileInputStream fis = new FileInputStream("human.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<YongMan> yongMans = (ArrayList<YongMan>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// public static void read () {
// File file = new File("human.txt");
// ObjectInputStream ois = null;
// try{

// FileInputStream fis = new FileInputStream(file);
// if (fis !=null){
// ois = new ObjectInputStream(fis);
// YongMan olga = (YongMan) ois.readObject();
// System.out.println(olga);
// }
// // FileInputStream fis = new FileInputStream("human.txt");
// // ObjectInputStream ois = new ObjectInputStream(fis);

// // YongMan olga = (YongMan) ois.readObject();
// // System.out.println(olga);

// ois.close();

// // } catch (FileNotFoundException e) {
// // e.printStackTrace();
// }catch (IOException e) {
// e.printStackTrace();
// } catch (ClassNotFoundException e) {
// e.printStackTrace();
// }
// }
// }
