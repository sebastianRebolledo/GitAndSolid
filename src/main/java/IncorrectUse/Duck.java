package IncorrectUse;

public class Duck {

	String name;
	Integer maximumHeight;
	
	
	
	public Duck(String name, Integer maximumHeight) {
		this.name =name;
		this.maximumHeight =maximumHeight;
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void fly (int height) {
		if(Integer.valueOf(height).compareTo(maximumHeight)>0) {
			System.out.println("Srry, you cannot fly that height");
		}else if(Integer.valueOf(height).compareTo(Integer.valueOf(0))<=0){
			System.out.println("You cannot fly under 1 metters");
		}else {
			System.out.println(this.name + " is flying... The height is : "+ height);
		}
		
		
	}
	
	public void cuack() {
		System.out.println(this.name + " is saying CUACK...");
		
		
	}
	
	public void swim () {
		System.out.println(this.name + " is swimming...");
		
	}
	
	
	
	

}
