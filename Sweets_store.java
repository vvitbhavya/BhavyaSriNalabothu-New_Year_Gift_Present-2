package com.epam.New_Year_Gift_Present;
import java.util.ArrayList;
import java.util.Scanner;


public class Sweets_store {
	static public int Sweets_weight;
	static public int Sweets_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("Halwa");
		Sweets.add("Ravva_laddu");
		
		
		int price[]=new int[Sweets.size()];
		Halwa h=new Halwa();
		Ravva_laddu r=new Ravva_laddu();
		
		System.out.println("Enter number of sweets\n");
		System.out.println("Enter number of Halwa Sweets");
		int kc=s.nextInt();
		System.out.println("Enter number of Ravvaladdu");
		int lc=s.nextInt();
		
		r.calculate(kc);
		r.calculate(lc);
		price[0]=h.display();
		price[1]=h.display();
		System.out.print("Total weight of sweets is: ");
		Sweets_weight=r.calculate(r.weight)+h.calculate_w(h.weight);
		System.out.println(Sweets_weight+" grams\n");
		
		System.out.print("Total price of sweets is: ");
		Sweets_price=price[0]+price[1];
		System.out.println(Sweets_price+" Rs\n");
		
		
		
	}

}
