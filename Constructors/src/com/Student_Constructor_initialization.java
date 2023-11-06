package com;

public class Student_Constructor_initialization {
	int age;
	Student_Constructor_initialization(int a)
	{
		age=a;
	}

	public static void main(String[] args) {
		Student_Constructor_initialization s1=new Student_Constructor_initialization(21);
		Student_Constructor_initialization s2=new Student_Constructor_initialization(22);
		
		System.out.println(s1.age);
		System.out.println(s2.age);

}
}