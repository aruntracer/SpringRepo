package com.prodapt.dbapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.dbapi.model.Data_Collector_Cols;
import com.prodapt.dbapi.model.Data_collector;
import com.prodapt.dbapi.repository.Data_Collector_Colls_Repo;
import com.prodapt.dbapi.repository.Data_Collector_Repo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class Data_Collector_Controller {
	@Autowired
	private Data_Collector_Repo data_collector_repo; 
	
	@Autowired
	private Data_Collector_Colls_Repo Data_collector_colls_repo;
	
	@GetMapping("/airport/all")
    public Iterable<Data_collector> getAllRowsDC() {
        return data_collector_repo.findAll();
    }
    
    @GetMapping("/airport/tn/{data3}")
    public ResponseEntity<List<Data_collector>> getTnByNameDC(@PathVariable(value = "data3") String tn)//mention column name in value variable
        {
    	System.out.println("here tn");
    	List<Data_collector> airport = data_collector_repo.findByData3(tn);
        return ResponseEntity.ok().body(airport);
    }
    
    @GetMapping("/colmap/all")
    public Iterable<Data_Collector_Cols> getAllRowsDCC() {
        return Data_collector_colls_repo.findAll();
    }
}
