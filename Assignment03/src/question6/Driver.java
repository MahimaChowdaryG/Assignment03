package question6;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Patterns";
		s = s.concat("Frameworks"); // Here a new string object will be created
        System.out.println(s);
        
        StringBuffer sb = new StringBuffer("Patterns");
        sb.append("Frameworks"); // Here a new object will not be created,it modifies the existing object
        System.out.println(sb);
	}

}
