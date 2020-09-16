package samptest;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups= {"smoke"})
	public void welcome1() {
		System.out.println("i welcome you in 1");
	}
	@Test(groups= {"regression"})
	public void welcome2() {
		System.out.println("i welcome you in 2");
	}
}
