package com.dutra.hexagonal.config;

import com.dutra.hexagonal.adapters.out.FindAdressByZipCodeAdapter;
import com.dutra.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.dutra.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.dutra.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAdressByZipCodeAdapter findAdressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAdressByZipCodeAdapter, updateCustomerAdapter);
    }
}
