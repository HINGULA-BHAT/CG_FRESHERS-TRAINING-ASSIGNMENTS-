import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DOB {

	public static void main(String[] args) {
	
		LocalDate date1 = LocalDate.of(1999, 12, 8);
		LocalDate date2 = LocalDate.of(2000, 12, 23);
		LocalDate date3 = LocalDate.of(1996, 12, 8);
		LocalDate date4 = LocalDate.of(2001, 12, 23);
		
		List<Object> obj=new LinkedList<>();
		obj.add(date1);
		obj.add(date2);
		obj.add(date3);
		obj.add(date4);
		
		for(Object i: obj) {
			
			int a,c;
			int y=((LocalDate) i).getYear();
			if(y!=0)
			{
			a=(y%400==0)?(c=1):(y%100==0)?(c=0):((y%4==0)?(c=1):(c=0));
			if(a==1)
				System.out.println("Your Date of Birth is " +((LocalDate) i)+" and it was a leap year");
			else
				System.out.println("Your Date of Birth is " +((LocalDate) i)+" and it was not a leap year");
		}
	}
	}
}