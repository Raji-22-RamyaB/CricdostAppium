package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class CreateTeam extends BaseClass {
	
	@Test
	public void createTeamtest() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.findElement(By.id(appPackage+":id/design_menu_item_text")).click();
		String actualtitle = driver.findElement(By.id(appPackage+":id/header_text")).getText();
		System.out.println(actualtitle);
		String expectedtitle="Create Team";
		Assert.assertEquals(actualtitle, expectedtitle, "wrongtitle");
		driver.findElement(By.id(appPackage+":id/team_name")).sendKeys("champs team");
		driver.findElement(By.id(appPackage+":id/map_img")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id(appPackage+":id/atv_places")).click();
		driver.findElement(By.id(appPackage+":id/atv_places")).sendKeys("chennai");
		driver.findElement(By.id(appPackage+":id/locationInfo")).click();
		driver.findElement(By.id(appPackage+":id/submit")).click();
		driver.findElement(By.id(appPackage+":id/find_player")).click();
		driver.findElement(By.id(appPackage+":id/edt_search")).click();
		//driver.findElement(By.id(appPackage+":id/edt_search")).sendKeys("xcel");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/player_name")).click();
		driver.findElement(MobileBy.AccessibilityId("CRICDOST NETWORK")).click();
		driver.findElement(By.id(appPackage+":id/player_name")).click();
		driver.findElement(By.id(appPackage+":id/txt_next")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/team_profile")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Back Button']")).click();
		driver.findElement(By.id(appPackage+":id/img_back")).click();
		
		 
	}

}
