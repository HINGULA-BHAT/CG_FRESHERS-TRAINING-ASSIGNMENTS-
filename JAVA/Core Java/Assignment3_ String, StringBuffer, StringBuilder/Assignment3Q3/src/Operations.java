public class Operations {
    public static void main(String args[]) {
        String S = new String("Java String pool refers to collection of Strings which are stored in heap memory.");
      
        //Changes the string to lower case
        System.out.println(S.toLowerCase());
       
        //Changes the string to upper case
        System.out.println(S.toUpperCase());

        //Replaces 'a' with '$'
        String new_str = S.replace('a', '$');       
        System.out.println("The string now becomes: " + new_str);
       
        //Checks for the word collection
        if (S.contains("collection")){
       	 System.out.println("S contains the word collection"); 
        }
        else {System.out.println("S does not contain the word collection");
       	 
        }
       
        
        String S2 = new String("java String pool refers to collection of Strings which are stored in heap memory.");
       
        //Check whether the two strings are equal
             if (S.equals(S2)) {
            	 System.out.println("S is equal to S2"); 
             }
             else {
            	 System.out.println("S is not equal to S2");
             }
             
         //Check whether the two strings are equal but ignore the case
             if (S.equalsIgnoreCase(S2)) {
            	 System.out.println("S is equal to S2"); 
             }
             else {
            	 System.out.println("S is not equal to S2");
                }
             
          // another method to check whether the strings are equal   
             if (S.compareTo(S2)==0) {
            	 System.out.println("S is equal to S2"); 
             }
             else {
            	 System.out.println("S is not equal to S2");
             
    }
    }
    
}