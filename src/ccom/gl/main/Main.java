package ccom.gl.main;

import java.util.Scanner;

import ccom.gl.service.AdditionalService;
import ccom.gl.service.BinarySearchImplementation;
import ccom.gl.service.LinearSearch;
import ccom.gl.service.MergeSearchImplementation;

public class Main {

	public static void main(String[] args) {
		
		//declare all the required variables
		int NoOfCompanies;
		int option;
		
		//find the total number of companies
		System.out.println("Enter the number of companies that are associated with Stocker's");
		Scanner sc=new Scanner(System.in);
		NoOfCompanies=sc.nextInt();
		
		//declare & initialize the required array's
		double priceArray[]=new double[NoOfCompanies];
		boolean profitArray[]=new boolean[NoOfCompanies];
		
		//take today's stock price for all companies from the user and also check if the stock prize rose fallen
		for(int i=0;i<NoOfCompanies;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
			priceArray[i]=sc.nextDouble();
			System.out.println("Whether the company's stock price rose today compare to yesterday ?");
			profitArray[i]=sc.nextBoolean();
		}
		
		//sorting the input array
		MergeSearchImplementation mergeSearchImplementation=new MergeSearchImplementation();
		mergeSearchImplementation.sort(profitArray,priceArray, 0,priceArray.length-1);
		
		AdditionalService additionalService=new AdditionalService();
		
		LinearSearch linearSearch=new LinearSearch();
		
		BinarySearchImplementation binarySearchImplementation=new BinarySearchImplementation();
		
		//take user input
		do {
			System.out.println("Enter the operation you want to execute");
			System.out.println("1.. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6.press 0 to exist");
			System.out.println("------------");
			
			option=sc.nextInt();
			
			switch(option) {
			
			case 0:
				option=0;
				break;
			case 1:
				additionalService.displayPriceAscendingOreder(priceArray);
				break;
			case 2:
				additionalService.displayPriceDescendingOreder(priceArray);
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today : "+linearSearch.countCompaniesInProfit(profitArray));
				break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today "+(NoOfCompanies-linearSearch.countCompaniesInProfit(profitArray)));
				break;
			case 5:
				double key;
				System.out.println("enter the key element ");
				key=sc.nextDouble();
				binarySearchImplementation.searchValue(priceArray, key);
				break;
			default:
				System.out.println("enter a valid option");
				
			}
		}while(option !=0);
		
		System.out.println("Exited successfully.");
		sc.close();
	

	}

}
