package com;

public class GLC_Person {
	int age;
	String name;
	
	GLC_Person(int age , String name)
	{
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		
		GLC_Person p1=new GLC_Person(21,"tom");
		GLC_Person p2=new GLC_Person(22,"tim");
		
		System.out.println("person details");
		System.out.println("------------");
		
		System.out.println(p1.age+" "+p1.name);
		System.out.println(p2.age+" "+p2.name);
	}

}

