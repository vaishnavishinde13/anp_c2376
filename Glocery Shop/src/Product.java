
public class Product {
	String name;
	double price;
	public Product() {
		System.out.println("Constructor");

}
	public Product(String productName,double productPrice) {
		name=productName;
		price=productPrice;
		System.out.println(name+ "" +price);
	}
	public Product(double pPrice) {
		price=pPrice;
		System.out.println(price);
	}
}
