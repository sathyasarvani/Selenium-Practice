package Practice.com.practice.tests.TestNGPractice;

import org.testng.annotations.Test;

public class ParallelTests {
	@Test
	public void test1() throws InterruptedException {
		for(int i=1;i<=5;i++){
		System.out.println(i);
		Thread.sleep(1000);
		}
	}
	
	@Test
	public void test2() throws InterruptedException {
		for(int i=11;i<=15;i++){
		System.out.println(i);
		Thread.sleep(1000);
		}
	}

}
