package Junit_1;


public class Junit_Q1 {

	public int[] findMinMax(int[] arr) {
		
		//Q1-  findMinMax()
		int min=arr[0], max=arr[0];
		
		for(int a: arr) {
			if(min>a)
				min=a;
		}
		
		for(int a: arr) {
			if(max<a)
				max=a;
		}
		
		int[] r= {min,max};
		return r;
}
}