package AS9.Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String color;
	public Fruit(String name, int calories, int price, String color) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}

class News{
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	public boolean contains(String string) {
		// TODO Auto-generated method stub
		if(this.contains(string))
			return true;
		return false;
	}
	
}
class Trader{
	private String name;
	private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
class Transaction{
	private Trader trader;
	private int year;
	private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fruits=new ArrayList<>();
		fruits.add(new Fruit("Apple",200,5,"Red"));
		fruits.add(new Fruit("Mango",99,10,"Yellow"));
		fruits.add(new Fruit("Orange",69,4,"Orange"));
		List<News> news=new ArrayList<>();
		news.add(new News(1,"Mathew","John","Budget is not fair"));
		news.add(new News(1,"Mathew","Tom","What!!"));
		news.add(new News(1,"Mathew","Mary","Oh my god!"));		
		news.add(new News(2,"Eric","Pindo","Year's Budget is high"));
		news.add(new News(2,"Eric","Tom","Whoa!"));
		List<Trader> traders=new ArrayList<>();
		traders.add(new Trader("Tommy","Pune"));
		traders.add(new Trader("Linda","Indore"));
		traders.add(new Trader("Emelia","Pune"));
		traders.add(new Trader("Pindo","Delhi"));
		traders.add(new Trader("Reece","Indore"));
		List<Transaction> transactions=new ArrayList<>();
		transactions.add(new Transaction(traders.get(0),2011,21000));
		transactions.add(new Transaction(traders.get(1),2011,1999));
		transactions.add(new Transaction(traders.get(2),2011,20000));
		transactions.add(new Transaction(traders.get(3),1999,10000));
		transactions.add(new Transaction(traders.get(4),1890,5000));
		transactions.add(new Transaction(traders.get(3),2019,21000));
		System.out.println("Q1:");
		fruits.stream()
		.filter(f->(f.getCalories()<100))
		.forEach(f->System.out.println(f));
		System.out.println("Q2:");
		Map<String, Set<String>> res=fruits.stream().collect(
				Collectors.groupingBy(Fruit::getColor,
						Collectors.mapping(Fruit::toString, Collectors.toSet())
						)
				);
		System.out.println(res);
		System.out.println("Q3:");
		fruits.stream()
		.filter(f->f.getColor().equals("Red"))
		.sorted()
		.forEach(f->System.out.println(f));
		System.out.println("Q4:");
		Map<Integer, Long> counting = news.stream().collect(
                Collectors.groupingBy(News::getNewsId, Collectors.counting()));
		for(Map.Entry m:counting.entrySet()){    
		       System.out.println(m.getKey());    
		       break;
		      } 
		System.out.println("Q5:");
		long resn=news.stream()
				.filter(n->n.getComment().contains("Budget"))
				.count();
		System.out.println(resn);
		System.out.println("Q6:");
		Map<String, Long> count = news.stream().collect(
                Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		for(Map.Entry m:count.entrySet()){    
		       System.out.println(m.getKey());    
		       break;
		      } 
		System.out.println("Q7:");
		for(Map.Entry m:count.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());
		      } 
		System.out.println("Q8:");
		transactions.stream()
		.filter(t->t.getYear()==2011)
		.forEach(System.out::println);
		System.out.println("Q9:");
		Set<String> cities=new HashSet<>();
		for(Trader td:traders) {
			cities.add(td.getCity());
		}
		System.out.println(cities);
		System.out.println("Q10:");
		traders.stream()
		.filter(t->t.getCity().equals("Pune"))
		.forEach(System.out::println);
		System.out.println("Q11:");
		SortedSet<String> ts= new TreeSet<String>();
		for(Trader td:traders) {
			ts.add(td.getName());
		}
		StringBuilder names=new StringBuilder();
		Iterator<String> ist = ts.iterator();
        while (ist.hasNext())
            names.append(ist.next());
        System.out.println(names+" ");
		System.out.println("Q12:");
		traders.stream()
		.filter(t->t.getCity().equals("Indore"))
		.forEach(System.out::println);
	}
}
