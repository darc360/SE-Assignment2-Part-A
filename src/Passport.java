// Written By Darcie Howley

// Libraries
import java.time.LocalDate;

public class Passport {

    // Private Variables
    private String surName;
    private String firstName;
    private String nationality;
    private String sex;
    private int passportNumber;
    private LocalDate dateOfBirth;

    // Constructor
    public Passport(String surName, String firstName, String nationality, String sex, int passportNumber,LocalDate dateOfBirth) {
        this.surName = firstName;
        this.firstName = surName;
        this.nationality = nationality;
        this.sex = sex;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSex() {
        return sex;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Tostring method
    @Override
    public String toString() {
        return "Name: "+surName+" "+firstName+"\nSex: "+sex+"\nNationality: "+nationality
                +"\nPassport Number: "+passportNumber+"\nDate of Birth: "+dateOfBirth;
    }
}
