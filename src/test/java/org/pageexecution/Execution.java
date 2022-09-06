package org.pageexecution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginPageExe.class,
	HomePageExe.class	
})
public class Execution {

	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(LoginPageExe.class, HomePageExe.class);
		
		int failureCount = runClasses.getFailureCount();
		long runTime = runClasses.getRunTime();
		
		System.out.println(failureCount);
		System.out.println(runTime);		
	}
}
