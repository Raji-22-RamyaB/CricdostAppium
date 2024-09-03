package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class PlayerInsight extends BaseClass{
	@Test(priority=0)
	public static void insight() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		Thread.sleep(2000);              

		driver.findElement(By.id("com.xcelcorp.cricdost:id/layoutUser")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Player Insight']")).click();
		Thread.sleep(2000);

	}
	@Test(priority=1)
	public void batting() throws InterruptedException
	{

		driver.findElement(By.id("com.xcelcorp.cricdost:id/batting_insight")).click();
		Thread.sleep(2000);

		/*driver.findElement(By.id("com.xcelcorp.cricdost:id/view_all")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		Thread.sleep(2000);
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Out Type\"));"));
		Thread.sleep(5000);
		 driver.findElement(By.id("com.xcelcorp.cricdost:id/outType_filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.xcelcorp.cricdost:id/outType_filter")).click();
		 Thread.sleep(5000);

		 driver.findElement(By.xpath("//*[@text='All Innings']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@text='1st Innings']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@text='Right-arm medium']")).click(); */
		Thread.sleep(2000);




		driver.findElement(By.id("com.xcelcorp.cricdost:id/view_all")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);


		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Batting Position\"));"));
		Thread.sleep(2000);
		listitem.getLocation();
		listitem.click();  
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/batting_position")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/all_rounder_r_a_f_m")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_done")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/outType_filter")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='All Innings']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='1st Innings']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/all_rounder_r_a_m_f")).click();
		Thread.sleep(2000);

		MobileElement listitem1= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator( 
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Done\"));"));
		listitem1.getLocation();
		listitem1.click();
		Thread.sleep(2000);

	}
	@Test(priority=2)
	public void bowling() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_insight")).click();
		Thread.sleep(2000);

	}
	@Test(priority=3)
	public void scrolloption() throws InterruptedException
	{
		MobileElement listitem1= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator( 
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Batting Position Wise Wicket\"));"));
		listitem1.getLocation();
		listitem1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
}

