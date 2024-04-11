package com.dutra.hexagonal.application.ports.in;

import com.dutra.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
