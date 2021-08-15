package AS8.Lambda;

import java.util.*;

class Orders{
	private int id;
	private String name;
	private int price;
	private String status;
	public Orders(int id, String name, int price, String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Orders> orders=new ArrayList<Orders>();
		orders.add(new Orders(1,"Aaa",5000,"ACCEPTED"));
		orders.add(new Orders(2,"Bb",20000,"COMPLETED"));
		orders.add(new Orders(3,"Cc",2000,"COMPLETED"));
		orders.add(new Orders(4,"Dd",15000,"COMPLETED"));
		orders.add(new Orders(5,"Ee",50000,"REJECTED"));
		orders.stream()
		.filter(o-> (o.getPrice()>10000 && (o.getStatus().equals("ACCEPTED") || o.getStatus().equals("COMPLETED") ))?true:false)
		.forEach(o->System.out.println(o));
	}

}
