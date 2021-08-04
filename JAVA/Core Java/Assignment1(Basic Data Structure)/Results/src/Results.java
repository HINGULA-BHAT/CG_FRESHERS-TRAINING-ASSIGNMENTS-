import java.util.*;

public class Results {
	public static void main(String[] args) {
		 int count =0;
		 Scanner scanner = new Scanner(System.in);
		 int[]sub =new int[3];
		 System.out.print("Enter three subjects' marks out of 100: ");
		 for (int a=0;a<3;a++)
		 {sub[a]=scanner.nextInt();
		 }
		 for (int x=0;x<sub.length;x++)
		 {
		  if (sub[x]>60)
		  {count=count+1;
		  }
		 }
		 if (count == 3)
		 {
		  System.out.print("You have passed the test");
		 }
		 else if (count ==2)
		 {
		  System.out.print("You are promoted to next class!");
		 }
		 else
		 {
		  System.out.print("Fail! Better Luck next time!");
		 }
		 }
}
