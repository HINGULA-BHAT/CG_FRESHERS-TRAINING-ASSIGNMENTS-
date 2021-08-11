
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  

@interface Execute
{
	int Sequence();
}

class Annotation
{
	@Execute(Sequence=2)
	public void method1()
	{
		System.out.println("Method : 1");
	}
	
	@Execute(Sequence=1)
	public void method2()
	{
		System.out.println("Method : 2");
	}
	
	@Execute(Sequence=3)
	public void method3()
	{
		System.out.println("Method : 3");
	}
}

public class Annot3 {
	
	public static void main(String[] args)
	{
		Annotation a= new Annotation();
		Method[] m= a.getClass().getMethods();
		
		for (Method method: m)
		{
			Execute e= method.getAnnotation(Execute.class);
			
			if (e!=null)
			{
				try
				{
					method.invoke(a);
					System.out.println(e);
				}
				
				catch(Exception x)
				{
					x.printStackTrace();
				}
			}
		}
	}
}