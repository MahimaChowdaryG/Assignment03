package question10;

import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent{
	
	
	void defaultMessage() throws Exception {
	      System.out.println("This is a default method in SuperClass");
	   }
	
	public void publicMessage() throws SQLException {
	      System.out.println("This is a public method in SuperClass");
	   }

}
