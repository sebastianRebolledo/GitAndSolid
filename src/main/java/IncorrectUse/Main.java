package IncorrectUse;

public class Main {

	public Main() {
		
		Duck a = new Duck("Alexis", 140);
		a.swim();
		a.fly(100);
		a.cuack();
		
		RubberDuck b = new RubberDuck("Mario", null);
		b.swim();
		b.cuack();
		b.fly(100);
		
		
		
		
		
	}

	public static void main(String[] args) {
		Main m = new Main();

	}

}
