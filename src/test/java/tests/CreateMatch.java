 package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreateMatch extends BaseClass {
	@Test
	public static void createMatchTest() {
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.id(appPackage+":id/fab")).click();
		driver.findElement(By.xpath("//*[@text='Match']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		/*
		 * String
		 * actualtitle5=driver.findElementByAccessibilityId("CREATE MATCH").getText();
		 * System.out.println(actualtitle5); String expectedtitle5 = "CREATE MATCH";
		 * Assert.assertEquals(actualtitle5, expectedtitle5, "wrongtitle");
		 */
		driver.findElementsById("com.xcelcorp.cricdost:id/txt_next").get(3).click();
		driver.findElement(By.id("//*[text='Enter Ground Name']")).sendKeys("KKCStadium");
		//driver.findElement(By.id(appPackage+":com.xcelcorp.cricdost:id/autocomplete_ground")).sendKeys("chepaukstadium");
		driver.findElement(By.xpath("//*[@text='Enter Ground Location']")).sendKeys("chennai");
		driver.findElement(By.id(appPackage+":id/autocomplete_city")).sendKeys("ambattur ot");
		driver.findElement(By.id(appPackage+":id/img_team_a")).click();
		driver.findElement(By.id(appPackage+":id/edt_search")).sendKeys("warriors");
		driver.findElementsByClassName("android.widget.FrameLayout").get(1).click();
		driver.findElementsByClassName("android.widget.TextView").get(7).click();
		driver.findElement(By.id(appPackage+":com.xcelcorp.cricdost:id/btn_squad_team_a")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/img_team_b")).click();
		driver.findElement(By.id(appPackage+":id/edt_search")).sendKeys("irons");
		driver.findElementsByClassName("android.widget.FrameLayout").get(1).click();
		driver.findElement(By.id(appPackage+":id/txt_next")).click();

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"NEXT\"));"));// scroll
																												// down
																												// vertical

		listitem.getLocation();
		listitem.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/txt_next")).click();
		driver.findElement(By.id(appPackage+":id/txt_next")).click();
		
		driver.findElement(By.id(appPackage+":com.xcelcorp.cricdost:id/txt_next")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actualtitle6 = driver.findElement(By.xpath("//*[@text='MATCH DETAILS']")).getText();
		System.out.println(actualtitle6);
		String expectedtitle6 = "MATCH DETAILS";
		Assert.assertEquals(actualtitle6, expectedtitle6, "Wrongtitle");
		//driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		
		
      
	}

}
