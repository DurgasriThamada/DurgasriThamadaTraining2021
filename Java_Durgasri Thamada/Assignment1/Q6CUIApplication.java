import java.util.*;
public class Q6CUIApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String username="Capgemini@2021";
		String Password="12345678";
		System.out.println("Enter the username");
		String user=in.nextLine();
		System.out.println("Enter the password");
		String pass=in.nextLine();
		int i=1;
	    do {
	    	if(username.equals(user) && Password.equals(pass)) {
	    		System.out.println("Welcome");
	    		break;
	    	}
	    	else {
	    		i++;
	    		System.out.println("Enter the username");
	    		user=in.nextLine();
	    		System.out.println("Enter the password");
	    		pass=in.nextLine();
	    	}
		    if(i==3) {
		    	System.out.println("Contact Admin");
		    	break;
		    }
	    }while(true);
	    in.close();
	}

}
