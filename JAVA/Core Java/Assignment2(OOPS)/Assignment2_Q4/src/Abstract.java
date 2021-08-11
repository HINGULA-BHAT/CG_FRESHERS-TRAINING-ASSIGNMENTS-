abstract class Abs{
	public abstract void cartyres();
	public abstract void biketyres();
}
class vehicle{
	public void cartyres() {
		System.out.println("A Car has four tyres");
	}
}
abstract class automobiles extends Abs{
	public abstract void biketyres();
}
class Bikes extends Abs{
	public void biketyres() {
		System.out.println("A Bike has two tyres");
	}

	public void cartyres() {
		// TODO Auto-generated method stub
		
	}

	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v=new vehicle();
		v.cartyres();
		Bikes b=new Bikes();
		b.biketyres();
	}

}

    
