package com;

public class Practice {
	int age=24;
	void display()
	{
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		Practice p=new Practice();
		p.display();

	}

}
