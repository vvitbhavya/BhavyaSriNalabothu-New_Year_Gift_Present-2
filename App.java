package com.epam.New_Year_Gift_Present;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	 @SuppressWarnings("resource")
		public static void main( String[] args )
	    {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter maximum price");
	        int mp=s.nextInt();
	        ArrayList<String> Candies=new ArrayList<String>();
	        ArrayList<String> Chocolates=new ArrayList<String>();
	        Candies.add("Jellies");
	        Candies.add("Gems");
	        Chocolates.add("Dairymilk");
	        Chocolates.add("Perk");
	        
	        System.out.println("SweetPack class is called\n");
	        Sweets_store.main(args);
	        
	       
	        System.out.println("ChoclatesPack class is called\n");
	        Chocolates_store.main(args);
	        System.out.println("CandiesPack class is called\n");
	        Candies_store.main(args);
	        
	        
	        int total_weight=0;
	        total_weight=Sweets_store.Sweets_weight+Candies_store.candies_weight+Chocolates_store.tw_choco;
	        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
	        
	        int total_price=0;
	        total_price=Sweets_store.Sweets_price+Candies_store.candies_price+Chocolates_store.tc_choco;
	        if(mp<total_price) {
	        	System.out.println("Gift price more than expected. Please get within range");
	    }
	        else {
	        	System.out.println("Total price of the gift is"+total_price+"Rs.");
	        }
	        
	        
	        
	        
	        
	        
	    }
}
