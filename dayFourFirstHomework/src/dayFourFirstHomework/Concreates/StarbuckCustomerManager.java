package dayFourFirstHomework.Concreates;

import dayFourFirstHomework.Abstracts.CheckPersonService;
import dayFourFirstHomework.Abstracts.CustomerManager;
import dayFourFirstHomework.Entities.Customer;

public class StarbuckCustomerManager extends CustomerManager {

	CheckPersonService checkPersonService;

	public StarbuckCustomerManager(CheckPersonService checkPersonService) {
		this.checkPersonService = checkPersonService;
	}

	@Override
	public void save(Customer customer) {

		if (checkPersonService.ifRealPerson(customer)) {
			System.out.println("User valid");
			super.save(customer);
		} else {
			System.out.println("User invalid");
		}

	}

}
