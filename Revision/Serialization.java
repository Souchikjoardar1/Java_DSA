import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class Serialization {
    public static void main(String[] args) throws IOException {
        Cricketer c = new Cricketer("sachin", 56, 100);
        FileOutputStream fos = new FileOutputStream("D:\\Java\\Revision\\Revision.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        /*
         * An ObjectOutputStream is created, which allows Java objects to be written to
         * the file in a serialized format.
         * A FileOutputStream is created to write data to a file named Revision.txt
         * located in the Revision directory.
         * Writing the Object to the File:
         * 
         * oos.writeObject(c); The Cricketer object (c) is serialized and written to the
         * file Revision.txt.
         * FileOutputStream
         * Purpose: It is used to write raw data (like bytes) to a file.
         * What it does in your code:
         * This creates a connection to the file Revision.txt in the specified directory
         * (Revision).
         * It prepares the file to receive data. If the file doesn’t exist, it will
         * create it.
         * Think of it as opening a pipeline to the file so that data can flow into it.
         * ObjectOutputStream
         * Purpose: It is used to write Java objects (not just raw data) to a file in a
         * serialized format.
         * What it does in your code:
         * This wraps the FileOutputStream so that you can write entire Java objects
         * (like your Cricketer object) to the file.
         * It converts the object into a special format (serialization) that can be
         * stored in the file.
         * Without ObjectOutputStream, you would have to manually convert the object
         * into bytes, which is complex.
         * How They Work Together
         * FileOutputStream opens the file and provides a way to write raw data to it.
         * ObjectOutputStream uses the FileOutputStream to write a serialized version of
         * the object into the file.
         * In simple terms:
         * FileOutputStream: Opens the file for writing.
         * ObjectOutputStream: Converts the object into a storable format and sends it
         * through the FileOutputStream to the file.
         */
    }
}
