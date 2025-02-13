package org.example._13_spring_boot.Controller;

import org.example._13_spring_boot.DTO.CustomerDTO;
import org.example._13_spring_boot.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/getAll")
    public String getAllCustomers(){
        return "All Customers";
    }

    @PostMapping("/save"  )
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
//        return "Customer saved";
        System.out.println(customerDTO.getName());
        return customerDTO.toString();
    }
}


//http://localhost:8080/api/v1/customer/getAll