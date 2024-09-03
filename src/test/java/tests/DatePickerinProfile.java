
package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DatePickerinProfile extends BaseClass {

	@Test(priority=0)


	public void navBar() throws InterruptedException
	{

		//nav
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		Thread.sleep(2000);
		//profilebar
		driver.findElement(By.id("com.xcelcorp.cricdost:id/layout_header")).click();
		Thread.sleep(2000);
		//edit
	}
	@Test(priority=1)
	public void dob() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edit_profile")).click();
		Thread.sleep(2500);
		//dob
		MobileElement dob=driver.findElement(By.id("com.xcelcorp.cricdost:id/txtDob"));
		//MobileElement dob=driver.findElement(By.xpath("//*[@text='10-Jan-2023']"));
		dob.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		dob.clear();
		Thread.sleep(3500);
		dob.click();
		Thread.sleep(3000);

	}

	@Test(priority=2)
	public void selectDate() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/month_navigation_fragment_toggle")).click();
		Thread.sleep(2000);


		MobileElement list= (MobileElement)driver.findElementByClassName("android.widget.LinearLayout");


		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1000)"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);




		//select year

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()). scrollIntoView(text(\"1920\"))"));


		/*MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"2009\"));")); */
		listitem.getLocation();
		listitem.click();
		Thread.sleep(4000);

		/*  `34790   
		 * List<MobileElement> days=(List<MobileElement>) driver.findElement(By.id("com.xcelcorp.cricdost:id/month_navigation_next"));

		        for (int i = 0; i < days.size(); i++) {
		        days.get(i).click();

		             }*/



		//select month
		MobileElement date=driver.findElement(By.id("com.xcelcorp.cricdost:id/month_navigation_next"));
		for (int i=0;i<2;i++)
		{
			date.click();
			Thread.sleep(2000);
		}

		//select date
		driver.findElement(By.xpath("//*[@text='22']")).click();
		Thread.sleep(2000);

		//ok button
		MobileElement ok=driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button"));
		ok.click();
		Thread.sleep(2000);

	}
	
}

