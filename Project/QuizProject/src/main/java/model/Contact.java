package model;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> email;

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers, List<Email> email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Email> getEmailAddresses() {
        return email;
    }

    public void setEmailAddresses(List<Email> emailAddresses) {
        this.email = emailAddresses;
    }
    public String toJSON() {
        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"firstName\": \"" + firstName + "\", ");
        json.append("\"lastName\": \"" + lastName + "\", ");
        json.append("\"company\": \"" + company + "\", ");
        json.append("\"jobTitle\": \"" + jobTitle + "\", ");
        json.append("\"phoneNumbers\": [");
        for (int i = 0; i < phoneNumbers.size(); i++) {
            PhoneNumber phone = phoneNumbers.get(i);
            json.append("{\"number\": \"" + phone.getNumber() + "\", \"label\": \"" + phone.getLabel() + "\"}");
            if (i < phoneNumbers.size() - 1) {
                json.append(", ");
            }
        }
        json.append("], ");
        json.append("\"emailAddresses\": [");
        for (int i = 0; i < email.size(); i++) {
            Email emails = email.get(i);
            json.append("{\"address\": \"" + emails.getAddress() + "\", \"label\": \"" + emails.getLabel() + "\"}");
            if (i < email.size() - 1) {
                json.append(", ");
            }
        }
        json.append("]");
        json.append("}");
        return json.toString();
    }
}


