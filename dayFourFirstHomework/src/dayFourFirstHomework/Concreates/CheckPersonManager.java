package dayFourFirstHomework.Concreates;

import dayFourFirstHomework.Abstracts.CheckPersonService;
import dayFourFirstHomework.Entities.Customer;

public class CheckPersonManager implements CheckPersonService {

	@Override
	public boolean ifRealPerson(Customer customer) {
		return true;
	}

}
