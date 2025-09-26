import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void printHi() {
        System.out.println("Hi");
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address book");
        System.out.println("step17");
        BuddyInfo buddy = new BuddyInfo("John", "123 Cool Street");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}

