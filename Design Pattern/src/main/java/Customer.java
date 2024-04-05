public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private boolean isCompany;

    // Constructor
    public Customer(String firstName, String lastName, String address, String phoneNumber, String email, boolean isCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isCompany = isCompany;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean isCompany() {
        return isCompany;
    }
    public void setCompany(boolean company) {
        isCompany = company;
    }
}
