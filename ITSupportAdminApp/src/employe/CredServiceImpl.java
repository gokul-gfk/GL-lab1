package employe; 

import java.util.Random;

import credService.CredService; 

public class CredServiceImpl implements CredService {
    @Override
    public String generatePassword() {
		String password = "";
		
		String generate="abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		Random rm = new Random();
		char temp;
		for(int i=0; i<8; i++) {
			password += String.valueOf(generate.charAt(rm.nextInt(generate.length())));
		}
		
		return password;
}

    @Override
    public String generateEmailAddress(String firstName, String lastName, String department) {
        String email = (firstName + lastName + "@" + department + ".gfk.com").toLowerCase();
        
        return email;
    }

    @Override
    public void showCredentials(Employee employee) {
        System.out.println("Employee Credentials:");
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Password: " + generatePassword());
    }
}
