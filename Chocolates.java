package com.epam.New_Year_Gift_Present;

public class Chocolates {
	int size;
	int price;

}
class Dairymilk extends Chocolates{
	int dweight = 40;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return dweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}

class Perk extends Chocolates{
	int sweight = 20;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return sweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}
