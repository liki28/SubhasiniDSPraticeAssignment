package ccom.gl.service;

public class AdditionalService {
	
	//print the stock price in ascending order
	public void displayPriceAscendingOreder(double[] arr) {
		System.out.println("Stock price in ascending order ");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	//print the stock price in descending order
	public void displayPriceDescendingOreder(double[] arr) {
		System.out.println("Stock price in descending order ");
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
