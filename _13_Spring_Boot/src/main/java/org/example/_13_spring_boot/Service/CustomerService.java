package org.example._13_spring_boot.Service;

import org.example._13_spring_boot.DTO.CustomerDTO;
import org.example._13_spring_boot.Entity.Customer;
import org.example._13_spring_boot.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public boolean addCustomer(CustomerDTO customerDTO){
        /*Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
        customerRepo.save(new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress()));
        System.out.println("Service addCustomer: " + customerDTO.getName());
        return true;*/
        if (customerRepo.existsById(customerDTO.getId())){  //existByName(customerDTO.getName())){ / existByAddress(customerDTO.getAddress())){
            System.out.println("Service addCustomer: Customer already exists");
            return false;
        }else {
            Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
            customerRepo.save(new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress()));
            System.out.println("Service addCustomer: " + customerDTO.getName());
            return true;
        }
    }

    public List<CustomerDTO> getAllCustomers(){
        List<Customer> customers = customerRepo.findAll();
        return customers.stream().map(customer -> new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress())).collect(Collectors.toList());
    }

    public boolean existCustomer(int id){
        return customerRepo.existsById(id);
    }

    public CustomerDTO updateCustomer(CustomerDTO customerDTO){
        if (existCustomer(customerDTO.getId())){
            Customer customer = customerRepo.findById(customerDTO.getId()).orElse(null);
            customer.setName(customerDTO.getName());
            customer.setAddress(customerDTO.getAddress());
            customerRepo.save(customer);
            System.out.println("Service updateCustomer: " + customerDTO.getName());
            return new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress());
        }else {
            System.out.println("Service updateCustomer: Customer not found");
            return null;
        }
    }

    public boolean deleteCustomer(@PathVariable("id") int id){
       for (Customer customer : customerRepo.findAll()){
           if (customer.getId()==id){
               customerRepo.deleteById(id);
               System.out.println("Service deleteCustomer: Customer with ID: " + id + " deleted");
               return true;
           }
       }
       return false;
    }
}
