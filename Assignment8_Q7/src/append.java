import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class append {
	
	public static void main(String[] args) {
		
    	HashMap<String,String> m = new LinkedHashMap<String,String>();   	
    	Scanner ss= new Scanner(System.in);
   	 
	   	 System.out.print("enter the number of elements you want to enter : ");
	   	 int s= ss.nextInt();
	   	 
	   	 
	   	 for(int i=1;i<=s;i++) {
	   		 
	   		 System.out.print("enter the key "+i+" in the map   : ");
	   		 String st= ss.next();
	   		 
	   		 System.out.print("enter the value "+i+" in the map : ");
	   		 String stt= ss.next();
	   		 
	   		 m.put(st,stt);
	   	 }
	   	 
	   	System.out.print(new append().convertKeyValueToString(m));
    }
	
	
	
    public String convertKeyValueToString(HashMap<String, String> m) {
    	
    	StringBuilder sb=new StringBuilder("");

    	m.entrySet().stream().forEach(e -> {sb.append(e.getKey()); sb.append(e.getValue());});
    	
    	return sb.toString();
    	
    }

}