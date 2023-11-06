package com;

public class Kangaroo_Global_Local_variable {
	double height=5.4; //Member global instance variable(non-static)
	
	void display()
	{
		double height=4.6;// Local variable
		System.out.println(height);
		System.out.println(this.height);
	}
// Local and member variable names can be same.(height height)
	
	public static void main(String[] args) {
		Kangaroo_Global_Local_variable  k=new Kangaroo_Global_Local_variable  ();
		k.display();
   
	}

}
