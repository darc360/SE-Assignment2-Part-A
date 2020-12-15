// Written by Darcie Howley

// Libraries
import java.time.LocalDate;

public class Test {

    public static void main(String args[]){
        // Initiating instances
        Passport passport = new Passport("Howley","Darcie","M","NLD",17321006, LocalDate.of(1998,3,5));

        // Print Methods
        System.out.println("Printing Passport Details");
        System.out.println(passport);
    }
}
