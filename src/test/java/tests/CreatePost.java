package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;                              

public class CreatePost extends BaseClass {
	@Test
	public void createPostTest() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage+":id/fab")).click();
		driver.findElement(By.id(appPackage+":id/layout_add_post")).click();
		String PostText=driver.findElement(By.id(appPackage+":id/header")).getText();
		String expectText= "Create post";
		Assert.assertEquals(PostText, expectText, "Wrong Name");
		driver.findElement(By.id(appPackage+":id/camera_img")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);																		
		driver.findElement(By.id(appPackage+":id/preview")).click();
		driver.findElement(By.id(appPackage+":id/menu_crop")).click();
		driver.findElement(By.id(appPackage+":id/post_text")).sendKeys("CricDost Testing Post");
		driver.findElement(By.id(appPackage+":id/add_post")).click();
		
		
		
		
		
	}
}
