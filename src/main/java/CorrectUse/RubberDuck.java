package CorrectUse;

public class RubberDuck implements ISwim, ICuack {

	String name;
	
	
	public RubberDuck(String name) {
		this.name=name;
		
		
		
	}


	@Override
	public void swim() {
		System.out.println(this.name + " is swimming...");
		
	}

	@Override
	public void cuack() {
		System.out.println(this.name + " is saying CUACK!!");
		
	}

}
