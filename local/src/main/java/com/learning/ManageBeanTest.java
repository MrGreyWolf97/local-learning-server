package com.learning;

import javax.faces.bean.*;

@ManagedBean(name = "manageBeanTest", eager = true)
public class ManageBeanTest {

      
   public ManageBeanTest() {
      System.out.println("ManageBeanTest started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}
