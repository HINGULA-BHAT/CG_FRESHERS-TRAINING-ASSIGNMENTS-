  
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String s();
}
class Great{
	@Test(s="Greeting Method")
	public void greeting() {
		System.out.println("Good Morning....!");
	}
}
public class Annot1 {

	public static void main(String[] args) {
		Great obj=new Great();
		obj.greeting();
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(Test.class);
		Test t=(Test)an;
		System.out.println(t.s());
		}

}