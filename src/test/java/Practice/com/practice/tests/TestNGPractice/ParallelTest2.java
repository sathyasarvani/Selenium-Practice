package Practice.com.practice.tests.TestNGPractice;

import org.testng.annotations.Test;

public class ParallelTest2 {
	@Test
	public void test3() throws InterruptedException {
		for(int i=1;i<=5;i++){
		System.out.println(i);
		Thread.sleep(1000);
		}
	}
	
	@Test
	public void test4() throws InterruptedException {
		for(int i=11;i<=15;i++){
		System.out.println(i);
		Thread.sleep(1000);
		}
	}
}
