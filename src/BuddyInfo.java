public class BuddyInfo {

    private String name;
    private String street;

    public BuddyInfo() {
        name = "Homer";
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    public BuddyInfo(String name, String street) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer");
        System.out.println("Hello " + buddy.getName());
    }
}