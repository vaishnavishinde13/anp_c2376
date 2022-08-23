
public class Member {
String Name;
int Age;
int PhoneNumber;
String Address;
double Salary;
public Member(String name,int age,int phonenumber,String address,double salary) {
	super();
	this.Name=name;
	this.Age=age;
    this.PhoneNumber=phonenumber;
    this.Address=address;
    this.Salary=salary;
}

	public void printSalary () {
		// TODO Auto-generated method stub
	
     System.out.println("Salary of Member is" +Salary);
   
	}

}
