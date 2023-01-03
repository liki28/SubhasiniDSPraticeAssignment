package ccom.gl.service;

public class MergeSearchImplementation {
	
	public void merge(boolean profitArray[],double arr[],int left,int mid,int right) {
		
		//find size of the two sub arrays
		int n1=mid-left+1;
		int n2=right-mid;
		
		//creat temporary arrays
		double leftArray[]=new double[n1];
		double rightArray[]=new double[n2];
		
		//creat temporary arrays
		boolean leftprofitArray[]=new boolean[n1];
		boolean rightprofitArray[]=new boolean[n2];
		
		
		//copy data to temporary array
		for(int i=0;i<n1;i++) {
			leftArray[i]=arr[left+i];
			leftprofitArray[i]=profitArray[left+i];
		}
		
		
		for(int j=0;j<n2;j++) {
			rightArray[j]=arr[mid+1+j];
			 rightprofitArray[j]=profitArray[mid+1+j];
		}
		
		//merge the temporary array
		int i=0;
		int j=0;
		int k=left;
		
		while(i<n1&&j<n2) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				profitArray[k]=leftprofitArray[i];
				i++;
			}else {
				arr[k]=rightArray[j];
				profitArray[k]=rightprofitArray[j];
				j++;
			}
			k++;
		}
		
		//copy remaining element
		while(i<n1) {
			arr[k]=leftArray[i];
			profitArray[k]=leftprofitArray[i];
			i++;
			j++;
		}
		while(j<n2) {
			arr[k]=rightArray[j];
			profitArray[k]=rightprofitArray[j];
			j++;
			k++;
		}
		
	}
	
	//method for sorting array using mergeSort
	public void sort(boolean profitArray[],double arr[],int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			
			sort(profitArray,arr,left,mid);
			sort(profitArray,arr,mid+1,right);
			
			merge(profitArray,arr,left,mid,right);
		}
	}

}
