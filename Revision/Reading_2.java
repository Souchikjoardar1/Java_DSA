import java.io.*;

public class Reading_2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Java\\Revision");
        File f = new File(dir, "Revision.txt");
        FileReader fr = new FileReader(f);
        // file.length() returns long type of values so I typecasted it into integer
        char ch[] = new char[(int) f.length()];
        fr.read(ch);
        // storing the size of the file f
        for (char c : ch) {
            System.out.print(c);
        }
        fr.close();
    }
}
