package org.example._13_spring_boot.Service;

import org.example._13_spring_boot.DTO.ItemDTO;
import org.example._13_spring_boot.Entity.Item;
import org.example._13_spring_boot.Repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public boolean addItem(ItemDTO itemDTO){
        if (itemRepo.existsById(itemDTO.getId())){
            System.out.println("Service addItem: Item already exists");
            return false;
        }else {
            Item item = new Item(itemDTO.getId(), itemDTO.getName(), itemDTO.getDescription(), itemDTO.getPrice(), itemDTO.getQty());
            itemRepo.save(new Item(item.getId(), item.getName(), item.getDescription(), item.getPrice(), item.getQty()));
            return true;
        }
    }
    public boolean existsItem(int id){
        return itemRepo.existsById(id);
    }

    public List<ItemDTO> getAllItems(){
        List<Item> items = itemRepo.findAll();
        return items.stream().map(item -> new ItemDTO(item.getId(), item.getName(), item.getDescription(), item.getPrice(), item.getQty())).collect(Collectors.toList());
    }

    public ItemDTO updateItem(ItemDTO itemDTO){
        if (existsItem(itemDTO.getId())){
            
        }
    }
}
