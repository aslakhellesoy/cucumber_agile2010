package cucumber.agile2010;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.I18n.EN.Then;

import static org.junit.Assert.assertTrue;

public class CustomerSteps {
    private CustomerList customers;

    @Given("^there are no customers in the system$")
    public void noCustomersInTheSystem() {
        customers = new CustomerList();
    }
}
