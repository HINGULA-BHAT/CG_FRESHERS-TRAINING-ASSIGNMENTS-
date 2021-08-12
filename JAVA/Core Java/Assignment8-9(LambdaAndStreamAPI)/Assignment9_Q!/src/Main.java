
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main{
    public static void main(String[]args){    
    	
    	List<Fruits> fru=Arrays.asList(
    			new Fruits("Apple",98,45,"Gray"),
    			new Fruits("Watermelon",102,30,"Green"),
    			new Fruits("Pineapple",120,55,"Gray"),
    			new Fruits("Orange",78,34,"Yellow"));
    	
    	
    	List<News> news1=Arrays.asList(
    			new News(15,"Hingula","Bhat","life cycle"),
    			new News(16,"Sanchit","P","ipl"),
    			new News(16,"Sanchit","P","Bang Bang"),
    			new News(17,"Hitika","G","Hi"),
    			new News(15,"Hingula","S","Hello"),
    			new News(16,"Sanchit","P","India Won The Game"));
    	
        Trader soomesh = new Trader("Dine", "HYD");
        Trader suresh = new Trader("Sweety","Bangalore");
        Trader abhi = new Trader("Venky","HYD");
        Trader sai = new Trader("Bhuvnesh","HYD");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(sai, 2019, 150), 
            new Transaction(soomesh, 2018, 1500),
            new Transaction(soomesh, 2019, 400),
            new Transaction(suresh, 2018, 710),	
            new Transaction(suresh, 2018, 700),
            new Transaction(abhi, 2018, 950)
        );	
        

		//Displayed the fruit names of low calories fruits i.e. calories < 100 sorted in
		//descending order of calories.
		System.out.println("Acoording to <less calories ");
		fru.stream()
		.filter(t->(t.FruitCalories<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));

		//Display color wise list of fruit names
		System.out.println("\nSort according to color");
		fru.stream()
		.sorted((p1,p2)->p1.FruitColor.compareTo(p2.FruitColor))
		.forEach(System.out::println);
		
		//Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\nSort Gray color fruits sorted withprice in ascending");
		fru.stream()
		.filter(t->t.FruitColor.equals("Gray"))
		.forEach(t->System.out.println(t));
		
		//Find out the newsId which has received maximum comments.
		System.out.println("\nnewsId which has received maximum comments");
		int  p=news1.stream()
				.min((p1,p2)-> {
					return (int) p1.getNewsID()+p2.getNewsID();
					}).get().getNewsID();
			 System.out.println(p);
	
		
		 //Find out how many times the word 'budget' arrived in user comments all news.
		        System.out.println("\nthe word 'budget' arrived in user comments ");
		
		news1.stream()
		.filter(t->t.NewsComment.contains("budget"))
		.forEach(t->System.out.println(t));
		
		//Find out which user has posted maximum comments.
		 System.out.println("\nwhich user has posted maximum comments");
	 	String  n=news1.stream()
		.max((p1,p2)-> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
			}).get().getNewsCommentbyUser();
	
		System.out.println(n);

		//Display commentByUser wise number of comments
		 System.out.println("\ncommentByUser wise number of comments");
		news1.stream()
		.sorted((p1,p2)->p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t.NewsCommentbyUser+"="+t.NewsComment));
		
		
		
		
		
        //Find all transactions from year 2019 and sort them by value (small to high).
        List<Transaction> tr2019 = transactions.stream()
                                               .filter(transaction -> transaction.getYear() == 2019)
                                               .sorted(comparing(Transaction::getValue))
                                               .collect(toList());
        System.out.println(tr2019);
        
        //What are all the unique cities where the traders work?
        List<String> cities = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        //Find all traders from HYD and sort them by name.
        
        List<Trader> traders = 
            transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("HYD"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);
        
        
        //Return a string of all traders’ names sorted alphabetically.
        
        String traderStr = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        
        //Are there any trader based in HYD?
        
        boolean HYDBased =
            transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                                            .getCity()
                                                            .equals("HYD")
                                 );
        System.out.println(HYDBased);
        
        //Are there any trader in indore?
        
        boolean indoreBased =
                transactions.stream()
                            .anyMatch(transaction -> transaction.getTrader()
                                                                .getCity()
                                                                .equals("indore")
                                     );
            System.out.println(indoreBased);
        
        //Update all transactions so that the traders from HYD are set to Bangalore.
        transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(trader -> trader.getCity().equals("HYD"))
                    .forEach(trader -> trader.setCity("Bangalore"));
        System.out.println(transactions);
        
        
        //What's the highest value in all the transactions?
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);   
        
        //What's the lowest value in all the transactions?
        int lowestValue = 
                transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(1500, Integer::min);
            System.out.println(lowestValue);      
    }
}