package com.onesoft.ac;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AcRepo extends JpaRepository<EntityAc, Integer>{
@Query(value="select * from entity_ac where brand like ? ",nativeQuery = true)
public List<EntityAc>getByBrand(String name);

@Query(value="select * from entity_ac where color like ?",nativeQuery = true)
public List<EntityAc>getDetByWings(String w);
}