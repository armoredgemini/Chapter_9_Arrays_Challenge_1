import java.util.HashMap;

/**
 * Created by ac003588 on 7/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        // Create contact list
        ContactList cl = new ContactList();
//        Contact p1 = new Contact("bob", "smith");
 //       cl.addContact(p1);
//        Contact joe = cl.searchContacts("smith");
//        if(joe == null) {
//            System.out.println("Joe not found");
//        } else {
//            System.out.println(joe.toString());
//        }


MobilePhone m1 = new MobilePhone(cl);
m1.ContactsMenu();


    }
}
