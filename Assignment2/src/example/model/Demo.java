package example.model;

public class Demo {

	public boolean checkpowOfTwo(int n) {
		int result=2;
		boolean ans=false;
//		do{
//			result=result*2;
//			if(result==n) {
//				ans=true;
//				break;
//			}
//		}while(result<=n);\
		if(n<0) {
			return ans;
		}
		while(result<=n) {
			if(result==n) {
				ans=true;
				break;
			}
			result=result*2;
		}
		return ans;
	}
}
