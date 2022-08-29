package question1;

import question1.Degree;

public class Main {
	static int count;
	static int CountObjects(Degree degree) {
		count++;
        return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree degree=new Degree();
		degree.getDegree();
		Undergraduate ug=new Undergraduate();
		ug.getDegree();
		Postgraduate pg=new Postgraduate();
		pg.getDegree();
	    count=Main.CountObjects(degree);
	    count=Main.CountObjects(ug);
	    count=Main.CountObjects(pg);
		
		
		
	}

}
