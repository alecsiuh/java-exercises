package com.example.mailinglist;

public class EmailAddress implements Comparable<EmailAddress> {
    private final String address;//new final String attribute

    public EmailAddress(String address) {
        if (EmailAddressVerification.isValidEmailAddress(address)) {//if the address is valid according to the EmailAddressVerification
            this.address = address;//initialise
        } else {
            throw new EmailAddressException("Invalid email address: \"" + address + "\".");//error message
        }
    }//constructor

    @Override
    public String toString() {
        return this.address;
    }//toString() method

    @Override
    public int compareTo(EmailAddress o) {
        return this.address.compareTo(o.address);
    }//compare addresses

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailAddress that = (EmailAddress) o;

        return address.equals(that.address);
    }//equals()

    @Override
    public int hashCode() {
        return address.hashCode();
    }//hashCode()
}
