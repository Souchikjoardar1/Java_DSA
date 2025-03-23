import java.io.*;

public class Deserialization implements Serializable {
    public static void main(String[] args) {
        /*
         * 1. FileInputStream fis = new
         * FileInputStream("D:\\Java\\Revision\\Revision.txt");
         * Purpose: Opens a file named Revision.txt located at Revision for reading.
         * What it does: Reads the raw bytes from the file. This file is expected to
         * contain a serialized object (in this case, an object of the Cricketer class).
         * Why it's needed: To provide the raw data to the next step, which is
         * deserialization.
         * 2. ObjectInputStream ois = new ObjectInputStream(fis);
         * Purpose: Wraps the FileInputStream to read objects from the file instead of
         * just raw bytes.
         * What it does: Converts the byte stream from the file into Java objects. It
         * knows how to do this because the object was serialized earlier using
         * ObjectOutputStream.
         * 3. Cricketer c = (Cricketer) ois.readObject();
         * Purpose: Reads the serialized object from the file and converts it back into
         * a Cricketer object.
         * What it does:
         * The readObject() method reads the object from the file.
         * The (Cricketer) part is a type cast because readObject() returns a generic
         * Object, and you need to specify that it is a Cricketer object.
         * Why it's needed: To use the deserialized object in your program.
         * 4. try-with-resources
         * The try block uses a try-with-resources statement. This ensures that both
         * FileInputStream and ObjectInputStream are automatically closed after the
         * block is executed, even if an exception occurs. This prevents resource leaks.
         * What Happens During Execution?
         * The program opens the file Revision.txt and reads its contents.
         * It uses ObjectInputStream to interpret the file's contents as a serialized
         * object.
         * The readObject() method reconstructs the Cricketer object from the file.
         * The deserialized Cricketer object is stored in the variable c.
         * You can now use the c object in your program (e.g., print its details).
         * Cricketer Class: The Cricketer class must implement the Serializable
         * interface. This marks the class as capable of being serialized and
         * deserialized.
         * serialVersionUID: If the Cricketer class has changed since the object was
         * serialized, you might get a InvalidClassException. To avoid this, the
         * Cricketer class should define a serialVersionUID field to ensure
         * compatibility between serialized and deserialized versions of the class.
         * File Path: The file path Revision.txt must exist, and the file must contain a
         * serialized Cricketer object. Otherwise, an IOException or
         * ClassNotFoundException will occur.
         */
        try (FileInputStream fis = new FileInputStream("D:\\Java\\Revision\\Revision.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Cricketer c = (Cricketer) ois.readObject();
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
        /*
         * What is serialVersionUID?
         * It is a unique identifier for a Serializable class.
         * When an object is serialized, the serialVersionUID is saved with it.
         * During deserialization, the serialVersionUID of the class is compared with
         * the one in the serialized object. If they don’t match, this error occurs.
         * You need to explicitly define a serialVersionUID in the Cricketer class to
         * ensure compatibility between serialized and deserialized objects, even if the
         * class changes.
         * Explanation:
         * serialVersionUID Field:
         * 
         * By explicitly defining serialVersionUID, you ensure that the serialized
         * object and the class remain compatible, even if minor changes are made to the
         * class.
         * The value 1L is arbitrary but should remain constant for the class.
         * Re-Serialization:
         * 
         * After adding the serialVersionUID, you need to re-run the serialization code
         * to create a new serialized file (Revision.txt) with the updated class.
         * Deserialization:
         * 
         * Once the file is updated, the deserialization code will work without the
         * serialVersionUID mismatch error.
         */
    }
}
