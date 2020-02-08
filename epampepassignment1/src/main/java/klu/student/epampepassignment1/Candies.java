package klu.student.epampepassignment1;

public class Candies extends Gift {

	int noofgrams;
	
	public int getNoofgrams() {
		return noofgrams;
	}
	public void setNoofgrams(int noofgrams) {
		this.noofgrams = noofgrams;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public int compareTo(Chocolate coco) {
        return this.price - coco.price;
    }

}
