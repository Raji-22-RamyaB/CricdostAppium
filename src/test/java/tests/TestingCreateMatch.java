package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class TestingCreateMatch extends BaseClass{
	@Test(priority=0)
	public void createMatch() throws InterruptedException
	{
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/nav_create_match")).click();
		/*driver.findElement(By.xpath("//*[@text='Date']")).click();
		driver.findElement(By.xpath("//*[@text='20']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();*/

		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_text")).clear();
		Thread.sleep(3500);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_text")).sendKeys("5");

		/*driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(By.xpath("//*[@text='5']")).click();
		Thread.sleep(2000);*/

		driver.findElement(By.id("com.xcelcorp.cricdost:id/spinner_player_count")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='5']")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_ground")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_ground")).sendKeys("chennai chepauk");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@text='Enter Ground Location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Enter Ground Location']")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_city")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/autocomplete_city")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);   

		/*driver.findElement(By.xpath("//*[@text='Time']")).click();
		 driver.findElement(By.xpath("//*[@text='3']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@text='30']")).click();

		 driver.findElement(By.id("com.xcelcorp.cricdost:id/material_clock_period_pm_button")).click();
		 driver.findElement(By.id("com.xcelcorp.cricdost:id/material_timepicker_ok_button")).click();
		 Thread.sleep(1000);
	     WebElement ele=driver.findElement(By.xpath("//*[@text='No. of Overs']"));
		 ele.clear();
		 ele.click();
		 ele.sendKeys("5");

		 WebElement ele2= driver.findElement(By.xpath("//*[@text='Players per Team']"));
		 ele2.click();
		 driver.findElement(By.xpath("//*[text='5']")).click();

		 WebElement ele3=driver.findElement(By.xpath("//*[@text='Ground Name']"));
		 ele3.click();
		 ele3.sendKeys("chennai chepauk");

		 WebElement ele4=driver.findElement(By.xpath("//*[@text='Location']"));
		 ele4.click();
		 ele4.sendKeys("chennai");

		 driver.findElement(By.id("com.xcelcorp.cricdost:id/img_map")).click();
		 WebElement ele5=driver.findElement(By.xpath("//*[@text='Town/City']"));
		 
		 ele5.click();
		 ele5.sendKeys("chennai");*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority=1)
	public void selectTeams() throws InterruptedException
	{
		//driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_team_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Select Team A']")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("royapuram rocker");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='royapuram rockers']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_a")).click();
		Thread.sleep(2000);
		//driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='No players selected. Click to add players']")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("aswin");
		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(1000);
		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******5550\"));"));
		listitem1.getLocation();
		listitem1.click();
		Thread.sleep(2500);
		
		//driver.findElement(By.xpath("//*[@text='******5550']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("RamyaRaj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='RamyaRaji']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                            
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("Siva Sakth");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Siva Sakthi']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("Mural");
		driver.findElement(By.xpath("//*[@text='Murali']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("balumahendi");
		driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(1000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));
		Thread.sleep(2000);*/

		//select team b
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_team_b")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("warrior");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='warriors']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_b")).click();
		//driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='No players selected. Click to add players']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("SELV");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@text='******3210']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2500);

 
		driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("Rajisi");
		Thread.sleep(2500);
		driver.navigate().back();
		/*MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******7890\"));"));
		listitem.getLocation();
		listitem.click();
		Thread.sleep(2500);*/
		
		
		
		//driver.findElement(MobileBy.AndroidUIAutomator
		               //     ("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000)"));
		

		driver.findElement(By.xpath("//*[@text='******6055']")).click();   
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("loli");
		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******4218']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("yuvasri");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		MobileElement listitem11 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******5296\"));"));
		listitem11.getLocation();
		listitem11.click();
		//driver.findElement(By.xpath("//*[@text='******4578']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(3500);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_add_player")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//*[@text='CD NETWORK']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("Vine");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='MY NETWORK']")).click();

		//driver.findElement(By.xpath("//*[@text='vinetha']")).click();
		Thread.sleep(2000);
		MobileElement listitem111 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"******6522\"));"));
		listitem111.getLocation();
		listitem111.click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=3)
	public void selectCaptain() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/captain")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_keeper")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_squad_team_b")).click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/captain")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_keeper")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=4)
	public void manageLiveStream() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/txt_select_cameraman")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Mobile Streaming']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/activate_mobile_stream")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/increment")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/increment")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/increment")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/user_channel_layout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_label")).click();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/net_banking_radio")).click();
		Thread.sleep(2500); 

		driver.findElement(By.xpath("//*[@text='PAY NOW']")).click();
		Thread.sleep(2500);


		driver.findElement(By.xpath("//*[@text='Kotak']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@text='Pay Now']")).click();
		Thread.sleep(2000);


		//success
		driver.findElement(By.xpath("//*[@text='Success']")).click();
		Thread.sleep(2000);
		//okbutton
		driver.findElement(By.id("com.xcelcorp.cricdost:id/okbtn")).click();
		Thread.sleep(2000);


	}

	@Test(priority=5,enabled=false)
	public void selectStreamingFb() throws InterruptedException
	{
		
		
		
		
		//connect button
		driver.findElement(By.id("com.xcelcorp.cricdost:id/facebook_connect")).click();
		Thread.sleep(5000);
		
		//after given the fb login click on that continue btn
				driver.findElement(By.xpath("//*[@text='Continue']")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_label")).click();
				Thread.sleep(5000);
		try {
        
		driver.findElement(By.id("com.xcelcorp.cricdost:id/facebook_radio")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(4000);
		
		}catch (org.openqa.selenium.NoSuchElementException e) {

		//activate fb acc

		driver.findElement(By.id("com.xcelcorp.cricdost:id/facebook_connect")).click();
		Thread.sleep(2000);

		//fb details
		//enter mob or email
		WebElement ele=driver.findElement(By.id("m_login_email"));
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("8925904894");
		Thread.sleep(2000);

		//enter psw
		WebElement psw=driver.findElement(By.id("m_login_password"));
		psw.click();
		Thread.sleep(2000);
		psw.sendKeys("xcelcorp");

		//login button
		driver.findElement(By.xpath("//*[@text='Log In']")).click();
		Thread.sleep(2000);
		//continue button
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		Thread.sleep(2000);
		}
		 finally {
				System.out.println("fb connected............");
			}
	}
 

	@Test(priority=6, enabled=false)
	public void selectStreamer() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='Select Streamer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_search")).sendKeys("ramyara");
		Thread.sleep(1000);
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='******8443']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*['com.xcelcorp.cricdost:id/txt_next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_label")).click();
		Thread.sleep(2000);
		

	}
	@Test(priority = 7, enabled = true)
	public void toss1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Go For Toss']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/imgCoinHead")).click();
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath("//*[@text='royapuram rockers won the toss and elected to']")).isDisplayed();
			System.out.println("royapuram rockers won the toss and elected to Batting");
			driver.findElement(By.id("com.xcelcorp.cricdost:id/batting_layout")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();	
			Thread.sleep(3000);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='Aswini']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/non_striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_layout")).click();
			driver.findElement(By.xpath("//*[@text='SELVA']")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();

			// match settings

			Thread.sleep(2000);
			WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/totalOvers"));
			over.clear();
			over.sendKeys("5.0");
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
			driver.findElement(By.xpath("//*[@text='Aswini']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("com.xcelcorp.cricdost:id/non_striker_layout")).click();
			driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.xcelcorp.cricdost:id/bowling_layout")).click();
			driver.findElement(By.xpath("//*[@text='SELVA']")).click();
			driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();
		} finally {
			System.out.println("Match Starts............");
		}
		// matchsettings
		Thread.sleep(2000);
		WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/totalOvers"));
		over.clear();
		over.sendKeys("5.0");
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
		listitem.getLocation();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit")).click();


	}

	@Test(priority=8)
	public void selectStriker() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/striker_name")).click();
		driver.findElement(By.xpath("//*[@text='Aswini']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/non_striker_name")).click();
		driver.findElement(By.xpath("//*[@text='Siva Sakthi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/bowler_name")).click();
		driver.findElement(By.xpath("//*[@text='SELVA']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/submit_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		Thread.sleep(2000);

	}

	@Test(priority=9)
	public void scoringOver() throws InterruptedException
	{
		//runs		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/wagonSwitch")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);



		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);



		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);



		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();                                             
		Thread.sleep(2000);



	}


	@Test(priority=10)
	public void chooseBowler() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Rajisiva']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

	}

	@Test(priority=11)
	public void FstOver() throws InterruptedException
	{
		//runs		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//wide	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wide_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//runs	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//wicket	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);

		//choose striker	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Murali']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//runs	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

	}

	@Test(priority=12)
	public void chooseBowler2() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='yuvasri']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

	}

	@Test(priority=13)
	public void SecOver() throws  InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//no ball	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/no_ball_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//wicket	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);

		//choose striker	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='RamyaRaji']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		//runs	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//lb	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/leg_bye_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//wicket	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);

		//choose striker	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Siva Sakthi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//runs
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


	}

	@Test(priority=14)
	public void chooseBowler3() throws InterruptedException

	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Vinetha']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@Test(priority=15)
	public void scoringThirdOver() throws InterruptedException
	{
		//runs		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/undo_ball")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


	}

	@Test(priority=16)
	public void chooseBowler4() throws InterruptedException

	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='lolita']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
	}

	@Test(priority=17)
	public void scoringFourthOver() throws InterruptedException
	{
		//runs		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//wicket	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority=18)
	public void inningsBreak() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='START MATCH (Innings Break)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		Thread.sleep(2000);


	}

	@Test(priority=19)
	public void secondInningsSelectingStrikers() throws InterruptedException
	{
		//sellectstriker		
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2500);

		driver.findElement(By.xpath("//*[@text='Vinetha']")).click();

		Thread.sleep(2500);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//chooseNonStriker
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='SELVA']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='YES']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Bowler
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Aswini']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority=20)
	public void secInningsStart() throws InterruptedException
	{

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


	}

	@Test(priority=21)
	public void chooseBowler1() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Siva Sakthi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
	}

	@Test(priority=22)
	public void secIn1stOver() throws InterruptedException
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//break
		driver.findElement(By.xpath("//*[@text='Break']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addInfo")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_notes")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_notes")).sendKeys("break");
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addInfo")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		Thread.sleep(2000);


		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//retireBatsman
		driver.findElement(By.xpath("//*[@text='Retire Batsman']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/striker_radio")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);


		//choose non-striker
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='vinetha']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//retire batsman 
		driver.findElement(By.xpath("//*[@text='Retire Bowler']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//choose bowler1
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='RamyaRaji']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		//wicket
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);


		//choose striker
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Rajisiva']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//cancle/abandon	 
		driver.findElement(By.xpath("//*[@text='Cancel/Abandon']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/positive_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/cancel")).click();
		Thread.sleep(2000);


		//runs
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

	}

	@Test(priority=23)
	public void chooseBowlerin2() throws InterruptedException

	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='balumahendiran']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);
	}

	@Test(priority=24)
	public void secOverInSecInnings() throws InterruptedException 
	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_four")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();	
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_three")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();  
		Thread.sleep(2000);

		//penalty runs	 
		driver.findElement(By.xpath("//*[@text='Penalty Run(s)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addRuns")).sendKeys("10");
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/addReason")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addReason")).sendKeys("rulesbreak");
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);


		//runs 
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click(); 
		Thread.sleep(2000);


		//declare innings
		driver.findElement(By.xpath("//*[@text='Declare Innings']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_cancel")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//runs 
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

	}

	@Test(priority=25)
	public void chooseBowlerin3() throws InterruptedException

	{
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Murali']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

	}

	@Test(priority=26)
	public void thirdOverInSecInnings() throws InterruptedException
	{
		//runs	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//sync 
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Sync\"));"));
		listitem.getLocation();
		listitem.click();                           
		Thread.sleep(2000);


		// driver.findElement(By.xpath("//*[@text='Sync']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//runs 
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		//using kebab/pop-up menu
		driver.findElement(By.id("com.xcelcorp.cricdost:id/pop_up_menu")).click();
		Thread.sleep(2000);


		//report issue 
		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Report Issue\"));"));
		listitem1.getLocation();
		listitem1.click();                           
		Thread.sleep(2000);


		//driver.findElement(By.xpath("//*[@text='Report Issue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addInfo")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/additionalInfo")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/additionalInfo")).sendKeys("...");
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addInfo")).click();
		Thread.sleep(2000);


		//changestriker
		driver.findElement(By.id("com.xcelcorp.cricdost:id/change_striker")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/player_two_layout")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
		Thread.sleep(2000);


		//runs
		//runs 
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_one")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//dot
		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		//wicket	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/wicket_text")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/addWicket")).click();
		Thread.sleep(2000);


		//choose striker
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Vinetha']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);


		//runs	
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_two")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


	}

	@Test(priority=27)
	public void chooseBowlerin4() throws InterruptedException

	{ 
		//choose bowler
		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='RamyaRaji']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);


		//runs
		driver.findElement(By.id("com.xcelcorp.cricdost:id/text_six")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/add_score")).click();
		Thread.sleep(2000);


	}

	@Test(priority=28)
	public void chooseAwards() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='CHOOSE AWARDS']")).click();
		Thread.sleep(2000);


		//man of the match 
		driver.findElement(By.id("com.xcelcorp.cricdost:id/player_layout")).click();
		Thread.sleep(2000);

		//or
		// driver.findElement(By.xpath("//*[@texr='Siva Sakthi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/btnNext")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/action_button")).click();
		Thread.sleep(2000);


	}

	@Test(priority=29)
	public void matchdetails() throws InterruptedException
	{//match details
		/* MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Sync\"));"));
		listitem.getLocation();
		listitem.click();                           
		Thread.sleep(2000);*/


		//info
		AndroidElement list= (AndroidElement)driver.findElementByClassName("android.widget.LinearLayout");
		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000)"));
		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//*[@text='LIVE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='SCORECARD']")).click();
		Thread.sleep(2000);
		AndroidElement list1= (AndroidElement)driver.findElementByClassName("android.widget.LinearLayout");
		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50000)"));
		driver.findElement(MobileBy.AndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(50000)"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//*[@text='OVERS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='COMMENTARY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='MVP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='STATISTICS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='VIDEOS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text=''MOMENTS]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);



	}
}


















