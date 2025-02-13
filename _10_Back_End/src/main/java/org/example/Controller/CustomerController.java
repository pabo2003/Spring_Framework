package org.example.Controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    List<CustomerDTO> customers = new ArrayList<>();
    @GetMapping(path = "getAll")
    public List<CustomerDTO> getAll(){
        return customers;
    }
    @PostMapping(path = "save" )
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }
    @GetMapping(path = "getCustomer/{id}")
    public CustomerDTO getCustomer(@PathVariable("id") int id){
        for (CustomerDTO customerDTO : customers){
            if (customerDTO.getId()==id){
                return customerDTO;
            }
        }
        return null;
    }
    @PutMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for(CustomerDTO customer : customers){
            if (customer.getId() == customerDTO.getId()){
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                return customer;
            }
        }
        return null;
    }
    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable("id") int id){
        for (CustomerDTO customerDTO : customers) {
            if (customerDTO.getId() == id){
                customers.remove(customerDTO);
                return true;
            }
        }
        return false;
    }
}
