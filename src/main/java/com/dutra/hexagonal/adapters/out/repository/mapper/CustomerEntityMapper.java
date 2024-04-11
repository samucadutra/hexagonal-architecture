package com.dutra.hexagonal.adapters.out.repository.mapper;

import com.dutra.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.dutra.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
