package question1.service;
import question1.model.*;


public class CustomerService {
	public boolean checkEligibility(Customer c) {
		//System.out.println(c.getAge());println for end user
		if(c.getAge()>=18) {
			return true;
		}
		else {
			return false;
		}
		
}

	

}
