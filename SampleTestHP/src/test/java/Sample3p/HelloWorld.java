package Sample3p;

import org.testng.annotations.Test;

public class HelloWorld {
	
@Test(groups= {"smoke"})
public void greeting1() {
	System.out.println("Hello 1");
}

@Test(groups= {"regression"})
public void greeting2() {
	System.out.println("Hello 2");
}

@Test(groups= {"sanity"})
public void greeting3() {
	System.out.println("Hello 3");
}
}
