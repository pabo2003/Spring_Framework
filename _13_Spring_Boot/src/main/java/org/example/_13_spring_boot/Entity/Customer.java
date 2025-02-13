package org.example._13_spring_boot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
}
