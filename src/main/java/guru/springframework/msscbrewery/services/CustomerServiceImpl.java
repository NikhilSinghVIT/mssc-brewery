package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j //logger
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID customerID) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Nikhil Singh")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerID, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating customer...");

    }

    @Override
    public void deleteById(UUID customerID) {
        log.debug("Deleting customer...");
    }
}
