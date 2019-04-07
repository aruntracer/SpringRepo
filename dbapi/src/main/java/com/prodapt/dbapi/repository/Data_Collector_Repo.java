package com.prodapt.dbapi.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prodapt.dbapi.model.Data_collector;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface Data_Collector_Repo extends CrudRepository<Data_collector, Long>{
	
	@Query("select x from Data_collector x where x.data3 = :data3")
 	public List<Data_collector> findByData3(@Param("data3") String data3);
 	
}
