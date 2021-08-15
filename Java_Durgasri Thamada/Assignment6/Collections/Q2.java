package AS8.Collections;
import java.util.*;
class Product{
	private int id;
	private String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Product> hs=new TreeSet<>();
		Product p1=new Product(1,"Aa");
		Product p2=new Product(2,"Bb");
		Product p3=new Product(3,"Cc");
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p3);//gives an error as TreeSet doen't allow duplicates;
		Product p4=new Product(2,"Bb");
		hs.add(p4);
		Iterator<Product> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
