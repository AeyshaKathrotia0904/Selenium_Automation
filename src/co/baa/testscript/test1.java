package co.baa.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
 @Test
 public void demo()
 {
	 
	 System.out.println("on the console");
	 Reporter.log("welcome report and console",true);
	 Reporter.log("report",false);
	 
 }
}
