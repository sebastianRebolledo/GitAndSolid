package IncorrectUse;

public class Main {

	public Main() {
		
		Duck a = new Duck("Alexis", 140);
		a.swim();
		a.fly(100);


		
		
		Crocodile c = new Crocodile("Camilo");
		c.swim();
		c.fly(13);
		
		
		
		
		
	}

	public static void main(String[] args) {
		Main m = new Main();

	}

}
