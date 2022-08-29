package example.model;

public class Demo2 {
	public boolean checkIncreasing(int n) {
		//Getting length of Number.
		int length = (int) (Math.log10(n) + 1);
		int temp1=0, temp2=0;
		
		for(int i=1; i<=length; i++) {
			temp1 = n%10;
			n=n/10;
			temp2=n%10;
			if(temp1<temp2) {
				break;
			}
			if(i==length) {
				return true;
			}	
		}
		return false;
	}
	
}


