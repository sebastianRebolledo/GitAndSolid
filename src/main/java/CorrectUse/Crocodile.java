package CorrectUse;

public class Crocodile implements ISwim{

	String name;
	
	public Crocodile(String name) {
		this.name= name;
	}
	
	



	@Override
	public void swim() {
		System.out.println(this.name + " Crocodile is swimming");
		
	}

}
