package question5;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Patterns");
		sb.append("Frameworks");
		String result = sb.toString(); // "Patterns Frameworks"
        System.out.println(result);
        
		StringBuilder sb2 = new StringBuilder("Patterns");
		sb2.append("Frameworks");
		String result2 = sb2.toString(); // "Patterns Frameworks"
		System.out.println(result2);
		//They give the same output but difference is only in thread safety

	}

}
