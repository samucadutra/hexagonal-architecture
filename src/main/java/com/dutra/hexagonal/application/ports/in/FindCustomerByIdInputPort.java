package com.dutra.hexagonal.application.ports.in;

import com.dutra.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
