package CorrectUse;

import CorrectUse.Duck;
import CorrectUse.RubberDuck;

public class Main {

	public Main() {
		Duck a = new Duck("Alexis", 125);
	
		
		a.fly(1);
		a.swim();
		a.cuack();
		
		
		
		RubberDuck b = new RubberDuck("Donald");
		b.swim();
		b.cuack();
		
		
		
		Crocodile c = new Crocodile("Camilo");
		c.swim();
		
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		

	}

}
