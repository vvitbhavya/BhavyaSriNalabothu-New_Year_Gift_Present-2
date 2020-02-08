package com.epam.New_Year_Gift_Present;

public class Ravva_laddu extends Sweet_pack {
	int weight=5;
	int price=10;
        int total;
	public int display() {
		return total;
	}

	public int calculate(int lc) {
		return total=lc*weight;
		
	}
	public int calculate_c(int n) {
		return total=n*price;
	}


}
