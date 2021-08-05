public class Append {  
    public static void main(String[] args) {  
          StringBuilder S = new StringBuilder("String builder");  
          
            
          CharSequence cs1 =(" is a peer class of String"); 
          CharSequence cs2 =(" that provides much of");
         CharSequence cs3 =(" the functionality of strings");
       
          S.append(cs1).append(cs2).append(cs3) ;        
          System.out.println("" + S);  
    }  
}  