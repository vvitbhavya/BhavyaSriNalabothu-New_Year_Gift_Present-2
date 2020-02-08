package com.epam.New_Year_Gift_Present;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chocolates_store {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

    	Dairymilk b = new Dairymilk();
    	Perk sn = new Perk();
    	System.out.println("Enter quantity of Dairymilk: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Perk: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter size of Dairymilk(1 to 10): ");
    	b.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Perk (1 to 10): ");
    	sn.getsize(scan.nextInt());
    	
    	
    	System.out.println("Enter price of Dairymilk: ");
    	b.price = scan.nextInt();
    	
    	System.out.println("Enter price of Perk: ");
    	sn.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = b.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("Dairymilk");
        		ch.add("Perk");
        	}
        	else{
        		ch.add("Perk");
        		ch.add("Dairymilk");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Perk");
    		ch.add("Dairymilk");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	tw_choco = b.total_w(dq) + sn.total_w(sq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = b.total_p(dq) + sn.total_p(sq);
    	System.out.println(tc_choco +" Rs.");
	}
}
