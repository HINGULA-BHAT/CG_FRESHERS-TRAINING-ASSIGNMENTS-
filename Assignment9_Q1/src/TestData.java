import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Hingula", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bhuvi", "Good budget description"));
		newsList.add(new News(1, "Tom", "Naman", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitali", "I agree with you!!"));
		newsList.add(new News(2, "James", "Lokesh", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Gohit", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Hingula", "Delhi"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Samruddhi", "Mumbai"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Gohit", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishan", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);
	}
	
	

	
	
	
	
	
}