package question26;


	public class Singleton {
		
		//Declare a private static variable of the same type as your singleton class: This variable will hold the single instance of your singleton class.
	    private static Singleton instance;
	    
	    //Create a private constructor: This will prevent other classes from creating instances of your singleton class.
	    private Singleton() {
	        // Private constructor
	    }
	    
	    //Create a public static method that returns the instance of the singleton class: This method should check if the instance variable is null, and if so, create a new instance of the singleton class.
	    //If the instance variable is not null, it should return the existing instance.
	    
	    public static Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }
	}


