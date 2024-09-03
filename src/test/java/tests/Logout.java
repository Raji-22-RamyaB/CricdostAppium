package tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Logout extends BaseClass{
	
	

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
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/skip")).click();*/
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Logout\"));"));
		
		listitem.getLocation();
		listitem.click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		
		

		
		
}
}