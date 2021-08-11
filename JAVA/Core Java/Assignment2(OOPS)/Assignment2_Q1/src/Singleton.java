
class singletone
{
	public void show()
	{
		System.out.println("hello");
	}
}
class childsingleton extends singletone      //subclass cannot inherit the properties of singleton class if we declare main class as final 
{
	public void show()
	{
		System.out.println("Welcome");
	}
}
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childsingleton a =new childsingleton();
		a.show();

	}
	    }       

