package question3;

public class SwapingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=125;
        int b=256;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap value of a=" +a);
        System.out.println("Swap value of b=" +b);
	}

}
