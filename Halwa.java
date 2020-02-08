package com.epam.New_Year_Gift_Present;

public class Halwa extends Sweet_pack{
	int weight=10;
	int price=15;
	public int display() {
		return total;
	}

	public int calculate_w(int kc) {
		return total=kc*weight;
		
	}
	public int calculate(int n) {
		return total=n*price;
	}


	


}
