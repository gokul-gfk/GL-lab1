package main;

import java.util.Scanner;
import employe.Employee;
import employe.CredServiceImpl;

public class EmailGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome page");
        System.out.println("---------------------");
        
        
        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        
        Employee e1 = new Employee(firstName, lastName);
        CredServiceImpl cs = new CredServiceImpl();

        System.out.println("Please enter an option for the department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Integer sw = sc.nextInt();
        String generatedEmail = null;
        String generatedPassword = null;

        switch (sw) {
            case 1: {
                generatedEmail = cs.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "Tech");
                generatedPassword = cs.generatePassword();
                break;
            }
            case 2: {
                generatedEmail = cs.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "Admin");
                generatedPassword = cs.generatePassword();
                break;
            }
            case 3: {
                generatedEmail = cs.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "HR");
                generatedPassword = cs.generatePassword();
                break;
            }
            case 4: {
                generatedEmail = cs.generateEmailAddress(e1.getFirstName(), e1.getLastName(), "Legal");
                generatedPassword = cs.generatePassword();
                break;
            }
            default: {
                System.out.println("Please enter a valid option.");
                break;
            }
        }

        if (generatedEmail != null) {
            e1.setEmail(generatedEmail);
            e1.setPassword(generatedPassword);
            cs.showCredentials(e1);
        }
        sc.close();
    }
}
