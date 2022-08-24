package org.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ballObj=new Ball();
        Tyre tyreObj=new Tyre();
        ballObj.bounce();
        tyreObj.bounce();
        tyreObj.move();
	}

}
