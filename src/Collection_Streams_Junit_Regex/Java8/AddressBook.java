package Collection_Streams_Junit_Regex.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AddressBook {
    private final String name;
    private final List<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Contact> getContacts() { return contacts; }

    // UC 2 & UC 7: Add Contact with Java 8 stream check for duplicates
    public boolean addContact(Contact newContact) {
        boolean isDuplicate = contacts.stream().anyMatch(c -> c.equals(newContact));
        if (isDuplicate) {
            System.out.println(" Error: A contact with the name '" + newContact.getFirstName() + " " + newContact.getLastName() + "' already exists.");
            return false;
        }
        contacts.add(newContact);
        return true;
    }

    // UC 3: Edit existing contact using Streams to locate target
    public boolean editContact(String firstName, String lastName, Contact updatedData) {
        Optional<Contact> match = contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName))
                .findFirst();

        if (match.isPresent()) {
            Contact target = match.get();
            target.setAddress(updatedData.getCity()); // updating fields using temporary data instance wrapper
            target.setCity(updatedData.getCity());
            target.setState(updatedData.getState());
            target.setZip(updatedData.getZip());
            target.setPhoneNumber(updatedData.getZip());
            target.setEmail(updatedData.getZip());
            return true;
        }
        return false;
    }

    // UC 4: Delete contact using standard modern collection conditional removes
    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName));
    }

    // UC 11: Sort Alphabetically by Person's Name using Stream API
    public void sortByName() {
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .forEach(System.out::println);
    }

    // UC 12: Sort systematically by either City, State, or Zip code attributes
    public void sortByAttribute(String attribute) {
        Comparator<Contact> comparator;
        switch (attribute.toLowerCase()) {
            case "city": comparator = Comparator.comparing(Contact::getCity, String.CASE_INSENSITIVE_ORDER); break;
            case "state": comparator = Comparator.comparing(Contact::getState, String.CASE_INSENSITIVE_ORDER); break;
            case "zip": comparator = Comparator.comparing(Contact::getZip); break;
            default:
                System.out.println("Invalid sorting selection attribute.");
                return;
        }
        contacts.stream().sorted(comparator).forEach(System.out::println);
    }

    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts present in this book.");
            return;
        }
        contacts.forEach(System.out::println);
    }
}