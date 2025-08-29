package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Login_testNG {
	WebDriver Driver;

	By userName = By.id("username");
	By mailID = By.id("email");
	By phn = By.id("tel");
	By file = By.name("datafile");
	By experience = By.xpath("//input[@value='three']");

	By click = By.id("submit");

	public Login_testNG(WebDriver Driver) {
		this.Driver = Driver;
	}

	@Test

	public String user(String input) {
		Driver.findElement(userName).sendKeys(input);
		return Driver.findElement(userName).getAttribute("value");
	}

	public String mail(String input) {
		Driver.findElement(mailID).sendKeys(input);
		return Driver.findElement(mailID).getAttribute("value");

	}

	public String phone(String input) {
		Driver.findElement(phn).sendKeys(input);
		return Driver.findElement(phn).getAttribute("value");

	}

	public String Files(String input) {
		Driver.findElement(file).sendKeys(input);
		return Driver.findElement(file).getAttribute("value");
	}

	public String gender(String input) {
		Select gender = new Select(Driver.findElement(By.name("sgender")));
		gender.selectByContainsVisibleText(input);
		return Driver.findElement(By.name("sgender")).getAttribute("value");

	}

	public boolean Exp() {
		Driver.findElement(By.xpath("//input[@value='three']")).click();
		return Driver.findElement(By.xpath("//input[@value='three']")).isSelected();
	}

	public boolean Skills() {
		Driver.findElement(By.xpath("//input[@value='testng']")).click();
		return Driver.findElement(By.xpath("//input[@value='testng']")).isSelected();

	}

	public String automation(String input) {
		Select automatic = new Select(Driver.findElement(By.id("tools")));
		automatic.selectByContainsVisibleText(input);
		return Driver.findElement(By.id("tools")).getAttribute("value");

	}

	public void click() {
		Driver.findElement(By.id("submit")).click();

	}

}
