package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CreateTournament extends BaseClass{
	
	@Test
	public void createTournament() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Create Tournament']")).click();
		//String actualtitle3 = driver.findElement(By.xpath("//*[@text='Create Tournament']")).getText();
		//System.out.println(actualtitle3);
		//String expectedtitle3 = "Create Tournament";
		//Assert.assertEquals(actualtitle3, expectedtitle3, "Wrongtitle");
		// driver.findElement(By.xpath("//*[@text='Enter Tournament Name']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/tournament_name")).sendKeys("NewChampion");
		driver.findElement(By.id(appPackage+":id/start_date")).click();
		driver.findElement(By.xpath("//*[@text='15']")).click();
		driver.findElement(By.id(appPackage+":id/confirm_button")).click();
		driver.findElement(By.id(appPackage+":id/end_date")).click();
		driver.findElement(By.xpath("//*[@text='16']")).click();
		driver.findElement(By.id(appPackage+":id/confirm_button")).click();
		driver.findElement(By.id(appPackage+":id/city_name")).sendKeys("chennai");
		driver.findElement(By.id(appPackage+":id/ground_name")).sendKeys("chepauk Stadium");
		driver.findElement(By.id(appPackage+":id/location")).sendKeys("Chennai, Tamil Nadu, India");
		//driver.findElement(By.id(appPackage+":id/map_img")).click();
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//driver.findElement(By.id(appPackage+":id/atv_places")).click();
		//driver.findElement(By.id(appPackage+":id/atv_places")).sendKeys("chennai");
		//driver.findElement(By.id(appPackage+":id/locationInfo")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.TextView"));

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Entry Fee\"));"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		listitem.getLocation();
		listitem.click();

		// driver.findElement(By.id(appPackage+":id/entry_fee")).click();
		driver.findElement(By.id(appPackage+":id/entry_fee")).sendKeys("1000");
		driver.findElement(By.id(appPackage+":id/last_entry_date")).click();
		driver.findElement(By.xpath("//*[@text='15']")).click();
		driver.findElement(By.id(appPackage+":id/confirm_button")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// driver.findElement(By.id(appPackage+":id/tournament_type_spinner")).click();
		// driver.findElement(By.xpath("//*[@text='KnockOut']")).click();
		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"No of Teams\"));"));
		driver.findElement(By.id(appPackage+":id/ball_type_spinner")).click();
		driver.findElement(By.xpath("//*[@text='Pink Cricket Ball']")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		listitem1.getLocation();
		listitem1.click();
		driver.findElement(By.xpath("//*[@text='8']")).click();// select function
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*
		 * MobileElement listitem2 = (MobileElement) driver .findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" +
		 * "new UiSelector().text(\"No of Teams\"));")); listitem2.getLocation();
		 * listitem2.click();
		 * 
		 * driver.findElement(By.id(appPackage+":id/match_count_custom")).sendKeys(
		 * "5"); //driver.findElement(By.xpath("//*[@text='8']")).click();
		 * //driver.findElement(By.id(appPackage+":id/match_count_custom")).
		 * sendKeys("5");com.xcelcorp.jpl:id/over_count_custom
		 */ driver.findElement(By.id(appPackage+":id/overs_count_knockout")).sendKeys("10");
		/*
		 * MobileElement listitem3 = (MobileElement) driver .findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" +
		 * "new UiSelector().text(\"No of Teams\"));")); listitem3.getLocation();
		 * listitem3.click();
		 */

		 driver.findElement(By.id(appPackage+":id/submit")).click();
		
		//driver.findElement(By.id(appPackage+":id/com.xcelcorp.cricdost:id/img_back")).click();
		//driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();

	}

}
   
  
  
  
  
  
  
  
  
 