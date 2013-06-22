package com.netease;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.TestException;
import org.testng.annotations.Test;

/**
 * ModuleA_ModuleC_ModuleE
 * 
 * @author jc
 *
 */
public class TestClass1 {

	@Test(dependsOnMethods = {"test3"}, alwaysRun = true, groups = {"firefox-only", "branch"})
	public void test1(String a, String b) {
		Reporter.log("This is a report message");
		//this.myTestContext.setAttribute("author", "unique");
	}
	
	@Test(groups = {"firefox-only", "branch"})
	public void test2() {
		;
	}
	
	/**
	 * 
	 * @author liming
	 * 
	 * @param a
	 * @param b
	 */
	@Test(groups = {"branch"})
	public void test3() {
		throw new TestException("Fail");
	}
	
	@Test(groups = {"branch"})
	public void test4() {
		throw new SkipException("Cancel this test");
	}
}
