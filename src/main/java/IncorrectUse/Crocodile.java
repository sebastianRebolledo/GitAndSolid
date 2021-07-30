package IncorrectUse;

public class Crocodile implements IFlyAndSwim{

	String name;
	
	public Crocodile(String name) {
		this.name= name;
	}
	
	

	
	
	
	@Override
	public void fly(int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		System.out.println(this.name + " Crocodile is swimming");
		
	}

}
