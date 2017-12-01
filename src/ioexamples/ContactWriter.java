package ioexamples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Isaac
 */
public class ContactWriter {
    public static void main(String[] args) throws IOException {
        boolean append = true;
        File file = new File("src" + File.separatorChar + "contactList.txt");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
        
        out.println("Billy Bob Jones");
        out.println("987 S 108th St");
        out.println("Franklin, WI 53132");
        
        out.println("George Jefferson");
        out.println("1111 W State St");
        out.println("Milwaukee, WI 53172");
        
        out.close();
    }
}