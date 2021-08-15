package AS2.Q6.PersistenceEx;

abstract class Persistence {
	public abstract void persist();
}

class DatabasePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("Data is being saved in Database");
	}
	
}

class FilePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("Data is being saved in File");
	}
}

public class DataPersistence {
	public static void client(Persistence p) {
		p.persist();
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Persistence p1=new FilePersistence();
			Persistence p2=new DatabasePersistence();
			client(p1);
			client(p2);
		}
}
