package question18;

public class Threads {
	 public static void main(String args[]){  
		  TestThreadTwice1 t1=new TestThreadTwice1();  
		  t1.start();  
		  t1.start();  
		 }  
	
		// TODO Auto-generated method stub
		
			
			 
	

}

 class TestThreadTwice1 extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
}
