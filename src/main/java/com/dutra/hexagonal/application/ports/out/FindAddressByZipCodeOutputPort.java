package com.dutra.hexagonal.application.ports.out;

import com.dutra.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
