package com.chala.newron.controller;

import com.chala.newron.model.dto.Category;
import com.chala.newron.model.dto.Item;
import com.chala.newron.service.CategoryService;
import com.chala.newron.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ItemController {

    private ItemService itemService;
    private CategoryService categoryService;

    public ItemController(ItemService itemService, CategoryService categoryService) {
        this.itemService = itemService; this.categoryService= categoryService;
    }

    @GetMapping("/getallitems")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{itemCode}")
    public Item getItemByCode(@PathVariable int itemCode) {
        return itemService.getItemByCode(itemCode);
    }

    @PostMapping("/additem")
    public Item addItem (@RequestBody Item item){
        itemService.addItem(item);
        return item;
    }

    @GetMapping("/getcategorylist")
    public List<String> getCategoryList(){
        return categoryService.getCategoryList();
    }

    @PostMapping("/addcategory")
    public Category addCategory (@RequestBody Category category){
        return categoryService.addCategory(category);
    }

//    @GetMapping("/helth")
//    public ResponseEntity<String> health() {
//        return ResponseEntity.ok("OK");
//    }

}
