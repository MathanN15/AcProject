package com.onesoft.ac;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@Controller
public class ControllerAc {
@Autowired
ServiceAc s;
@Autowired
RestTemplate rt;
@GetMapping("getHello")
public String getHello() {
	return "hello.html";
}
@GetMapping("getHellofromCar")
public String getHelloFromCar() {
String url="http://localhost:8080/hello";
ResponseEntity<String>res=rt.exchange(url,HttpMethod.GET,null,String.class);
String ans=res.getBody();
return ans;
}
@PutMapping("updateAc/{id}")
public EntityAc update(@PathVariable int id,@RequestBody EntityAc e) {
	return s.update(id,e);
}
@PatchMapping("updatebyPatch/{id}")
public EntityAc updatebyPatch(@PathVariable int id,@RequestBody EntityAc e) {
	return s.updatebyPatch(id, e);
}




// log4j

static  Logger log=Logger.getLogger(ControllerAc.class);
@PostMapping("addAc")
public String addAc(@RequestBody EntityAc a) {
	PropertyConfigurator.configure("Ac.properties");
  log.info(s.addAc(a));
  return s.addAc(a);

}
// For GitHub Checking in the git WebSite

@PutMapping("updateAc")
public String upAc(@RequestBody EntityAc e) {
	return "Updated Ac by git Hub";
}


@PostMapping("addAcAll")
public String addAc(@RequestBody List<EntityAc> a) {
	return s.addAcAll(a);
}
@GetMapping("getAc/{id}")
public EntityAc getAc(@PathVariable int id) {
	return s.getAc(id);
}
@GetMapping("getByBrand/{brand}")
public List<EntityAc>getByBrand(@PathVariable String brand){
	return s.getByBrand(brand);
}
@GetMapping("getDetByWings/{wings}")
public List<EntityAc>getWing(@RequestBody String wings){
	return s.getWing(wings);
}
}
