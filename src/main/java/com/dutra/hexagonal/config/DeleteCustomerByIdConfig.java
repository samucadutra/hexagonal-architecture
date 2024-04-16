package com.dutra.hexagonal.config;

import com.dutra.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.dutra.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.dutra.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
