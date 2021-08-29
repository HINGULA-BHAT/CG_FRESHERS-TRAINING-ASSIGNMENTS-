package Junit_2;

class Find{
	
	int min;
	int max;
	
	public Find(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Find other = (Find) o;
		return max == other.max && min == other.min;
	}

	
}
public class Junit_Q2 {
	
	Find findMinMax(int[] arr) {
		
		int min=arr[0], max=arr[0];
		for(int a: arr) {
			if(min>a)
				min=a;
		}
		
		for(int a: arr) {
			if(max<a)
				max=a;
		}
		return new Find(min, max);
	}
	

}
