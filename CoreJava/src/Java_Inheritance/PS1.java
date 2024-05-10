package Java_Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void doThis() {
		System.out.println("I am here");
	}
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
	}
	
	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
		System.out.println("Post Jira  2");
		System.out.println("Post Jira 3");
		
		System.out.println("Post Jira  4");
		System.out.println("Post Jira 5");
		System.out.println("Post Jira  6");
		System.out.println("Post Jira 7");
	}

}
