using System;
using System.Collections.Generic;
using Cuke4Nuke.Framework;

namespace Agile2010
{
    public class CustomerSteps
    {
        private CustomerList customers;

        [Given(@"^there are no customers in the system$")]
        public void ThereAreNoCustomersInTheSystem()
        {
            customers = new CustomerList();
        }
    }
}
