package question2;

public class Child extends Parent{
	
	
	private void printMessage() {
	      System.out.println("This is a private method in SuperClass");
	   }
	
	private void printMessagedefault() {
	      System.out.println("This is a default method in SuperClass");
	   }
	
    void printMessageprotected() {
	      System.out.println("This is a protected method in SuperClass");
	   }
    
    protected void printMessagepublic() {
	      System.out.println("This is a public method in SuperClass");
	   }

}
