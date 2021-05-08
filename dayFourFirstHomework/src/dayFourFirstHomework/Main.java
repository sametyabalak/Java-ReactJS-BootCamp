package dayFourFirstHomework;

import dayFourFirstHomework.Abstracts.CustomerManager;
import dayFourFirstHomework.Adapters.MerniceServiceAdapter;
import dayFourFirstHomework.Concreates.StarbuckCustomerManager;
import dayFourFirstHomework.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new StarbuckCustomerManager(new MerniceServiceAdapter());

		customerManager.save(new Customer(1, "Samet", "Yabalak", 25555));
		
	}

}
