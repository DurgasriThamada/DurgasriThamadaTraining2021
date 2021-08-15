package AS5.Generics;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

class Pair<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,String> p=new Pair<>();
		p.setKey("1");
		p.setValue("Aa");
		p.setKey("2");
		p.setValue("Bb");
		p.setKey("3");
		p.setValue("Cc");
		Pair<String,Date> pd=new Pair<>();
		pd.setKey("1");
		pd.setValue(new Date());
		pd.setKey("2");
		pd.setValue(new Date());
	}

}
