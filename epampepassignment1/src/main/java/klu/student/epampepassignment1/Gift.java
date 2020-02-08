package klu.student.epampepassignment1;

public abstract class Gift {
	//this will definitely makes child class to have these properties
		
		 int price;
		String company = "";
		
		abstract int getPrice();
		abstract void setPrice(int price);
		abstract String getCompany();
		abstract void setCompany(String company); 
		}

	



