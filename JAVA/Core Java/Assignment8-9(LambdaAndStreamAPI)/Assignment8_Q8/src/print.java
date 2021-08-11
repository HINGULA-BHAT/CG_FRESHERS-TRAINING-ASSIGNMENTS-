import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class print {
	
	public static void main(String[] arg) {
		
		 List<String> list = new ArrayList<String>();
	   	 Scanner ss= new Scanner(System.in);
	   	 
	   	 System.out.print("enter the number of elements you want to enter : ");
	   	 int s= ss.nextInt();
	   	 
	   	 
	   	 for(int i=1;i<=s;i++) {
	   		 
	   		 System.out.print("enter the element "+i+" in the list : ");
	   		 String st= ss.next();
	   		 
	   		 list.add(st);
	   	 }
	   	 
	   	 
		 Thread t = new Thread(new ThreadDemo(list)); 
		 t.start();
	}

}



class ThreadDemo extends Thread{
	
	List<String> list = new ArrayList<String>();
	ThreadDemo(List<String> l){list=l;}
	
	public void run() { list.forEach(System.out::println); } 
	
}