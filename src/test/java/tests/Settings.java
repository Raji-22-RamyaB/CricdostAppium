package tests;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Settings extends BaseClass {

	@Test(priority = 0)
	public static void appiumSetup(){

		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "INTEX_AQUA_LIONS_3");
		//dc.setCapability("udId", "MFIJ4DIFHQJVM7RK");
		dc.setCapability("udId","FEZLG6I7QSCYN7FA");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("appPackage", "com.xcelcorp.cricdost");
		dc.setCapability("launcherActivity", "com.xcelcorp.cd.splash.SplashActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);

		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/skip")).click();*/
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);              

		driver.findElement(By.xpath("//*[@text='Settings']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.id(appPackage + ":id/privacy")).click();

		driver.findElement(By.id(appPackage + ":id/switch_profile_visibility")).click();
		driver.findElement(By.id(appPackage + ":id/positive_button")).click();
		driver.findElement(By.id(appPackage + ":id/switch_dp_visibility")).click();
		WebElement ele = driver.findElement(By.id(appPackage + ":id/positive_button"));
		ele.click();
		driver.findElement(By.id(appPackage + ":id/switch_allow_call")).click();
		WebElement ele1 = driver.findElement(By.id(appPackage + ":id/positive_button"));
		ele1.click();
		driver.findElement(By.id(appPackage + ":id/img_back")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void profile() throws IOException {
		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/profile")).click();


		driver.findElement(By.xpath("//*[@text='EDIT']")).click();

		driver.findElement(By.id(appPackage+":id/edt_text")).sendKeys("TESTING");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		//driver.findElement(By.id(appPackage+":id/txt_text")).sendKeys("Mar 7,2022");

		/*  driver.findElement(MobileBy.
		  xpath("//android.widget.LinearLayout[@content-desc=\"Kaycee, WY 82639, USA\"]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.TextView"
		  )).click();*/

		/*	 // driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_text")).click();
		   driver.findElement(By.xpath("//*[@text='chennai']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id( "com.android.packageinstaller:id/permission_allow_button")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 //driver.findElement(By.id("com.xcelcorp.cricdost:id/atv_places")).click();
		 //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.xcelcorp.cricdost:id/atv_places")).sendKeys("chennai");
		  driver.findElement(By.id("com.xcelcorp.cricdost:id/locationInfo")).click();

		/*  driver.findElement(By.id("com.xcelcorp.cricdost:id/btnLocation")).click();
		  driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);*/  

		driver.findElement(By.id("com.xcelcorp.cricdost:id/spn_gender")).click();
		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/spn_skills")).click();
		driver.findElement(By.xpath("//*[@text='Bowler']")).click();

		driver.findElement(By.id(appPackage+":id/btn_submit")).click();
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/img_back")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.navigate().back();
		String cmd = "adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmd);

		/*driver.findElement(By.id(appPackage+":id/markerImg")).click();
		 driver.manage().timeouts().implicitlyWait(50 , TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(driver,25);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(appPackage+
		  ":id/btnLocation"))).click(); MobileElement element = (MobileElement)
		  driver.findElement(By.id(appPackage+":id/btnLocation"));

		  element.click();


		  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);


		  driver.findElement(By.id(appPackage+":id/spn_gender")).click(); Select
		ele=new Select(driver.findElement(By.id(appPackage+":id/spn_gender"))); //
		  ele.selectByIndex(2); driver.manage().timeouts().implicitlyWait(25,
		 TimeUnit.SECONDS); ele.selectByIndex(2);


		  driver.findElement(By.id(appPackage+":id/spn_skills")).click(); Select
		  ele1=new Select(driver.findElement(By.id(appPackage+":id/spn_skills")));
		  ele1.selectByIndex(1); driver.manage().timeouts().implicitlyWait(25,
		  TimeUnit.SECONDS);


		 driver.findElement(By.id(appPackage+":id/btn_submit")).click();
		 driver.findElement(By.id(appPackage+":id/btn_cancel")).click();*/

	}



	@Test(priority = 2)
	public void viewfullcareer() throws IOException {
		String appPackage = "com.xcelcorp.cricdost";
		driver.findElement(By.id(appPackage + ":id/profile")).click();

		driver.findElement(By.xpath("//*[@text='View Full Career']")).click();
		driver.findElement(By.xpath("//*[@text='BATTING']")).click();
		driver.findElement(By.xpath("//*[@text='BOWLING']")).click();
		driver.findElement(By.xpath("//*[@text='GENERAL MATCH']")).click();
		driver.findElement(By.xpath("//*[@text='BATTING']")).click();
		driver.findElement(By.xpath("//*[@text='BOWLING']")).click();
		driver.findElement(By.xpath("//*[@text='TOTAL']")).click();
		driver.findElement(By.xpath("//*[@text='BATTING']")).click();
		driver.findElement(By.xpath("//*[@text='BOWLING']")).click();
		String cmd1 = "adb shell input keyevent 4";
		Runtime.getRuntime().exec(cmd1);
	}

	@Test(priority = 3)
	public void playerinsight() {
		driver.findElement(By.xpath("//*[@text='Player Insight']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/batting_insight")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_insight")).click();
		driver.navigate().back();

	}

	@Test(priority = 4)
	public void mymatches() {
		driver.findElement(By.xpath("//*[@text='My Matches']")).click();
		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		driver.findElement(By.xpath("//*[@text='RECENT']")).click();
		driver.findElement(By.xpath("//*[@text='ALL']")).click();
		driver.navigate().back();

	}

	@Test(priority = 5)
	public void mytournament() {
		driver.findElement(By.xpath("//*[@text='My Tournament']")).click();
		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		driver.findElement(By.xpath("//*[@text='RECENT']")).click();
		driver.findElement(By.xpath("//*[@text='ALL']")).click();
		driver.navigate().back();

	}

	@Test(priority = 6)
	public void myteams() {
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Teams\"));"));
		listitem.getLocation();
		listitem.click();
		//driver.findElement(By.xpath("//*[@text='My Teams']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"chennai kings.\"));"));
		listitem1.getLocation();
		listitem1.click();
		MobileElement listitem11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Siva Sakthi\"));"));
		listitem11.getLocation();
		listitem11.click();

		//driver.findElement(By.xpath("//*[@text='Siva Sakthi']")).click();
		driver.findElement(By.xpath("//*[@text='BOWLING']")).click();
		driver.findElement(By.xpath("//*[@text='TEAMS']")).click();
		driver.findElement(By.xpath("//*[@text='MATCHES']")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}
	/*
	 * @Test(priority=7) public void scroll() { Actions act=new Actions(driver);
	 * act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	 * driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); }
	 */

	@Test(priority = 8)
	public void mywallet() throws InterruptedException {

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Wallet\"));"));
		listitem.getLocation();
		listitem.click();


		// driver.findElement(By.xpath("//*[@text='My Wallet']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Add Money']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/amount_input")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/amount_input")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_mny")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/radio_upi")).click();
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).click();

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).sendKeys("raji");
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/email_input")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel_action")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/okbtn")).click();
		// driver.navigate().back();
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Test(priority=9)
	public void mytimeline() throws InterruptedException 

	{	
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Timeline\"));"));
		listitem.getLocation();
		listitem.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/spinner")).click();

		driver.findElement(By.xpath("//*[@text='CD Match']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		/*By _driver = null;
		Select one = new Select((WebElement) _driver.findElements((SearchContext) By.xpath(".//*[@text='CD Match']")));
		one.selectByIndex(1);
		driver.findElement(By.xpath(".//*[@text='CD Match']")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
         driver.findElement(By.id("com.xcelcorp.cricdost:id/filter_icon")).click();
		driver.findElement(By.id("//*[@text='Filter by date'")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		driver.navigate().back();
		 */

	}

	@Test(priority = 10)
	public void myrequests() throws InterruptedException {

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"My Requests\"));"));
		listitem.getLocation();
		listitem.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//*[@text='My Requests']")).click();
		driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/img_back")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		// driver.navigate().back();

	}

	@Test(priority = 11)
	public void pushnotification() throws InterruptedException {
		driver.findElement(By.id("com.xcelcorp.cricdost:id/switch_notifications")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Test(priority = 12)
	public void mobileno() throws InterruptedException {
		driver.findElement(By.id("com.xcelcorp.cricdost:id/change_mobile")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/change_mobile")).sendKeys("8825569993");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		Thread.sleep(2000);

	}

	@Test(priority=13)
	public void changepin() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/change_pin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/old_pin_entry")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/old_pin_entry")).sendKeys("1111");
		driver.navigate().back();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/new_pin_entry")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/new_pin_entry")).sendKeys("0909");
		driver.navigate().back();
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/new_pin_entry")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	@Test(priority=14)
	public void signout()

	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/sign_out")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/img_back")).click();

	}



}
