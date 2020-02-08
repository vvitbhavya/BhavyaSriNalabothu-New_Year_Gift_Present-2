package com.epam.New_Year_Gift_Present;
import java.util.Scanner;
public class Candies_store {

	public static int candies_weight=1;
	public static int candies_price=1;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of candies: " + Candies.range);
    	Jellies jaya = new Jellies();
    	Gems gem = new Gems();
    	System.out.println("Enter Quantities of Jellies and Gems:");
    	System.out.println("Enter Quantities of Jellies:");
    	jaya.quantity(scan.nextInt());
    	System.out.println("Enter Quantities of Gems");
    	gem.quantity(scan.nextInt());
    	if(jaya.quantity+gem.quantity<=Candies.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candies");
    	int op = scan.nextInt();
    	if(op==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(jaya.display()<=qun) {
    			System.out.println("Jellies are in range of "+qun);
    			System.out.println("No of Jelliess are : "+jaya.display());
    		}
    		else {
    			System.out.println("Gems are in range of "+qun);
    			System.out.println("No of Gems are : "+gem.display());
    		}
    	}
    	else if(op==2) {
        	int total_range = jaya.display()+gem.display();
        	if(total_range<Candies.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of candies in the Gift present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	candies_weight = gem.cal_w(gem.quantity)+jaya.cal_w(jaya.quantity);
    	System.out.println("Total weight of candies: "+candies_weight+" grms\n");
    	
    	candies_price = gem.cal_p(gem.quantity) + jaya.cal_p(jaya.quantity);
    	System.out.println("Total price of candies: "+candies_price+" Rc.\n");
    	}
    	else {
    		System.out.println("Candies out of range");
    		return;
    	}
	}

}
