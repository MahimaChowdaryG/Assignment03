package question6;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		str = str.concat(" World"); // This creates a new string object
        System.out.println(str);
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // This modifies the existing StringBuffer object
        System.out.println(sb);
	}

}
