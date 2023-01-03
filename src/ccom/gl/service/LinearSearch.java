package ccom.gl.service;

public class LinearSearch {
	
	public  int countCompaniesInProfit(boolean arr[]) {
		int count=0;
		
		//run the for loop till the length of the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true)
				count++;
		}
		return count;
	}

}
