/*package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class CreMatchTo extends BaseClass {
	@Test(priority = 0)
	public static void createMatchTest() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage + ":id/fab")).click();
		driver.findElement(By.xpath("//*[@text='Match']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualtitle = driver.findElement(By.xpath("//*[@text='CREATE MATCH']")).getText();
		System.out.println(actualtitle);
		String expectedtitle = "CREATE MATCH";
		Assert.assertEquals(actualtitle, expectedtitle, "Wrongtitle");
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_text")).clear();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_text")).sendKeys("5");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("android:id/text1")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_ground")).click();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_ground")).sendKeys("KKCStadium");
		// driver.findElement(By.id(appPackage+":com.xcelcorp.cricdost:id/autocomplete_ground")).sendKeys("chepaukstadium");
		driver.findElement(By.xpath("//*[@text='Enter Ground Location']")).sendKeys("chennai");
		driver.findElement(By.id(appPackage + ":id/autocomplete_city")).sendKeys("ambattur ot");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@text='----  SELECT TEAMS  ----']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_team_a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id(appPackage + ":id/edt_search")).sendKeys("SELVAASTAR");
		driver.findElement(By.xpath("//*[text='CD NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElementsByClassName("android.widget.FrameLayout").get(1).click();
		driver.findElementsByClassName("android.widget.TextView").get(7).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_a")).click();
		driver.findElement(By.xpath("//*[@text='******1805']")).click();

		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='******2053']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='******3970']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='******4437']")).click();
		Thread.sleep(1000);
		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******6522\"));"));
		listitem1.click();
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/captain")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_keeper")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(appPackage + ":id/img_team_b")).click();
		driver.findElement(By.id(appPackage + ":id/edt_search")).sendKeys("BEAST");
		driver.navigate().back();
		driver.findElementsByClassName("android.widget.FrameLayout").get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_b")).click();
		driver.findElement(By.xpath("//*[@text='******7944']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******6489']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******7890']")).click();
		Thread.sleep(2000);
		MobileElement listitem2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******9993\"));"));
		listitem2.click();
		driver.findElement(By.xpath("//*[@text='******7573']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id(appPackage + ":id/txt_next")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/captain")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_keeper")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"NEXT\"));"));// scroll
																												// down																								// vertical
		listitem.getLocation();
		listitem.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id(appPackage + ":id/txt_next")).click();
		driver.findElement(By.id(appPackage + ":id/txt_next")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		Thread.sleep(2000);
		String actualtitle6 = driver.findElement(By.xpath("//*[@text='MATCH DETAILS']")).getText();
		System.out.println(actualtitle6);
		String expectedtitle6 = "MATCH DETAILS";
		Assert.assertEquals(actualtitle6, expectedtitle6, "Wrongtitle");
	}

	@Test(priority = 1)
	public void liveStreaming() throws InterruptedException {
		driver.findElement(By.xpath("//*[@text='Manage/Plan your LIVE Stream']")).click();
		driver.findElement(By.xpath("//*[@text='Mobile Streaming']")).click();
		driver.findElement(By.xpath("//*[@text='ACTIVATE MOBILE STREAMING']")).click();
		driver.findElement(By.xpath("//*[@text='+']")).click();
		driver.findElement(By.xpath("//*[@text='Your Own Channel Stream']")).click();
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		driver.findElement(By.xpath("//*[@text='Net Banking']")).click();
		driver.findElement(By.xpath("//*[@text='Enter Your Email ID']")).sendKeys("selva.g@xcelcorp.com");
		driver.findElement(By.xpath("//*[@text='PAY NOW']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='HDFC']")).click();
		driver.findElement(By.xpath("//*[@text='PAY ₹ 148 PAY ₹ 148']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Success']")).click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//*[@text='Payment Successful']")).getText();
		System.out.println(actualtitle);
		String expectedtitle = "Payment Successful";
		Assert.assertEquals(actualtitle, expectedtitle, "Wrongtitle");
		driver.findElement(By.xpath("//*[@text='OKAY']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/facebook_connect")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Facebook Streaming']")).click();
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void assignStreamer() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Select Streamer']")).click();
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Thala Dhoni");
		driver.findElement(By.xpath("//*[@text='******9993']")).click();
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Select Streamer']")).click();
		driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("durga");
		driver.findElement(By.xpath("//*[@text='******2053']")).click();
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
	}

	@Test(priority = 3)
	public void manageMasterControl() {
		driver.findElement(By.xpath("//*[@text='Manage/Plan your LIVE Stream']")).click();
		driver.findElement(By.xpath("//*[@text='Mobile Streaming']")).click();
		driver.findElement(By.xpath("//*[@text='Manage Master Control']")).click();
		driver.findElement(By.xpath("//*[@text='TAKE CONTROL']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/back_layout")).click();
		driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();

	}

	@Test(priority = 4, enabled = true)
	public void toss() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Go For Toss']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/coin_over_lay")).click();
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath("//*[@text='SELVAASTAR won the toss and elected to']")).isDisplayed();
			System.out.println("SELVAASTAR  won the toss and elected to Batting");
			driver.findElement(By.id("com.xcelcorp.cricdost:id/batting_layout")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.xcelcorp.cricdost:id/striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='SELVA K']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/non_striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_layout")).click();
			driver.findElement(By.xpath("//*[@text='Aswini']")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();

			// match settings

			Thread.sleep(2000);
			WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/totalOvers"));
			over.clear();
			over.sendKeys("1.0");
			MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
			listitem.getLocation();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();

		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("BEAST won the toss and elected to Bowling");
			driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_label")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='SELVA K']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/non_striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_layout")).click();
			driver.findElement(By.xpath("//*[@text='Aswini']")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();
		} finally {
			System.out.println("Match Starts............");
		}
// matchsettings
		Thread.sleep(2000);
		WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/totalOvers"));
		over.clear();
		over.sendKeys("1.0");
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
		listitem.getLocation();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();
	}


	@Test(priority = 5)
	public void masterControll() throws InterruptedException {
		driver.findElement(By.id("com.xcelcorp.cricdost:id/back_button")).click();
		driver.findElement(By.xpath("//*[@text='Manage/Plan your LIVE Stream']")).click();
		driver.findElement(By.xpath("//*[@text='Mobile Streaming']")).click();
		driver.findElement(By.xpath("//*[@text='Manage Master Control']")).click();
		driver.findElement(By.xpath("//*[@text='TAKE CONTROL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Camera 2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/back_layout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/back_layout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/back_layout")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_action")).click();
		Thread.sleep(2000);
		WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/totalOvers"));
		over.clear();
		over.sendKeys("1.0");
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
		listitem.getLocation();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();
	}
	@Test(priority = 6, enabled = true)
	public void firstInnings() throws InterruptedException {

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wagonSwitch")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		driver.findElement(By.xpath("//*[@text='Murali']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		// innings break
		driver.findElement(By.xpath("//*[@text='START MATCH (Innings Break)']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();

	}


	@Test(priority = 7, enabled = true)
	public void secInnings() throws InterruptedException {
		// Striker details
		driver.findElement(By.xpath("//*[@text='CHOOSE STRIKER']")).click();
		driver.findElement(By.xpath("//*[@text='Thala Dhoni']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CHOOSE NON STRIKER']")).click();
		driver.findElement(By.xpath("//*[@text='RamyaRaji']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CHOOSE BOWLER']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='SELVA K']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();

		// Runs
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/wagonSwitch")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		driver.findElement(By.xpath("//*[@text='swetha']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		driver.findElement(By.xpath("//*[@text='NEXT BALL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='D     T']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='NEXT OVER']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='CHOOSE AWARDS']")).click();
		driver.findElement(By.xpath("//*[@text='SELVA K']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='COMPLETED']")).click();


	}
}
*/
