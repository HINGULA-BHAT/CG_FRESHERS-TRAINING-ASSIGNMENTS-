import java.util.*;
import java.util.function.UnaryOperator;

public class replaceUpper {
    public static void main(String[] args) {
    	
    	 List<String> list = new ArrayList<String>();
    	 Scanner ss= new Scanner(System.in);
    	 
    	 System.out.print("enter the number of elements you want to enter : ");
    	 int s= ss.nextInt();
    	 
    	 
    	 for(int i=1;i<=s;i++) {
    		 
    		 System.out.print("enter the element "+i+" in the list : ");
    		 String st= ss.next();
    		 
    		 list.add(st);
    	 }
    	 
    	 
    	 System.out.print(new replaceUpper().convertToUpperCase(list));
    	 
    }
    
    
    public List<String> convertToUpperCase(List<String> list) {
    	
    	UnaryOperator<String> uo = a -> a.toUpperCase();
    	list.forEach(n -> Collections.replaceAll(list,n,uo.apply(n)));
    	
    	return list;
    }  
}