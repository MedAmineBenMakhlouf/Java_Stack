package com.lookify.Repositories;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lookify.models.Lookify;
@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
		List<Lookify> findAll();
		
//		@Query(value="SELECT * FROM lookify order by rating desc limit 10;", nativeQuery = true)
		
		List<Lookify> findTop10ByOrderByRatingDesc();
		
		List<Lookify> findByArtist(String name);
		
}
