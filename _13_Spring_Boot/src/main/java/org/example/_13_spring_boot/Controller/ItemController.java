package org.example._13_spring_boot.Controller;

import org.example._13_spring_boot.DTO.CustomerDTO;
import org.example._13_spring_boot.DTO.ItemDTO;
import org.example._13_spring_boot.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getAll")
    public List<ItemDTO> getAllItems() {
        List<ItemDTO> allItems = itemService.getAllItems();
        return allItems;
    }
    @PostMapping("/save")
    public boolean saveItem(@RequestBody ItemDTO itemDTO){
        boolean res = itemService.addItem(itemDTO);
        return res;
    }

    public ItemDTO updateItem(@RequestBody ItemDTO itemDTO){
        CustomerDTO updatedItem = itemService.updateItem(itemDTO);
        return updatedItem;
    }
}
