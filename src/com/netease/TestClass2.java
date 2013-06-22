package com.netease;
import org.testng.TestException;
import org.testng.annotations.Test;

/**
 * moduleA_ModuleB
 * 
 * @author jc
 *
 */
public class TestClass2 {
	@Test(dependsOnMethods = {"test3"}, alwaysRun = true, groups = {"chrome-only", "branch"})
	public void test1() {
		;
	}
	
	/**
	 * some description
	 * 
	 * @author fan_jiajia
	 * @author hzyuqf
	 */
	@Test(description = "some description", groups = {"branch"})
	public void test2() {
		;
		//;
		;
	}
	
	@Test(groups = {"trunk"})
	public void test3() {
		throw new TestException("Fail");
	}
}
