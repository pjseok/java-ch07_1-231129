package Test;

import com.pjseok.ch07_1.People;

public class Solider extends People {

	public Solider(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void printName() {
		System.out.println("군인이름 : "+this.name);
		//super.printName();
	}
}
