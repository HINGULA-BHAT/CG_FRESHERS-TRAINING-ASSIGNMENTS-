import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class API {

    static void modifyValue(){ 
    	Consumer<Integer> con = a -> System.out.println("Consumer : "+a*10);
    	con.accept(10);
    }

    static int modifyValue(int a, Function<Integer, Integer> b)
    { 
      return b.apply(a);
    }



    static class Product { 
    	private int a;
    	Product(int b){a=b;}
    	public int getA(){return a;}
    }



    static void display() {
    	Supplier<String> sup = () -> "Assignment4Q3";  
        System.out.println("Supplier : "+sup.get());
    }



    public static void main(String[] args) {

    	Product o= new Product(5);
    	Predicate<Product> pre =i -> (i.getA()<10);
    	System.out.println("Predicate : "+pre.test(o));

    	display();

    	modifyValue();

    	Function<Integer, Double> fun = b -> b+3.0;
		System.out.println("function : "+fun.apply(10));

    }	}


		
		
	