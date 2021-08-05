  
public class Reverse {
  
    public static void main(String args[])
    {
        StringBuffer S = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("Original String = " + S);    
        S.reverse();
        System.out.println("Reversed String = " + S);
    }
}