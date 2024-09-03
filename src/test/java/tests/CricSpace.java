package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
  
	public class CricSpace extends BaseClass{
		
		@Test(priority=0)
		public void createMatch() throws InterruptedException
		{
	     driver.findElement(By.xpath("//*[@text='CricSpace']")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//*[@text='Match ID :']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@text='SUMMARY']")).click();
	     Thread.sleep(2000);
	     AndroidElement list= (AndroidElement)driver.findElementByClassName("android.widget.LinearLayout");
	     driver.findElement(MobileBy.AndroidUIAutomator
                 ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000)"));
	     Thread.sleep(2000);
	     list.getLocation();
	 	list.click(); 
	     Thread.sleep(2000);
	     
	     MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"2nd Innings\"));"));
			listitem.getLocation();
			listitem.click();                           
			Thread.sleep(2000);
		}
		@Test(priority=1)
		public void Scorecard() throws InterruptedException
		{
		 driver.findElement(By.xpath("//*[@text='SCORECARD']")).click();
	     Thread.sleep(2000);
	     
	     MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SCORE\"));"));
			listitem.getLocation();
			listitem.click();                           
			Thread.sleep(2000);
		}
		
		@Test(priority=2)
		public void Overs() throws InterruptedException
		{	
	     driver.findElement(By.xpath("//*[@Text='OVERS")).click();
	     Thread.sleep(2000);
	     
	     MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Sakthi & Aswini\"));"));
			listitem.getLocation();
			listitem.click();                           
			Thread.sleep(2000);
		}
		
		
		
		
		/*
	     driver.findElement(By.xpath("))
	     
	    */
	
	
        
	}
	
