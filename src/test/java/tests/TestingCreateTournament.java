package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TestingCreateTournament extends BaseClass {
	@Test(priority = 0)
	public void tournament() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Open navigation drawer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Create Tournament']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void createTheTournamentDetails() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("com.xcelcorp.cricdost:id/tournament_name"));
		ele.click();
		ele.sendKeys("RSK TRL");
		Thread.sleep(2000);
		driver.navigate().back();

		WebElement ele1 = driver.findElement(By.id("com.xcelcorp.cricdost:id/start_date"));
		ele1.click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/end_date")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("com.xcelcorp.cricdost:id/city_name"));
		ele3.click();
		ele3.sendKeys("Thiruvallur");
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("com.xcelcorp.cricdost:id/ground_name"));
		ele4.click();
		ele4.sendKeys("KR RS");
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("com.xcelcorp.cricdost:id/location"));
		ele.click();
		ele5.sendKeys("Bahavathapuram");
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement ele6 = driver.findElement(By.id("com.xcelcorp.cricdost:id/entry_fee"));
		ele6.click();
		ele6.sendKeys("500");
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/last_entry_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(4000);

		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
		listitem.getLocation();
		listitem.click();
		Thread.sleep(2000);

		/*WebElement elle = driver.findElement(By.xpath("//*[@text='League']"));
		elle.click();
		Thread.sleep(3000);*/

		WebElement balltype = driver.findElement(By.xpath("//*[@text='Select ball type']"));
		balltype.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='Hard Tennis Ball']")).click();
		Thread.sleep(2000);

		WebElement teams = driver.findElement(By.id("com.xcelcorp.cricdost:id/no_of_teams_knockout"));
		teams.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='4']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/player_per_team_knockout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='5']")).click();
		Thread.sleep(2000);

		WebElement over = driver.findElement(By.id("com.xcelcorp.cricdost:id/overs_count_knockout"));
		over.click();
		over.sendKeys("4");
		driver.navigate().back();
		Thread.sleep(2000);

		MobileElement listitem1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SUBMIT\"));"));
		Thread.sleep(2000);
		listitem1.getLocation();
		listitem1.click();
		Thread.sleep(2000);
		// driver.navigate().back();
	}

	@Test(priority = 2)
	public void infopageedit() throws InterruptedException {

		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_img_base_details")).click();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("com.xcelcorp.cricdost:id/tournament_name"));
		name.clear();
		name.click();
		name.sendKeys("RK TRL SALEM");
		Thread.sleep(2000);

		WebElement stdate = driver.findElement(By.id("com.xcelcorp.cricdost:id/start_date"));
		stdate.click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(2000);

		WebElement enddate = driver.findElement(By.id("com.xcelcorp.cricdost:id/end_date"));
		enddate.click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(2000);

		WebElement town = driver.findElement(By.id("com.xcelcorp.cricdost:id/city_name"));
		town.clear();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);
		town.sendKeys("Thiruvallur");
		Thread.sleep(1000);

		WebElement ground = driver.findElement(By.id("com.xcelcorp.cricdost:id/ground_name"));
		ground.clear();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);
		ground.sendKeys("KR RK SALEM GROUND");
		Thread.sleep(1000);

		WebElement location = driver.findElement(By.id("com.xcelcorp.cricdost:id/location"));
		location.clear();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		Thread.sleep(2000);

		location.sendKeys("Bavathapuram");
		Thread.sleep(1000);

		WebElement fees = driver.findElement(By.id("com.xcelcorp.cricdost:id/entry_fee"));
		fees.clear();
		Thread.sleep(2000);
		fees.sendKeys("5001");
		Thread.sleep(2000);

		WebElement lastdate = driver.findElement(By.id("com.xcelcorp.cricdost:id/last_entry_date"));
		lastdate.click();
		driver.findElement(By.id("com.xcelcorp.cricdost:id/confirm_button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);

		//driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next")).click();
		WebElement upd=driver.findElement(By.xpath("//*[@text='Update']"));
		//WebElement upd=driver.findElement(By.id("com.xcelcorp.cricdost:id/btn_next"));
		upd.click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@text='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.xcelcorp.cricdost:id/img_back")).click();
		Thread.sleep(2000);
	}


	@Test(priority = 3)
	public void matchInfo() throws InterruptedException {
		driver.findElement(By.id("com.xcelcorp.cricdost:id/edt_img_tourn_type")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@text='League']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.id("com.xcelcorp.cricdost:id/update")).click();
		Thread.sleep(2000);

		Select balltype = new Select(driver.findElement(By.id("android:id/text1")));
		balltype.selectByIndex(2);
		Thread.sleep(2000);

		WebElement ele33 = driver.findElement(By.xpath("//*[@text='No of Teams']"));
		ele33.click();
		Thread.sleep(2000);
		ele33.sendKeys("5");
		Thread.sleep(2000);

		Select groups = new Select(driver.findElement(By.id("com.xcelcorp.cricdost:id/number_of_groups_league")));
		groups.selectByIndex(2);
		Thread.sleep(2000);

		Select player = new Select(driver.findElement(By.id("com.xcelcorp.cricdost:id/player_per_team_league")));
		player.selectByIndex(2);
		Thread.sleep(2000);

		WebElement overs = driver.findElement(By.id("com.xcelcorp.cricdost:id/over_count_league"));
		overs.click();
		Thread.sleep(2000);
		overs.sendKeys("5");
		Thread.sleep(2000);

		driver.findElement(By.id("com.xcelcorp.cricdost:id/update")).click();
		Thread.sleep(2000);


		driver.navigate().back();
	}
}


