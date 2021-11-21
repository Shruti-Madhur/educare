/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.Item;
import com.example.educare.AdminPanel.GradeManagement.repository.ItemRepository;

@Service
public class ItemManagementService {
	
	@Autowired
	private ItemRepository _itemManagementRepository;

	public Item createItemManagement(Item itemManagement) {
		return _itemManagementRepository.save(itemManagement);
	}

	public List<Item> createItemManagements(List<Item> itemManagementList) {
		return _itemManagementRepository.saveAll(itemManagementList);
	}

	public List<Item> getItemManagements() {
		return _itemManagementRepository.findAll();
	}

	public Item getItemManagementById(int id) {
		return _itemManagementRepository.findById(id).orElse(null);
	}

	public String deleteItemManagementById(int id) {
		_itemManagementRepository.deleteById(id);
		return "ItemManagement removed !!" + id;
	}

	public void deleteItemManagements() {
		_itemManagementRepository.deleteAll();
	}

	public Item updateItemManagement(Item itemManagement) {
		
		Item existingItemManagement = _itemManagementRepository.findById(itemManagement.getId()).orElse(null);
		
		existingItemManagement.setSubjectName(itemManagement.getSubjectName());
		existingItemManagement.setItemTopic(itemManagement.getItemTopic());
		existingItemManagement.setItemDue(itemManagement.getItemDue());
		existingItemManagement.setItemStatus(itemManagement.getItemStatus());
		existingItemManagement.setItemScore(itemManagement.getItemScore());
		existingItemManagement.setItemOutOf(itemManagement.getItemOutOf());
		existingItemManagement.setVivaExamId(itemManagement.getVivaExamId());
		existingItemManagement.setWrittenExamId(itemManagement.getWrittenExamId());
		existingItemManagement.setOspEaxmId(itemManagement.getOspEaxmId());
		existingItemManagement.setOscExamId(itemManagement.getOscExamId());
		existingItemManagement.setFacultyId(itemManagement.getFacultyId());
		existingItemManagement.setPhaseId(itemManagement.getPhaseId());
		existingItemManagement.setCardId(itemManagement.getCardId());
		existingItemManagement.setCreatedOn(itemManagement.getCreatedOn());
		existingItemManagement.setCreatedBy(itemManagement.getCreatedBy());

		return _itemManagementRepository.save(existingItemManagement);

	}
}
*/