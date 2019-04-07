package com.prodapt.dbapi.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prodapt.dbapi.model.Data_Collector_Cols;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface Data_Collector_Colls_Repo extends CrudRepository<Data_Collector_Cols, Long>{
	
	@Query("select x from Data_collector x where x.data3 = :column_value")
 	public List<Data_Collector_Cols> findBycolumn_value(@Param("column_value") String column_value);
	
}
