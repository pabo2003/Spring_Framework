package org.example._13_spring_boot.Controller;

import org.example._13_spring_boot.DTO.CustomerDTO;
import org.example._13_spring_boot.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    public List<CustomerDTO> getAllCustomers(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }


    @PostMapping("/save"  )
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
//        return "Customer saved";
        /*System.out.println(customerDTO.getName());
        return customerDTO.toString();*/
        boolean res = customerService.addCustomer(customerDTO);
        return res;
    }


    @PutMapping("/update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        CustomerDTO updatedCustomer = customerService.updateCustomer(customerDTO);
        return updatedCustomer;
    }

    @DeleteMapping("/delete/{id}  ")
    public boolean deleteCustomer(@PathVariable("id") int id){
        boolean res = customerService.deleteCustomer(id);
        return res;
    }
}


//http://localhost:8080/api/v1/customer/getAll