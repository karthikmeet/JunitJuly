package org.pageexecution;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageExe extends BaseClass {

	@Before
	public void before()
	{
		System.out.println("Before");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test 1");
		LoginPageRepo lp = new LoginPageRepo();
		type(lp.getUsername(),"Suresh");
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("test 2");
		LoginPageRepo lp = new LoginPageRepo();
		type(lp.getUsername(),"Kumar");
	}
	
	@Test
	public void reportgeneration()
	{
		ExtentTest logger = extent.createTest("LoginPage test");
		logger.log(Status.PASS, "Test success");
	}
	
	@After
	public void after()
	{
		System.out.println("after");
	}
}
