package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class TestingMyMatch extends BaseClass{

	@Test(priority=0)
	public void createMatch()
	{
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/nav_settings")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/profile")).click();
		driver.findElement(By.xpath("//*[@text='My Matches']")).click();
		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		driver.findElement(By.xpath("//*[@text='RECENT']")).click();
		driver.findElement(By.xpath("//*[@text='ALL']")).click();
		//driver.findElement(By.xpath("//*[@text='spark won the toss and elected to bat']")).click();
		driver.findElement(By.xpath("//*[@text='champs team won the match by 24 runs']")).click();
		driver.findElement(By.xpath("//*[@text='INFO']")).click();
		/*driver.findElement(MobileBy.AndroidUIAutomator
            ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5000)"));*/



		AndroidElement list= (AndroidElement)driver.findElementByClassName("android.widget.LinearLayout");
		/*driver.findElement(MobileBy.AndroidUIAutomator
	                    ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000)"));*/
		/*driver.findElement(MobileBy.AndroidUIAutomator
	                 ("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"OFFICIALS\"));"));
		listitem.getLocation();
		listitem.click();                           
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_add_officials")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.navigate().back();


	}

}
