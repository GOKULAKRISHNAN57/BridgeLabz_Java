package Collection_Streams_Junit_Regex.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {
    // UC 6: Maintain Dictionary of Address Book Name to Address Book instances
    private static final Map<String, AddressBook> addressBookMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Master branch startup message initialization requirement

        System.out.println("  Welcome to Address Book Program System ");

        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("\n--- SYSTEM CONTROLLER MENU ---");
            System.out.println("1. Manage Specific Address Book");
            System.out.println("2. Create New Address Book");
            System.out.println("3. Global Search Person by City/State (UC 8)");
            System.out.println("4. Global View Mapping by City/State (UC 9)");
            System.out.println("5. Global Count of Contacts by City/State (UC 10)");
            System.out.println("6. Exit Global Application");
            System.out.print("Select Option: ");
            
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": manageAddressBookMenu(); break;
                case "2": createAddressBook(); break;
                case "3": globalSearchPerson(); break;
                case "4": globalViewByLocation(); break;
                case "5": globalCountByLocation(); break;
                case "6": exitSystem = true; break;
                default: System.out.println("Invalid entry code selection.");
            }
        }
    }

    private static void createAddressBook() {
        System.out.print("Enter structural name for new Address Book: ");
        String name = scanner.nextLine().trim();
        if (addressBookMap.containsKey(name.toLowerCase())) {
            System.out.println("An Address Book named '" + name + "' already exists.");
            return;
        }
        addressBookMap.put(name.toLowerCase(), new AddressBook(name));
        System.out.println("Address Book '" + name + "' initialized successfully.");
    }

    // UC 8: Search across multiple books using flatMap pipeline chains
    private static void globalSearchPerson() {
        System.out.print("Search by (1) City or (2) State? Input option number: ");
        String type = scanner.nextLine().trim();
        System.out.print("Enter target location search query name: ");
        String query = scanner.nextLine().trim();

        List<Contact> results = addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> type.equals("1") ? c.getCity().equalsIgnoreCase(query) : c.getState().equalsIgnoreCase(query))
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            System.out.println("No matching matches found across books.");
        } else {
            results.forEach(System.out::println);
        }
    }

    // UC 9: View mapping dictionaries processed completely via Stream collectors
    private static void globalViewByLocation() {
        System.out.print("Group view database by (1) City or (2) State? Input choice: ");
        String opt = scanner.nextLine().trim();

        if (opt.equals("1")) {
            Map<String, List<Contact>> cityDictionary = addressBookMap.values().stream()
                    .flatMap(book -> book.getContacts().stream())
                    .collect(Collectors.groupingBy(c -> c.getCity().toLowerCase()));
            
            cityDictionary.forEach((city, list) -> {
                System.out.println("\n📍 CITY: " + city.toUpperCase());
                list.forEach(c -> System.out.println("  - " + c));
            });
        } else {
            Map<String, List<Contact>> stateDictionary = addressBookMap.values().stream()
                    .flatMap(book -> book.getContacts().stream())
                    .collect(Collectors.groupingBy(c -> c.getState().toLowerCase()));

            stateDictionary.forEach((state, list) -> {
                System.out.println("\n🗺️ STATE: " + state.toUpperCase());
                list.forEach(c -> System.out.println("  - " + c));
            });
        }
    }

    // UC 10: Counts by specified structural locations using Stream counting terminators
    private static void globalCountByLocation() {
        System.out.print("Get totals tracking by (1) City or (2) State? Input choice: ");
        String choice = scanner.nextLine().trim();
        System.out.print("Enter specific target location string: ");
        String location = scanner.nextLine().trim();

        long count = addressBookMap.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> choice.equals("1") ? c.getCity().equalsIgnoreCase(location) : c.getState().equalsIgnoreCase(location))
                .count();

        System.out.println("Total matching entries found inside tracking metrics: " + count);
    }

    private static void manageAddressBookMenu() {
        if (addressBookMap.isEmpty()) {
            System.out.println("No books created yet. Choose option 2 first.");
            return;
        }
        System.out.print("Enter target Address Book name to operate within: ");
        String name = scanner.nextLine().trim().toLowerCase();
        if (!addressBookMap.containsKey(name)) {
            System.out.println("Book registry entry not discovered.");
            return;
        }
        AddressBook book = addressBookMap.get(name);

        boolean returnToMain = false;
        while (!returnToMain) {
            System.out.println("\n--- MANAGING BOOK: " + book.getName() + " ---");
            System.out.println("1. Add Contact (UC 2 / UC 5)");
            System.out.println("2. Edit Contact (UC 3)");
            System.out.println("3. Delete Contact (UC 4)");
            System.out.println("4. Sort Alphabetically by Name (UC 11)");
            System.out.println("5. Sort by Attribute (City/State/Zip) (UC 12)");
            System.out.println("6. Display All Elements");
            System.out.println("7. Return to Global Master Root Menu");
            System.out.print("Selection: ");
            String act = scanner.nextLine().trim();

            switch (act) {
                case "1": book.addContact(promptForContactDetails()); break;
                case "2":
                    System.out.print("Enter First Name to modify: "); String f = scanner.nextLine();
                    System.out.print("Enter Last Name to modify: "); String l = scanner.nextLine();
                    book.editContact(f, l, promptForContactDetails());
                    break;
                case "3":
                    System.out.print("First Name to remove: "); String df = scanner.nextLine();
                    System.out.print("Last Name to remove: "); String dl = scanner.nextLine();
                    if (book.deleteContact(df, dl)) System.out.println("Successfully cleared entry.");
                    else System.out.println("Contact details not matched.");
                    break;
                case "4": book.sortByName(); break;
                case "5":
                    System.out.print("Sort by (city, state, or zip): ");
                    book.sortByAttribute(scanner.nextLine().trim());
                    break;
                case "6": book.displayAll(); break;
                case "7": returnToMain = true; break;
            }
        }
    }

    private static Contact promptForContactDetails() {
        System.out.print("First Name: "); String f = scanner.nextLine();
        System.out.print("Last Name: "); String l = scanner.nextLine();
        System.out.print("Address: "); String a = scanner.nextLine();
        System.out.print("City: "); String c = scanner.nextLine();
        System.out.print("State: "); String s = scanner.nextLine();
        System.out.print("Zip: "); String z = scanner.nextLine();
        System.out.print("Phone Number: "); String p = scanner.nextLine();
        System.out.print("Email: "); String e = scanner.nextLine();
        return new Contact(f, l, a, c, s, z, p, e);
    }
}