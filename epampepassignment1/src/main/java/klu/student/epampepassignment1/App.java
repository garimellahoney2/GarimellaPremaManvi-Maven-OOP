package klu.student.epampepassignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*List<Book> books = new ArrayList<Book>();

    	Collections.sort(books, new Comparator<Book>(){

    	  public int compare(Book o1, Book o2)
    	  {
    	     return o1.name.compareTo(o2.name);
    	  }
    	});*/
    	Sweet[] sweetarray = new Sweet[3];
    	sweetarray[0] = new Sweet();
        sweetarray[0].setName("palakova");
    	sweetarray[0].setCompany("sweetmagic");
    	sweetarray[0].setNoofgrams(250);
    	sweetarray[0].setPrice(50);
      
    	sweetarray[1] = new Sweet();
        sweetarray[1].setName("putharekulu");
    	sweetarray[1].setCompany("sweetmagic");
    	sweetarray[1].setNoofgrams(430);
    	sweetarray[1].setPrice(50);
    	
    	sweetarray[2] = new Sweet();
        sweetarray[2].setName("coconut laddu");
    	sweetarray[2].setCompany("sweetmagic");
    	sweetarray[2].setNoofgrams(253);
    	sweetarray[2].setPrice(50);
    	
    	System.out.println("------sweets---------------");
    	int i = 1;
    	for(Sweet coco : sweetarray)
    	{
    		System.out.println(i+") Name :"+coco.getName()+" | company is :"+coco.getCompany()+" | price is:"+coco.getPrice()+" | noofgrams : "+coco.getNoofgrams());
    		System.out.println();
    		i +=1;
    	}
    	
    	Chocolate[] chocolatearray = new Chocolate[4];
    	chocolatearray[0] = new Chocolate();
    	chocolatearray[0].setFlavour("cocoa butter");
    	chocolatearray[0].setCompany("dairy milk");
    	chocolatearray[0].setPrice(50);
    	
    	chocolatearray[1] = new Chocolate();
    	chocolatearray[1].setFlavour("vanilla");
    	chocolatearray[1].setCompany("dairy milk");
    	chocolatearray[1].setPrice(3000);
    	
    	chocolatearray[2] = new Chocolate();
    	chocolatearray[2].setFlavour("dark chocolate");
    	chocolatearray[2].setCompany("dairy milk");
    	chocolatearray[2].setPrice(250);
    	
    	chocolatearray[3] = new Chocolate();
    	chocolatearray[3].setFlavour("white chocolate");
    	chocolatearray[3].setCompany("dairy milk");
    	chocolatearray[3].setPrice(1500);
    	
    	Arrays.sort(chocolatearray);
    	i =1;
    	System.out.println("\n---------chocolates---------------");
    	for(Chocolate coco : chocolatearray)
    	{
    		System.out.println(i+") Flavour:"+coco.getFlavour()+" | company is:"+coco.getCompany()+" | price is:"+coco.getPrice());
    		System.out.println();
    		i += 1;
    	}
    	
    	Candies[] candiesarray = new Candies[4];
    	candiesarray[0] = new Candies();
    	candiesarray[0].setCompany("J V Candy");
    	candiesarray[0].setNoofgrams(200);
    	candiesarray[0].setPrice(200);
    	
    	candiesarray[1] = new Candies();
    	candiesarray[1].setCompany("K L Candy");
    	candiesarray[1].setNoofgrams(300);
    	candiesarray[1].setPrice(300);
    	
    	candiesarray[2] = new Candies();
    	candiesarray[2].setCompany("U K Candy");
    	candiesarray[2].setNoofgrams(1000);
    	candiesarray[2].setPrice(1200);
    	
    	candiesarray[3] = new Candies();
    	candiesarray[3].setCompany("K S Candy");
    	candiesarray[3].setNoofgrams(1200);
    	candiesarray[3].setPrice(1500);
    	
    	System.out.println("\nSet maximum price limit for candies");
    	System.out.println("\n---------Candies--------------");
    	Scanner sc = new Scanner(System.in);
    	int maxprice = sc.nextInt();
    	
    	i = 1;
    	for(Candies coco : candiesarray)
    	{
    		if(coco.getPrice()<=maxprice)
    		{
    		System.out.println(i+") company:"+coco.getCompany()+" | noofgrams is:"+coco.getNoofgrams()+" | price is:"+coco.getPrice());
    		System.out.println();
    		i += 1;
    		}
    	}
    	
    System.out.println("\nselect options int each variety to get total");
    System.out.println("\nenter option for sweets");
    int sweetoption = sc.nextInt();
    System.out.println("\nenter option for chocolates"); 
    int chocolateoption = sc.nextInt();
    System.out.println("\nenter option for candies");
    int candiesoption = sc.nextInt();
    
    Sweet sweetselected = sweetarray[sweetoption];
    Chocolate chocolateselected = chocolatearray[chocolateoption];
    Candies candiesselected = candiesarray[candiesoption];
    System.out.println("\n--------your bill is--------");
	System.out.println(" Name :"+sweetselected.getName()+" | company is :"+sweetselected.getCompany()+" | price is:"+sweetselected.getPrice()+" | noofgrams : "+sweetselected.getNoofgrams());
	System.out.println(" Flavour:"+chocolateselected.getFlavour()+" | company is:"+chocolateselected.getCompany()+" | price is:"+chocolateselected.getPrice());
	System.out.println(" company:"+candiesselected.getCompany()+" | noofgrams is:"+candiesselected.getNoofgrams()+" | price is:"+candiesselected.getPrice());
    int total = sweetselected.getPrice()+chocolateselected.getPrice()+candiesselected.getPrice();
    System.out.println("\nyour total is:"+total);
    }
}
