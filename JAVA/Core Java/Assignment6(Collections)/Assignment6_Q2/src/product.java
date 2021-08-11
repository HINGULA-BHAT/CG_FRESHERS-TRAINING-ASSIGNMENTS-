import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class product {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//adding fruits as products
		list.add("Apple");
		list.add("Grapes");
		list.add("Mango");
		list.add("Orange");
		list.add("kiwi");
		list.add("banana");
		list.add("pinapple");
		list.add("Watermelon");
		list.add("lemon");
		list.add("cocnut");
		
		//trying to add duplicate element
		list.add("Apple");
		
		//converting list to hashset
		Set<String> set=new HashSet(list);
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}