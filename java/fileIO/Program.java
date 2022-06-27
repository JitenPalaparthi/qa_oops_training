import java.io.*;
import java.util.*;

public class Program {

    public static void main(String[] args) throws IOException {

        readData("customers.json");
        appendFile("customers1.json","{'message':'customer date appended'}\n");
    }

    public static void readData(String filepath) throws IOException {
        File file = new File(filepath);

        // FileReader reader = new FileReader(file);

        // int i;
        // while((i=reader.read())!=-1)
        // System.out.print((char)i);

        // reader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void appendFile(String inFile, String line) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(inFile, true));
        out.write(line);
        out.close();
    }
}
