package com.app.mgm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A a = new A();
		//overloading
		 
		A.display(1);
		A.display(2,3);
		//B b = new B();
		//overriding
		 B.display(2,3);
		//A ab = new B(); //ok
		 B.display(3,3);
		// B ba = (B) new A();//?
		 B.display(4,3);

	}

}
