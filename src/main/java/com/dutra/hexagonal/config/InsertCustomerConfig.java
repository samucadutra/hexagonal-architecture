package com.dutra.hexagonal.config;

import com.dutra.hexagonal.adapters.out.FindAdressByZipCodeAdapter;
import com.dutra.hexagonal.adapters.out.InsertCustomerAdapter;
import com.dutra.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.dutra.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAdressByZipCodeAdapter findAdressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAdressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
