package youtubeEgitim;

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		set_customer(customer);
		_creditManager = creditManager;
		
		
	}
	
	
	public void Save() {
		System.out.println("Saved "  );
	}
	public void Delete() {
		System.out.println("Deleted " );
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Credit Gived");
	}


	public Customer get_customer() {
		return _customer;
	}


	public void set_customer(Customer _customer) {
		this._customer = _customer;
	}


}
