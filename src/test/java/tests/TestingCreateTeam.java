
package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;

public class TestingCreateTeam extends BaseClass{

	@Test(priority=0)
	public void createTeam() throws InterruptedException
	{
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/nav_create_team")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/team_name")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/team_name")).sendKeys("DragonWorld");
		Thread.sleep(2000);
		WebElement shortname=driver.findElement(By.id("com.xcelcorp.cricdost:id/team_short_name"));
		shortname.click();
		Thread.sleep(2000);
		shortname.sendKeys("DGW");
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/map_img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnLocation")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void addPlayer() throws InterruptedException {  

		driver.findElement(By.id("com.xcelcorp.cricdost:id/team_profile")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("TEST");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******4455']")).click();
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("//*[@text='NEXT']"));
		add.click();
		Thread.sleep(3000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("siv");
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='******9898']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("balu");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******1805']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("mu");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******3970']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("raj");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******6489']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);


		/*driver.findElement(By.id("com.xcelcorp.cricdost:id/add_player")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("vine");
	 driver.navigate().back();
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@text='******6552']")).click();
     Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@text='NEXT']")).click();
	 Thread.sleep(2000);*/

		driver.navigate().back();
		Thread.sleep(2000);


	}
}
