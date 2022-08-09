package authright.java.learning;


public class MyInnerPerson{
	public MyInnerPerson(){}

	public void printInner1(){
		System.out.println("Inner print method 1 in MyPerson");
	}

	protected void printInner2(){
		System.out.println("Inner print method 2 in MyPerson");	
	}

	private void printInner3(){
		System.out.println("Inner print method 3 in MyPerson");
	}

	public void useInner3(){
		printInner3();
	}

}