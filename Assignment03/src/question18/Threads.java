package question18;

public class Threads {
	 public static void main(String args[]){  
		 newthread t1=new newthread();  
		  t1.start();  
		  t1.start();  
		 }  
	
		// TODO Auto-generated method stub
		
			
			 
	

}

 class newthread extends Thread{  
	 public void run(){  
	   System.out.println("started");  
	 }  
}
