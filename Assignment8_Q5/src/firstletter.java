import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class firstletter {

    private static StringBuilder result = new StringBuilder();

    private static void getLetter(List<String> list,
            Consumer<String> letterConsumer) {
        for (String s : list) {
            letterConsumer.accept(s);
        }
    }
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

 

        Consumer<String> firstLetter = (String st) -> result
                .append(st.charAt(0));

        getLetter(list, firstLetter);

        System.out.println(result);

    }
}