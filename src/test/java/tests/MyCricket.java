package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class MyCricket extends BaseClass{

	@Test(priority=0)
	public void MyCricket() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/bottom_nav_cricket")).click();

		Thread.sleep(2000);
	}
	
	
	@Test(priority=1)
	public void MyMatches() throws InterruptedException
	{
	 driver.findElement(By.xpath("//*[@text='MY MATCHES']")).click();
	 Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void ViewAllmatch() throws InterruptedException
	{
		AndroidElement list= (AndroidElement)driver.findElementByClassName("android.widget.LinearLayout");
		driver.findElement(MobileBy.AndroidUIAutomator
		                    ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5000"));
		
		
	}
}
