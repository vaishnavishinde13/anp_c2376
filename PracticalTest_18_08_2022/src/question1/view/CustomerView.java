package question1.view;
import question1.model.*;
import question1.service.*;
public class CustomerView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer= new Customer(234,"Vaishnavi",22);
		CustomerService c=new CustomerService();
		boolean eligible;
		System.out.println(customer.getAge());
		eligible=c.checkEligibility(customer);
		if(eligible) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are  not eligible for voting");
		}
		
	}

}
