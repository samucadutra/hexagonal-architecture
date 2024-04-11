package com.dutra.hexagonal.application.ports.out;

import com.dutra.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
