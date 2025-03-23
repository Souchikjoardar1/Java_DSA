import java.io.*;

public class File_handling {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Java\\Revision\\Revision.txt");
        System.out.println(file1.exists());// false
        file1.createNewFile();
        System.out.println(file1.exists());// true
        File dir = new File("D:\\Java\\Revision");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());
    }
}
