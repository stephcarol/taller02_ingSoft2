package labcodeinspection;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter your last name: ");
            String lastName = sc.nextLine();

            System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");
            int depChoice = sc.nextInt();

            Email email = new Email(firstName, lastName);
            email.setDeparment(depChoice);
            email.generateEmail();
            email.showInfo();
        }
    }
}

