package org.pageexecution;

import org.baseutils.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

public class HomePageExe extends BaseClass {

	@Before
	public void before()
	{
		System.out.println("Before 2");
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test 3");
		LoginPageRepo lp = new LoginPageRepo();
		type(lp.getUsername(),"Tamilarasan");
	}
	
	@Test
	public void test4() throws InterruptedException
	{
		System.out.println("test 4");
		LoginPageRepo lp = new LoginPageRepo();
		type(lp.getUsername(),"Santhosh");
	}
	
	@After
	public void after()
	{
		System.out.println("after");
	}
}
