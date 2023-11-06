package constructor_overloading;

class ConOver {
	
	 ConOver(int age,String name)
	{
		System.out.println(age+" "+"name");
	}
	 ConOver(String name,int age,double salary)
	 {
		 System.out.println("name"+" "+age+" "+salary);
	 } 
	 ConOver()
	 {
		 System.out.println("zero argument constructor");
	 }
	 
	 ConOver(double salary,String name)
	 {
		 System.out.println(salary+" "+"name");
	 }
	
 public static void main(String[] args) {
	 ConOver co=new ConOver("A",22,8000);
	 ConOver co1=new ConOver(22,"abc");// (object creation 1st type)
	 new ConOver(80000,"a");//object creation(2 type)
	 new ConOver();
		

	}

}
