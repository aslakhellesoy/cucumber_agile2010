require 'customer_list'

Given /^there are no customers in the system$/ do
  @customer_list = CustomerList.new
end
