package com.onesoft.ac;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ServiceAc {
	@Autowired
	DaoAc d;
	public String addAc(EntityAc a) {
		return d.addAc(a);
	}
	public EntityAc update(int id,EntityAc e) {
		return d.update(id,e);
	}
	public EntityAc updatebyPatch(int id,EntityAc e) {
		return d.updatebyPatch(id,e);
	}
	public String addAcAll(List<EntityAc> a) {
		return d.addAcAll(a);
}
	public EntityAc getAc(int id) {
		return d.getAc(id);
	}
	public List<EntityAc>getByBrand(String brand){
		return d.getByBrand(brand);
}
  public List<EntityAc>getWing(String wings)
  {
	  List<EntityAc>ac=d.getWing(wings);
	  List<EntityAc>a=ac.stream().filter(f->f.getColor().equalsIgnoreCase(wings)).map(m->{
		  if(m.getColor().equalsIgnoreCase(wings)) {
			 m.setPrice(m.getPrice()+1000);
		  }
		  return m;
	  }).collect(Collectors.toList());
	  return a;
  }	
}