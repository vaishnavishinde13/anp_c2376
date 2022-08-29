package view;
import example.model.*;
import servicepackage.Service;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service sObj=new Service();
		Sum s=new Sum();
		int n=0;
	   n= s.calculateSum(100);
	    System.out.println("sum is" +n);

		Difference d=new Difference();
		int sumOfn=0;
		int sumSquare=0;
		int sumSqr=sumOfn*sumOfn;
		int diff=sumSquare-sumSqr;
		diff=d.calculateDifference(10);
		System.out.println("diff is" +diff);
		Demo2 d2=new Demo2();
		int length = (int) (Math.log10(n) + 1);
		int temp1=0, temp2=0;
		d2.checkIncreasing(10);
		Demo d1=new Demo();
		int result=2;
		boolean ans=false;
		ans=d1.checkpowOfTwo(10);
		System.out.println("diff is" +ans);
		
		
		

      
	}

}
