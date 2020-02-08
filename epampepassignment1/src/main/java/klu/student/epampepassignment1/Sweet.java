package klu.student.epampepassignment1;

class Sweet extends Gift
{
	private int noofgrams;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
}