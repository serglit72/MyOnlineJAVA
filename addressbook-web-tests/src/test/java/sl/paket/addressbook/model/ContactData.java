package sl.paket.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String addressName;
    private final String phoneNumber;
    private final String emailAddress;
    private final String workPhone;

    public ContactData(String firstName, String lastName, String companyName, String addressName, String phoneNumber, String emailAddress, String workPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.addressName = addressName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.workPhone = workPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public String getWorkPhone() {
        return workPhone;
    }
}
