package org.game;

public class Tyre implements Bounsable,Movable {
	
	public void bounce() {
		System.out.println("I am a bouncing Tyre");
		System.out.println(Bounsable.var1);
	}

	public void move() {
		System.out.println("I am a moving tyre");
	}
	

}
