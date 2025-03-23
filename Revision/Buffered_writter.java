import java.io.*;

public class Buffered_writter {
    public static void main(String[] args) throws IOException {
        /*
         * 1. File dir = new File("D:\\Java\\Revision");
         * Purpose: Creates a File object representing the directory Revision.
         * What it does:
         * It doesn't create the directory; it just creates a reference to it.
         * If the directory doesn't exist, you can check and create it using
         * dir.mkdirs() (not shown in this code).
         * Why it's needed: To specify the location where the file will be created or
         * accessed.
         * 2. File f = new File(dir, "Revision.txt");
         * Purpose: Creates a File object representing the file Revision.txt inside the
         * directory Revision.
         * What it does:
         * Combines the directory (dir) and the file name (Revision.txt) to create a
         * reference to the file.
         * It doesn't create the file yet; it just creates a reference to it.
         * Why it's needed: To specify the file where data will be written.
         * 3. FileWriter fw = new FileWriter(f, true);
         * Purpose: Creates a FileWriter object to write data to the file Revision.txt.
         * What it does:
         * Opens the file for writing.
         * The second parameter (true) means append mode:
         * If true, new data will be added to the end of the file without overwriting
         * existing content.
         * If false (or omitted), the file's content will be overwritten.
         * If the file doesn't exist, it will be created automatically.
         * Why it's needed: To provide a low-level mechanism for writing characters to
         * the file.
         * 4. BufferedWriter bw = new BufferedWriter(fw);
         * Purpose: Wraps the FileWriter with a BufferedWriter to improve writing
         * efficiency.
         * What it does:
         * Adds a buffer (temporary memory) to the FileWriter.
         * Instead of writing each character directly to the file, it collects multiple
         * characters in the buffer and writes them all at once. This reduces the number
         * of disk I/O operations, making it faster.
         * Why it's needed: To improve performance when writing large amounts of data to
         * the file.
         * Summary of the Process
         * A reference to the directory (Revision) is created.
         * A reference to the file (Revision.txt) inside that directory is created.
         * A FileWriter is created to write data to the file in append mode.
         * A BufferedWriter is created to wrap the FileWriter for efficient writing.
         */
        File dir = new File("D:\\Java\\Revision");
        File f = new File(dir, "Revision.txt");
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java is so damn cool !");
        bw.newLine();
        bw.write(95);
        char ch[] = { 'a', 'e', 'r' };
        bw.write(ch);
        bw.close();
        /*
         * What Happens Next?
         * After these lines, you can use the BufferedWriter (bw) to write data to the
         * file. For example:
         * 
         * bw.write("java is so damn cool !"); writes a string to the file.
         * bw.newLine(); adds a new line.
         * bw.write(95); writes the character corresponding to ASCII value 95 (_).
         * bw.write(ch); writes the characters from the array ch (aer).
         */
    }
}
