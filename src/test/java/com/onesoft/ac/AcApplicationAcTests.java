package com.onesoft.ac;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AcApplicationAcTests {
  @Autowired
  ControllerAc ac;
	@Test
	void contextLoads() {
	}
	
  @Test
  public void testgetAc() {
	  ac.getAc(1);
  }

}
