package org.example._13_spring_boot.Repo;

import org.example._13_spring_boot.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    // from JpaRepository interface{
}
