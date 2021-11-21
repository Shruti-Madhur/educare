package com.example.educare.SharedModule.controller.Institutional;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.service.Institutional.BatchService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institutional/batch")
public class BatchController {
	
	@Autowired
	private BatchService _batchService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Batch> saveBatch(@RequestBody Batch batch) {
		return new ResponseEntity<>(
				_batchService.createBatch(batch),
				HttpStatus.OK
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Batch>> getAllBatchs() {
		return new ResponseEntity<>(
				_batchService.getBatchs(),
				HttpStatus.OK
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Batch> findBatchById(@PathVariable Long id) {
		return new ResponseEntity<>(
				_batchService.getBatchById(id),
				HttpStatus.OK
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteBatchById(@PathVariable Long id) {
		return new ResponseEntity<>(
				_batchService.deleteBatchById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Batch> upateBatch(@RequestBody Batch batch) {
		return new ResponseEntity<>(
				_batchService.updateBatch(batch),
				HttpStatus.OK
		);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<>(
				_batchService.deleteBatchs(),
				HttpStatus.OK);
	}
}
