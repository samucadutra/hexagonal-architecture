package com.dutra.hexagonal.application.ports.out;

import com.dutra.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
