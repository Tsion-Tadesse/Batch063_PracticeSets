package com.practicepart2.controller;

import com.practicepart2.repository.*;
import com.practicepart2.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class ControllerClass {
	
	@Autowired
	RepositoryClass rc;
	
	//adding data in table using JDBC
	@PostMapping("/add")
	public void addToTable(@RequestBody EntityClass ec ) {
		rc.save(ec);
	}
	//retrieving data in table using JDBC
	@GetMapping("/get")
	public List<EntityClass> getValues(){
		return rc.findAll();
	}
	@DeleteMapping("/delete/{id}")
	public String deteleData(@PathVariable ("id") @RequestBody int id) {
		try {
			rc.deleteById(id);
			return "deleted";
		}catch(Exception e) {
			e.printStackTrace();
			return "Not deleted";
		}	
}
	//Updating a table
	@PutMapping("update/{id}")
	ResponseEntity<EntityClass> updateData(@PathVariable("id") int id, @RequestBody EntityClass ec) {
		EntityClass updateEntityClass = rc.findById(id)
				.orElseThrow(() -> new RuntimeException("id not found"));
		updateEntityClass.setName(ec.getName());
		
		rc.save(updateEntityClass);
		
		return ResponseEntity.ok(null);
	}
	
}