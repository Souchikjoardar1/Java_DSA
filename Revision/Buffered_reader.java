import java.io.*;

public class Buffered_reader {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Java\\Revision");
        File f = new File(dir, "Revision.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        /*
         * this will print the string line by line if it reads an empty line it points
         * to null , buffered reader/writter can't read/write
         * boolean float or double type of data for that we
         * use printwriter
         */
        String line = "";
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
