import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        File dir = new File("Revision");
        System.out.println(dir.isDirectory());
        File file = new File(dir, "Revision.txt");
        file.createNewFile();
        System.out.println("file is referring to Revision.txt :" + file.isFile());
        /*
         * print the list of all items present inside
         * any directory show file names and count
         */
        int count = 0;
        File f = new File("D:\\Java");
        /*
         * the <File reference>.list() creates a String[]
         * array containing all file names
         * present inside any directory
         */
        String[] l = f.list();
        /*
         * printing all the file names present inside
         * the String[] l which is a list of String type
         */
        // the files present inside D://Java are:
        for (String i : l) {
            count++;
            System.out.println(i);
        }
        System.out.println("the total number of files are: " + count);
    }
}
