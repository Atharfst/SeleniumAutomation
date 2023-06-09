package controlExample;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class HandleDropdown extends BaseTest {

	@Test

	public void verifyDropDown() throws Exception {

		WebElement carlist = driver.findElement(By.xpath("//select")); // first one

		// handle dropdown ----- Select

		// https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/Select.html

		Select list = new Select(carlist);

		System.out.println("is listbox accept multiple selection or not: " + list.isMultiple()); // false

		Thread.sleep(2000);

		// Selection

		list.selectByIndex(1); // Saab

		Thread.sleep(2000);

		list.selectByValue("USA"); // Volvo

		Thread.sleep(2000);

		list.selectByVisibleText("Toyota"); // Toyota

	}

}