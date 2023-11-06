package com;

public class Strings {

	public static void main(String[] args) {
	String s="software Developer";
	
	System.out.println(s.length());
	
	System.out.println(s.toUpperCase());
	
	System.out.println(s.toLowerCase());
	
	System.out.println(s.startsWith("soft"));
	
	System.out.println(s.endsWith("per"));
	
	System.out.println(s.contains("Dev"));
	
	System.out.println(s.concat(" in yu"));	//add extra word
	
	System.out.println(s.charAt(6));
	
	System.out.println(s.indexOf('s'));
	
	String a="manual";
	String b="Automation";
	String c="Manual";
	
	System.out.println(a.equals(b));//false
	
	System.out.println(a.equals(c));//true
	
	System.out.println(b.equals(c));//false
	System.out.println(a.equalsIgnoreCase(c));//true ignore cases
	
	String s1 ="amrutha kr";
	System.out.println(s1.substring(3));
	
	System.out.println(s1.substring(1,6));
	System.out.println(s1.substring(7));
	System.out.println(s1.substring(0,1));
	
	
	
	
	
	
	
	
	}

}
