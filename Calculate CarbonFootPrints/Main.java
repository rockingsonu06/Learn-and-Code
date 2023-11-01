package com.carbonfootprints;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Entity (email, server, something):");
        String entity = input.next();

        switch (entity) {
            case "email":
                System.out.println("Please Enter the Email:");
                String mail = input.next();
                System.out.println("Enter the number of emails:");
                int numberOfEmails = input.nextInt();
                System.out.println("Enter the number of sent emails:");
                int numberOfSentEmails = input.nextInt();
                System.out.println("Enter the number of spam emails:");
                int numberOfSpamEmails = input.nextInt();

                Email emails = new Email(mail, numberOfEmails, numberOfSpamEmails, numberOfSentEmails);
                emails.calculateTotalCarbonFootprints();
                emails.displayTotalCarbonFootprints();
                break;

            case "server":
                System.out.println("Server entity is not implemented yet.");
                break;

            case "something":
                System.out.println("Something entity is not implemented yet.");
                break;

            default:
                System.out.println("Unsupported entity type: " + entity);
                break;
        }
    }
}
