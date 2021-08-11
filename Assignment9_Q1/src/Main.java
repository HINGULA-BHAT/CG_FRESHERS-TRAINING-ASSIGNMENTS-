import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {
	
    public static void main(String[]args){    
        
        List<Fruit> fru=Arrays.asList(
          new Fruit("Apple",98,45,"Red"),
          new Fruit("Banana",102,30,"Yellow"),
          new Fruit("Strawberry",120,55,"Red"),
          new Fruit("Blackberry",78,34,"Black"));
        
        
        List<News> news1=Arrays.asList(
          new News(22,"Navin","Asha","new budget list is good"),
          new News(23,"Venky","Naga","Finally ipl started"),
          new News(23,"Venky","Naga","I support kkr"),
          new News(24,"Ashish","Narhsa","wbu 12 exam"),
          new News(22,"Navin","Yallesh","without budget list"),
          new News(23,"Venky","Naga","ipl india ka festival"));
        
        // Q1) Displayed the fruit names of low calories fruits i.e. calories < 100 sorted in
        //descending order of calories.
        System.out.println("Acoording to <less calories ");
        fru.stream()
        .filter(t->(t.FruitCalories<100))
        .collect(Collectors.toList())
        .forEach(t->System.out.println(t));

        //Q2) Display color wise list of fruit names
        System.out.println("\nSort according to color");
        fru.stream()
        .sorted((p1,p2)->p1.FruitColor.compareTo(p2.FruitColor))
        .forEach(System.out::println);
        
        //Q3) Display only RED color fruits sorted as per their price in ascending order.
        System.out.println("\nSort Red color fruits sorted withprice in ascending");
        fru.stream()
        .filter(t->t.FruitColor.equals("Red"))
        .forEach(t->System.out.println(t));
        
        //Q4) Find out the newsId which has received maximum comments.
        System.out.println("\nnewsId which has received maximum comments");
        int p=news1.stream()
          .min((p1,p2)-> {
           return (int) p1.getNewsID()+p2.getNewsID();
           }).get().getNewsID();
          System.out.println(p);
      	
        
         //Q5) Find out how many times the word 'budget' arrived in user comments all news.
                System.out.println("\nthe word 'budget' arrived in user comments ");
        
        news1.stream()
        .filter(t->t.NewsComment.contains("budget"))
        .forEach(t->System.out.println(t));
        
        //Q6) Find out which user has posted maximum comments.
         System.out.println("\nwhich user has posted maximum comments");
         String n=news1.stream()
        .max((p1,p2)-> {
         return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
         }).get().getNewsCommentbyUser();
      	
        System.out.println(n);

        //Q7) Display commentByUser wise number of comments
         System.out.println("\ncommentByUser wise number of comments");
        news1.stream()
        .sorted((p1,p2)->p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
        .collect(Collectors.toList())
        .forEach(t->System.out.println(t.NewsCommentbyUser+"="+t.NewsComment));

    }
    

}
