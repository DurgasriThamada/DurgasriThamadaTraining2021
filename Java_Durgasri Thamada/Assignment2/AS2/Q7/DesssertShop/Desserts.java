package AS2.Q7.DesssertShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DessertItem {
	public abstract int getCost();
}

class Candy extends DessertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 2;
	}


}

class Cookie extends DessertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 1;
	}

}

class Icecream extends DessertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 25;
	}

}

public class Desserts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		DessertItem candy=new Candy();
		DessertItem cookie=new Cookie();
		DessertItem icecream=new Icecream();
		List<Integer> candies=new ArrayList<Integer>();
		List<Integer> cookies=new ArrayList<Integer>();
		List<Integer> icecreams=new ArrayList<Integer>();
		int n,i,size;
		while(true) {
			System.out.println("Type o for Owner, c for customer and e for exit");
			String type=in.next();
		if(type.equals("o")) {
			System.out.println("Enter the no.of candies to add into storage");
			n=in.nextInt();
			for(i=0;i<n;i++) {
				candies.add(1);
			}
			System.out.println("Enter the no.of cookies to add into storage");
			n=in.nextInt();
			for(i=0;i<n;i++) {
				cookies.add(1);
			}
			System.out.println("Enter the no.of icecreams to add into storage");
			n=in.nextInt();
			for(i=0;i<n;i++) {
				icecreams.add(1);
			}
		}
		else if(type.equals("c")) {
			System.out.println("Place the order:");
			System.out.println("Enter the no.of candies");
			n=in.nextInt();
			size=candies.size()-1;
			System.out.println(n+" "+size);
			for(i=0;i<n;i++) {
				candies.remove(size-i);
			}
			if(n>0)
			System.out.println("Cost for candies is "+(n*candy.getCost())+" dollars");
			System.out.println("Enter the no.of cookies");
			n=in.nextInt();
			size=cookies.size()-1;
			for(i=0;i<n;i++) {
				cookies.remove(size-i);
			}
			if(n>0)
			System.out.println("Cost for cookies is "+(n*cookie.getCost())+" euros");
			System.out.println("Enter the no.of icecreams");
			n=in.nextInt();
			size=icecreams.size()-1;
			for(i=0;i<n;i++) {
				icecreams.remove(size-i);
			}
			if(n>0)
			System.out.println("Cost for icecreams is "+(n*icecream.getCost())+" rupees");
			
		}
		else {
			System.out.println("Exited");
			break;
		}
		}
		in.close();
	}
}
