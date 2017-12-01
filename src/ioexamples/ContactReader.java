package ioexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class ContactReader {
    public static void main(String[] args) {
        File file = new File("src" + File.separatorChar + "contactList.txt");
        List<Contact> contacts = new ArrayList();
        
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String data = in.readLine();
            int counter = 0;
            Contact newContact = null;
            while (data != null){
                switch(counter % 3){
                    case 0:
                        newContact = new Contact();
                        newContact.setName(data);
                        break;
                    case 1:
                        newContact.setStreetAddress(data);
                        break;
                    case 2:
                        newContact.setCityStateZip(data);
                        contacts.add(newContact);
                        newContact = null;
                        break;
                }
                counter++;
            }	 
        } catch(IOException ioe) {
            System.out.println("Problem reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        for(Contact c : contacts){
            System.out.println(c);
        }
        
        System.out.println(contacts.get(1).getName() + " state:" + contacts.get(1).getCityStateZip().substring(','));
    }
}