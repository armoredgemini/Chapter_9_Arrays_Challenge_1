import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ac003588 on 7/28/2017.
 */
public class Contacts {

    HashMap hm = new HashMap();

    public void listContacts() {
        if(!hm.isEmpty()) {
            System.out.println(hm);
        } else {
            System.out.println("No Contacts");
        }

    }

    private void addEntry(String name, String phone) {
        hm.put(name, phone);
    }

    public void addContact(String name, String phone) {
        addEntry(name, phone);
    }

    public void searchContacts(String name) {
        if(hm.get(name) == name) {
            System.out.println(hm.get(name).toString());
        } else {
            System.out.println("Contact does not exist");
        }
    }

    public void updatePhone(String name, String newPhone) {
        modifyPhone(name, newPhone);
    }

    private void modifyPhone(String name, String newPhone) {
        hm.put(name, newPhone);
    }

    private void modifyName(String name, String newName) {
            if(hm.containsKey(name)) {
            String phone = hm.get(name).toString();
            hm.put(newName, phone);
            hm.remove(name);
            System.out.println("Contact " + name + " has been updated to " + newName);
        } else System.out.printf("Name " + name + " not found ");
    }

    public void changeName(String name, String newName) {
        modifyName(name, newName);
    }

    public void removeContact(String name) {
        //System.out.println("Entered name is: " + name);
        if(hm.containsKey(name)) {
            hm.remove(name);
        } else {
            System.out.println("Contact " + name + " does not exist");
        }
    }

}
