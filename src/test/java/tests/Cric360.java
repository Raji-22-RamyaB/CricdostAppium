package tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Cric360 extends BaseClass {

	@Test(priority = 0)
	public static void appiumSetup(){
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Z60");
		dc.setCapability("udId", "Z60E418AA091798");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("appPackage", "com.xcelcorp.cricdost");
		dc.setCapability("appActivity", "com.xcelcorp.cd.splash.SplashActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		
		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/skip")).click();
		driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);*/
	}
		
		
		@Test(priority=1)
		public void Academy() {
		driver.findElement(By.xpath("//*[@text='Cric360']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_academy")).click();
		
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/academy_name")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/academy_name")).sendKeys("fifasports");
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_city")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_city")).sendKeys("chennai");
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/location")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/location")).sendKeys("chennai");
	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/alias")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/alias")).sendKeys("sportsstar");
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/fees")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/fees")).sendKeys("2000");
		driver.navigate().back();
		
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/from_time")).click();
		driver.findElement(MobileBy.AccessibilityId("3 o'clock")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_minute_tv")).click();
		driver.findElement(MobileBy.AccessibilityId("15 minutes")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_clock_period_pm_button")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_timepicker_ok_button")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/to_time")).click();
		driver.findElement(MobileBy.AccessibilityId("4 o'clock")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_minute_tv")).click();
		driver.findElement(MobileBy.AccessibilityId("25 minutes")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_clock_period_pm_button")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/material_timepicker_ok_button")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/contact_name")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/contact_name")).sendKeys("kamali");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@text='Enter contact number *']")).click();
		driver.findElement(By.xpath("//*[@text='Enter contact number *']")).sendKeys("6526548922");
		driver.navigate().back();
		
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/phone")).sendKeys("6526548922");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/email")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/email")).sendKeys("kamali.gmail.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.navigate().back();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/link")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/link")).sendKeys("www.kamali.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.navigate().back();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/description")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/description")).sendKeys("we are give a good training");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.navigate().back();

		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_academy")).click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		
		
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}/*
	@Test(priority=2)
	public void grounds() {
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_ground")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_name")).sendKeys("chepauk");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_city")).sendKeys("chennai");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/location")).sendKeys("chepauk,chennai");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/alias")).sendKeys("chennaikings");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/description")).sendKeys("This is big ground to play well");
        driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		
	}
	
	@Test(priority=3)
	public void coaches() {
		
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_coaches")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		
		driver.findElement(By.xpath("//*[@text='GUEST PLAYER']")).click();
		//driver.findElement(By.id("Enter Player Name")).click();
		/*driver.findElement(By.xpath("//*[@text='Search...")).click();
		driver.findElement(By.xpath("//*[@text='Search...")).sendKeys("India");
		driver.findElement(By.xpath("//*[@text='India (IN)'")).click();
*/

		
	/*	driver.findElement(By.xpath("//*[@text='Enter Mobile Number']")).sendKeys("6952348551");
		driver.findElement(By.xpath("//*[@text='Enter Player Name']")).sendKeys("ramya");
         
		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		
		
	/*	//driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_name")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("Anshuman biswal");
		//driver.findElement(By.xpath("//*[@text='Anshuman biswal']")).click();
		
		driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_amount")).sendKeys("20000");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/spn_per_unit")).click();
		driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_description")).sendKeys("for per match");
        driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();   */
       /* driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
    }*/
	
	@Test(priority=4)
	public void scorers() throws InterruptedException {
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_scorer")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='ADD GUEST PLAYER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Mobile Number']")).sendKeys("9558325552");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Player Name']")).sendKeys("venkat");
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=5)
	public void umpires() throws InterruptedException {
	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_umpires")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='ADD GUEST PLAYER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Mobile Number']")).sendKeys("8522325552");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Player Name']")).sendKeys("pradhap");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	}
	@Test(priority=6)
	public void commentator() throws InterruptedException {
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_commentator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		driver.findElement(By.xpath("//*[@text='ADD GUEST PLAYER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Mobile Number']")).sendKeys("6985325552");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@text='Enter Player Name']")).sendKeys("nila");
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	@Test(priority=7)
	public void vediographer() throws InterruptedException {
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_streamer")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add")).click();
		driver.findElement(By.xpath("//*[@text='ADD GUEST PLAYER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Mobile Number']")).sendKeys("8136548909");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Player Name']")).sendKeys("navee");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
		
		 
		
		
		
		
}
