package klu.student.epampepassignment1;

public class Chocolate extends Gift implements Comparable<Chocolate> {

 private String flavour;
	
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
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
