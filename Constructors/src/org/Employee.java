package org;

class Employee {

	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {    // display() ->Perform some specific Tast.
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		
	}
	public static void main(String[] args) {
		
    Employee e1=new Employee(1,"a",20000);
    Employee e2=new Employee(2,"b",10000);
    
    System.out.println("Employee details");
    System.out.println("-----------------");
    
 /*System.out.println(e1.name);
   System.out.println(e1.id);
 System.out.println(e1.salary);
    System.out.println("---------");
    
    System.out.println(e2.name);
    System.out.println(e2.id);
    System.out.println(e2.salary);
    
    System.out.println("==================");*/
    
    e1.display();
    System.out.println("---------------------");
    e2.display();
	}

}
