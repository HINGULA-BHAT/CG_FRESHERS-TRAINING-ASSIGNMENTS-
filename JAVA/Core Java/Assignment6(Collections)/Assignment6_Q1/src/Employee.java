import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Contact{
	
	String Name;
	Enum gender;
	Long PhoneNumber;
	String Email;
	public Contact(String name, Enum gender, long i, String email) {
		super();
		Name = name;
		this.gender = gender;
		PhoneNumber = i;
		Email = email;
	}
	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", gender=" + gender + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email
				+ "]";
	}
	
	
	
}
public class Employee {
	enum gender{
		MALE,FEMALE;
	}
	public static void main(String args[]) {
		
		
		gender male=gender.MALE;
		gender female=gender.FEMALE;
		
		Map<Long,Contact> map=new TreeMap<>(Collections.reverseOrder());
		
		Contact c1=new Contact("Hingula",female,1000000000,"Hingula@gmail.com");
		Contact c2=new Contact("Bhargavi",female,1000000001,"bhargavi@gmail.com");
		Contact c3=new Contact("gohit",male,1000000002,"gohit@gmail.com");
		Contact c4=new Contact("Lokesh",male,1000000003,"lokesh@gmail.com");
		Contact c5=new Contact("manm",male,1000000004,"man@gmail.com");
		
		map.put((long) 1000000000, c1);
		map.put((long) 1000000001, c2);
		map.put((long) 1000000003, c4);
		map.put((long) 1000000004, c5);
		map.put((long) 1000000002, c3);
		
		Set set=map.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey() +": ");
			System.out.println(m.getValue());
			}
		
	}
}
