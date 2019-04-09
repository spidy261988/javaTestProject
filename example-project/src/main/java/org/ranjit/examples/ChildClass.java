package org.ranjit.examples;

public class ChildClass extends ParentClass{

	@Override
	public void hairColor() {
		// TODO Auto-generated method stub
		super.hairColor();
		System.out.println("Child hair is also long");
	}
	
	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		c1.hairColor();
	}

}
