
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Vaishnavi",21,98526341,"Ahmednagae",30000);
		System.out.println(emp.Name);
		System.out.println(emp.Age);
		System.out.println(emp.PhoneNumber);
		System.out.println(emp.Address);
		emp.printSalary();
		System.out.println("..............................");
		Manager man=new Manager("Akash",27,85243621,"Mumbai",80000);
		System.out.println(man.Name);
		System.out.println(man.Age);
		System.out.println(man.PhoneNumber);
		System.out.println(man.Address);
        man.printSalary();

	}

}
