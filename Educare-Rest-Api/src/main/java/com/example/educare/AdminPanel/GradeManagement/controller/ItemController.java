/*package com.example.educare.AdminPanel.GradeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.educare.AdminPanel.GradeManagement.model.Item;
import com.example.educare.AdminPanel.GradeManagement.service.ItemManagementService;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/item")
public class ItemController {
	
	@Autowired
	private ItemManagementService _itemManagementService;

	@PostMapping("/save-item")
	public Item saveItemManagement(@RequestBody Item itemManagement) {
		return _itemManagementService.createItemManagement(itemManagement);
	}

	@PostMapping("/save-item-list")
	public List<Item> saveItemManagementList(@RequestBody List<Item> itemManagementList) {
		return _itemManagementService.createItemManagements(itemManagementList);
	}

	@GetMapping("/get-item-list")
	public List<Item> getAllItemManagements() {
		return _itemManagementService.getItemManagements();
	}

	@GetMapping("/get-item-by-id")
	public Item findItemManagementById(@RequestParam("id") int id) {
		return _itemManagementService.getItemManagementById(id);
	}

	@DeleteMapping("/delete-item-by-id")
	public String deleteItemManagementById(@RequestParam("id") int id) {
		return _itemManagementService.deleteItemManagementById(id);
	}

	@PutMapping("/update-item")
	public Item upateItemManagement(@RequestBody Item itemManagement) {
		return _itemManagementService.updateItemManagement(itemManagement);
	}

	@DeleteMapping("/delete-all-item")
	public String deleteAll() {
		_itemManagementService.deleteItemManagements();
		return "Successfully delete all entities";
	}
}
*/