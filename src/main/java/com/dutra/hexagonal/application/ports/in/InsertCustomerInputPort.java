package com.dutra.hexagonal.application.ports.in;

import com.dutra.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
