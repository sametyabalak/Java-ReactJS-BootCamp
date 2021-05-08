package dayFourFirstHomework.Adapters;

import dayFourFirstHomework.Abstracts.CheckPersonService;
import dayFourFirstHomework.Entities.Customer;

public class MerniceServiceAdapter implements CheckPersonService {

	@Override
	public boolean ifRealPerson(Customer customer) {

		// mernice service simulation with simple if condition
		if (customer.getNationalId() != 0) {
			return true;
		}
		return false;
	}

}
