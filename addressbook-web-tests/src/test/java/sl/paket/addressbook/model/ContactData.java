package sl.paket.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;

@Entity
@Table (name = "addressbook")
@XStreamAlias("contact")
public class ContactData {
    // @XStreamOmitField

    @Id
    @Column (name = "id")
    private int id ;

    @Column (name = "firstname")
    private String firstName;

    @Column (name = "lastname")
    private String lastName;

    @Column (name = "address")
    @Type(type = "text")
    private String addressName;

    @Column (name = "home")
    @Type(type = "text")
    private String phoneHome;

    @Column (name = "mobile")
    @Type(type = "text")
    private String phoneMobile;

    @Column (name = "work")
    @Type(type = "text")
    private String phoneWork;

    @Column (name = "email")
    @Type(type = "text")
    private String emailAddress;

   @Transient
   private String emailAddress1;
    @Transient
    private String emailAddress2;
    @Transient
    private String allPhones;
    @Transient
    private String allEmails;

    @Column (name = "photo")
    @Type(type = "text")
    private String photo;

    public File getPhoto() {
        return  new File(photo);
    }

    public ContactData withPhoto (File photo) {
        this.photo = photo.getPath();
        return this;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;
        if (phoneHome != null ? !phoneHome.equals(that.phoneHome) : that.phoneHome != null) return false;
        if (phoneMobile != null ? !phoneMobile.equals(that.phoneMobile) : that.phoneMobile != null) return false;
        if (phoneWork != null ? !phoneWork.equals(that.phoneWork) : that.phoneWork != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (emailAddress1 != null ? !emailAddress1.equals(that.emailAddress1) : that.emailAddress1 != null)
            return false;
        if (emailAddress2 != null ? !emailAddress2.equals(that.emailAddress2) : that.emailAddress2 != null)
            return false;
        if (allPhones != null ? !allPhones.equals(that.allPhones) : that.allPhones != null) return false;
        return allEmails != null ? allEmails.equals(that.allEmails) : that.allEmails == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        result = 31 * result + (phoneHome != null ? phoneHome.hashCode() : 0);
        result = 31 * result + (phoneMobile != null ? phoneMobile.hashCode() : 0);
        result = 31 * result + (phoneWork != null ? phoneWork.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (emailAddress1 != null ? emailAddress1.hashCode() : 0);
        result = 31 * result + (emailAddress2 != null ? emailAddress2.hashCode() : 0);
        result = 31 * result + (allPhones != null ? allPhones.hashCode() : 0);
        result = 31 * result + (allEmails != null ? allEmails.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressName='" + addressName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneHome='" + phoneHome + '\'' +
                ", phoneMobile='" + phoneMobile + '\'' +
                ", phoneWork='" + phoneWork + '\'' +

             //   ", emailAddress1='" + emailAddress1 + '\'' +
             //   ", emailAddress2='" + emailAddress2 + '\'' +
             //   ", allPhones='" + allPhones + '\'' +
             //   ", allEmails='" + allEmails + '\'' +
                '}';
    }


    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactData withAddressName(String addressName) {
        this.addressName = addressName;
        return this;
    }

    public ContactData withPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
        return this;
    }

    public ContactData withPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
        return this;
    }

    public ContactData withPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
        return this;
    }
    public ContactData withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;

    }
    public ContactData withEmailAddress1(String emailAddress1) {
        this.emailAddress1 = emailAddress1;
        return this;

    }
    public ContactData withEmailAddress2(String emailAddress2) {
        this.emailAddress2 = emailAddress2;
        return this;

    }

    public ContactData withAllEmailAddress(String allEmails) {
        this.allEmails = allEmails;
        return this;

    }


    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddressName() {
        return addressName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getEmailAddress1() {
        return emailAddress1;
    }
    public String getEmailAddress2() {
        return emailAddress2;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public String getPhoneWork() {
        return phoneWork;
    }


    public String getAllPhones() {
        return allPhones;
    }


    public String getAllEmails() {
        return allEmails;
    }
}


