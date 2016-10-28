package age;

import com.mongodb.client.MongoDatabase;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("totu");
		MongoClient cl = new MongoClient("localhost",27017);
		MongoDatabase mongoDatabase = cl.getDatabase("Test");
		int nb = 9;
	}

}
