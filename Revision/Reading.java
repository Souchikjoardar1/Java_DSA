import java.io.*;

public class Reading {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Java\\Revision");
        File f = new File(dir, "Revision.txt");
        FileReader fr = new FileReader(f);
        int i = 0;
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
    }
}
