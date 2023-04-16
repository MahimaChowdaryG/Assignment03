package question10;

import java.io.IOException;
import java.sql.SQLException;

public class Parent {
	
		
		void defaultMessage() throws IOException {
		      System.out.println("This is a default method in SuperClass");
		   }
		
		protected void publicMessage() throws IOException, SQLException {
		      System.out.println("This is a public method in SuperClass");
		   }
		
		
		

}
