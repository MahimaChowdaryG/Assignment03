package question26;


	public class Singleton {
	    private static MySingleton instance;
	    
	    private MySingleton() {
	        // Private constructor
	    }
	    
	    public static MySingleton getInstance() {
	        if (instance == null) {
	            instance = new MySingleton();
	        }
	        return instance;
	    }
	}


