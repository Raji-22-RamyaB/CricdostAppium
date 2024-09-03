package tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginTestCases {
	public static AndroidDriver<WebElement> driver;

	@Test
	public static void appiumSetup() throws IOException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "S8_Pro");
		dc.setCapability("udId", "CM7TPVS4SSVG89FQ");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("appPackage", "com.xcelcorp.cricdost");
		dc.setCapability("appActivity", "com.xcelcorp.cd.splash.SplashActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.findElementsByClassName("android.widget.TextView").get(7).click();

		driver.findElementsByClassName("android.widget.ImageView").get(2).click();
		driver.findElementsByClassName("android.widget.TextView").get(2).click();
		driver.findElement(By.id("com.xcelcorp.jpl:id/edt_mobile")).sendKeys("8825569993");
		driver.findElement(By.id("com.xcelcorp.jpl:id/have_pin")).click();
		driver.findElementsByClassName("android.widget.ImageView").get(4).click();
		driver.findElement(By.id("com.xcelcorp.jpl:id/submit")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("com.xcelcorp.jpl:id/otp_input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String text = driver.findElementsByClassName("android.widget.ImageView").get(1).getText();
		System.out.println(text);

		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();

	}

}




