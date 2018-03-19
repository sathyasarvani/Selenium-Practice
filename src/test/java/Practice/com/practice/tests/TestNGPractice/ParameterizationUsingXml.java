package Practice.com.practice.tests.TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingXml {
@Parameters({"suite-level-param"})
@Test
public void firstTest(String param) {
	System.out.println(param);
}

@Parameters({"test-level-param"})
@Test
public void secondTest(String param) {
	System.out.println(param);
}

@Parameters({"suite-level-param","test-level-param"})
@Test
public void thirdTest(String suiteparam,String testparam) {
	System.out.println(suiteparam+"----"+testparam);
}

}
