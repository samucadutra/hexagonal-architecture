package com.dutra.hexagonal.adapters.out.client.mapper;

import com.dutra.hexagonal.adapters.out.client.response.AddressResponse;
import com.dutra.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
