package dayFourFirstHomework.Concreates;

import dayFourFirstHomework.Abstracts.CustomerManager;
import dayFourFirstHomework.Entities.Customer;

public class NeroCustomerManager extends CustomerManager {

	@Override
	public void save(Customer customer) {
		super.save(customer);
		System.out.println("Nero");
	}

	
}
