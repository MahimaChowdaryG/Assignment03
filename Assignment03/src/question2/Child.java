package question2;

public class Child extends Parent{
	
	
	private void message() {
	      System.out.println("This is a private method in SuperClass");
	   }
	
	private void messagedefault() {
	      System.out.println("This is a default method in SuperClass");
	   }
	
    void messageprotected() {
	      System.out.println("This is a protected method in SuperClass");
	   }
    
    protected void messagepublic() {
	      System.out.println("This is a public method in SuperClass");
	   }

}
