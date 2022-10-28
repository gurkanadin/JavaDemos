package abstractDemo;

public class CustomerManager {
	
	BaseDataBaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
		
	}

}
