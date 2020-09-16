package samptest;


import org.testng.annotations.Test;

public class MySampleTest {


	@Test(groups= {"regression"})
	public void login1() throws InterruptedException {
		System.out.println("i Logged in 1");
	}
	@Test(groups= {"regression"})
	public void login2() {
		System.out.println("i Logged in 2");
	}
	@Test(groups= {"smoke"})
	
	public void login3() {
		System.out.println("i Logged in 3");
	}
	@Test(groups= {"smoke"})
	public void login4() {
		System.out.println("i Logged in 4");
	}
	@Test(groups= {"regression","smoke"})
	public void login5() {
		System.out.println("i Logged in 5");
	}
	
}
