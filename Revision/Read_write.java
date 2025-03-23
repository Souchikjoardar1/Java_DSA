import java.io.*;

public class Read_write {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Java\\Revision");

        File file = new File(dir, "Revision.txt");
        // if append is true for filewritter then the new data will not overwrite the
        // pre-existing data
        FileWriter fw = new FileWriter(file, true);
        fw.write("I love java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = { 'a', 'e', 'i', 'o', 'u' };
        fw.write(ch);
        fw.write("\n");
        fw.close();
    }
}
