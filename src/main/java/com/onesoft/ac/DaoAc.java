package com.onesoft.ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



@Repository
public class DaoAc {
	@Autowired
	AcRepo r;
	 public String addAc(EntityAc a) {
		 r.save(a);
		 return "Successfully Added";
	 }
	 public String addAcAll(List<EntityAc> a) {
		 r.saveAll(a);
		 return "Successfully Added";
	 }
	 public EntityAc update(int id,EntityAc e) {
			EntityAc ac=r.findById(id).get();
			ac.setBrand(e.getBrand());
			ac.setColor(e.getColor());
			ac.setPrice(e.getPrice());
			ac.setWings(e.getWings());
			return r.save(ac);
		}
	 public EntityAc updatebyPatch(int id,EntityAc e) {
	     EntityAc ac=r.findById(id).get();
	     ac.setColor(e.getColor());
	     ac.setBrand(e.getBrand());
	     return r.save(ac);
	 }
	 public EntityAc getAc(@PathVariable int id) {
	      return r.findById(id).get();
		}
	 public List<EntityAc>getByBrand(String brand){
			return r.getByBrand(brand);
	 }
	 public List<EntityAc>getWing(String wings){
		 return r.findAll();
	 }
}
