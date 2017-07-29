import java.util.Scanner;

/**
 * Created by ac003588 on 7/28/2017.
 */
public class MobilePhone {
    Scanner reader = new Scanner(System.in);
    Contacts contacts = new Contacts();


    public MobilePhone(){
        this.contacts = contacts;
    }


    public void ContactsMenu() {


        boolean inMenu = true;
        while (inMenu) {
            System.out.println("Contacts Menu" + System.lineSeparator() + "Options: 1: Print Contacts" + System.lineSeparator() +
                    "\t\t 2: Add Contact" + System.lineSeparator() +
                    "\t\t 3: Update Contact Phone" + System.lineSeparator() +
                    "\t\t 4: Remove Contact " + System.lineSeparator() +
                    "\t\t 5: Search for Contact" + System.lineSeparator() +
                    "\t\t 6: Exit" + System.lineSeparator());
            String option = reader.next();
            int n = Integer.parseInt(option);
            switch (n) {
                case 1:
                    contacts.listContacts();
                    break;
                case 2:
                    System.out.println("Name: ");
                    String name1 = reader.next();
                    System.out.println("Phone: ");
                    String phone1 = reader.next();
                    contacts.addContact(name1, phone1);
                    break;
                case 3:
                    System.out.println("Please enter contact to update: ");
                    String name2 = reader.next();
                    System.out.println("Please enter new phone");
                    String phone2 = reader.next();
                    contacts.updatePhone(name2, phone2);
                    break;
                case 4:
                    System.out.println("Please enter the contact name to remove: ");
                    String name3 = reader.next();
                    contacts.removeContact(name3);
                    break;
                case 5:
                    System.out.println("Please enter contact name: ");
                    String name4 = reader.next();
                    contacts.searchContacts(name4);
                case 6:
                    inMenu = false;
            }
        }
    }
}
