import java.io.*;

public class Print_writer {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Java\\Revision");
        File f = new File(dir, "Revision.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        // this converts integer into ascii code doen't store the actual integer value
        pw.write(100);
        pw.write("\n");
        /*
         * inorder to write double boolean and string values
         * directly into the file without converting into char
         * use println/print methods inside the printwriter
         * class
         */
        pw.println(true);
        pw.print('a');
        pw.println("java");
        pw.println(45.67);
    }
}
