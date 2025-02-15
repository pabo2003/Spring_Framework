package org.example._13_spring_boot.Repo;

import org.example._13_spring_boot.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer> {
}
