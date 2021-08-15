package AS8.Collections;
import java.util.*;
class Contact{
	private long phoneNumber;
	private String Name;
	private String email;
	private String gender;
	public Contact(long phoneNumber, String name, String email,String gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.Name = name;
		this.email = email;
		this.gender=gender;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", Name=" + Name + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,Contact> tm=new TreeMap<>();
		Contact c1=new Contact(1234567890,"Aa","aa@gmail.com","M");
		Contact c2=new Contact(1345716890,"Bb","bb@gmail.com","F");
		Contact c3=new Contact(1123389739,"Cc","cc@gmail.com","F");
		tm.put(c1.getPhoneNumber(),c1);
		tm.put(c2.getPhoneNumber(), c2);
		tm.put(c3.getPhoneNumber(),c3); 
		System.out.println("All keys");
		for(Map.Entry m:tm.entrySet()){    
		       System.out.println(m.getKey());    
		      }
		System.out.println("All values");
		for(Map.Entry m:tm.entrySet()){    
		       System.out.println(m.getValue());    
		      }
		System.out.println("All key-value pairs");
		for(Map.Entry m:tm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      } 
	}

}
