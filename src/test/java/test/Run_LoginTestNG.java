package test;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import pages.Login_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Run_LoginTestNG {
	Properties p = new Properties();
	WebDriver Driver = new ChromeDriver();

	@Test
	public void login() throws IOException, InterruptedException {
		Login_testNG newobj = new Login_testNG(Driver);
		String wuname = newobj.user(p.getProperty("username"));
		System.out.println(wuname);

		String wmail = newobj.mail(p.getProperty("mail"));
		System.out.println(wmail);

		String wphn = newobj.phone(p.getProperty("number"));
		System.out.println(wphn);

		String Wfile = newobj.Files(p.getProperty("upload"));
		System.out.println(Wfile);

		String Wgender = newobj.gender(p.getProperty("gender"));
		System.out.println(Wgender);
		Boolean WExp = newobj.Exp();
		System.out.println(WExp);
		Boolean Wskills = newobj.Skills();
		System.out.println(Wskills);
		String Wauto = newobj.automation(p.getProperty("Auto"));
		System.out.println(Wauto);
		Thread.sleep(3000);
		newobj.click();

	}

	@BeforeTest
	public void beforetest() throws IOException, InterruptedException {

		FileReader fr = new FileReader(
				"C:\\Users\\gokulakrishnan.v\\Documents\\Changepond\\Maven_projectTask\\MavenTask\\utility\\login.properties");
		p.load(fr);

		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String first = Driver.getWindowHandle();
		Driver.get(p.getProperty("link"));
		Driver.manage().window().maximize();

		Driver.switchTo().newWindow(WindowType.TAB);
		String second = Driver.getWindowHandle();
		Driver.get(p.getProperty("link1"));
		Driver.switchTo().window(first);

		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void afterTest() {

	}
}
