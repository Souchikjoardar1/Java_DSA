import java.io.*;

public class Buffered_writter {
    public static void main(String[] args) throws IOException {
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
    }
}
