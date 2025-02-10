package org.example.Controller;

import org.example.DTO.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("json")
public class JsonController {
    ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String jsonTest(@RequestBody CustomerDTO customerDTO){
        customerDTOS.add(customerDTO);
        return customerDTO.toString();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getCustomer(@RequestBody CustomerDTO customer){
        return customerDTOS;

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customer){
        for (CustomerDTO c : customerDTOS) {
            if (c.getId().equals(customer.getId())) {
                c.setName(customer.getName());
                c.setAge(customer.getAge());
                return c;
            }
        }
        return null;
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE , params = {"id"})
    public boolean deleteCustomer(@RequestParam("id") String id){
        for(CustomerDTO c : customerDTOS){
            if(c.getId().equals(id)){
                customerDTOS.remove(c);
                return true;
            }
        }
        return false;
    }
}
