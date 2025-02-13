package org.example._13_spring_boot.Service;

import org.example._13_spring_boot.DTO.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public boolean addCustomer(CustomerDTO customerDTO){
        System.out.println("Service addCustomer: " + customerDTO.getName());
        return true;
    }
}
