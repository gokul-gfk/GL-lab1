package credService;

import employe.Employee;

public interface CredService {
	public String generatePassword();
	public String generateEmailAddress(String firstName, String lastName,String deparment); 
	public void showCredentials(Employee employee); 

}
