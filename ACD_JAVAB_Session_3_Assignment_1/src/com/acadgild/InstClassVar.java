package com.acadgild;

public class InstClassVar {

	int age=25;
	static int salary=2000;
	
	public void display1(){
		
		System.out.println("Printing instance variable age in display method:"+age);
		System.out.println("Printing static variable age in display method:"+salary);
		
	}
	
/*public static void display2(){
		
		System.out.println("Printing instance variable age in display method:"+age);
		System.out.println("Printing static variable age in display method:"+salary);
		
	}*/
public static void main(String[] args) {
	
	InstClassVar instClassVar=new InstClassVar();
	
	//Scope inside main method
	System.out.println("Printing instance variable age in main method:"+instClassVar.age);
	System.out.println("Printing static variable salary in main method:"+salary);
	
	instClassVar.display1();
	//instClassVar.display2();
	}	

}
