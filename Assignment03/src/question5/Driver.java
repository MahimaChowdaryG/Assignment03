package question5;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		String result = sb.toString(); // result is "Hello World"
        System.out.println(result);
        
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append(" World");
		String result2 = sb2.toString(); // result is "Hello World"
		System.out.println(result2);

	}

}
