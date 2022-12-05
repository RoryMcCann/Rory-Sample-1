package JunitDayWise;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1WebPageLogin {
	
	
static WebDriver driver;

@BeforeClass
	public static void launch() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	}
	
@Before
    public void time1() {
    Date d = new Date();
    System.out.println("Start Time : " +d);
    }
	
@Test
	public void URLLaunch() {
    driver.get("https://www.youtube.com/");
    driver.manage().window().maximize();
	}
	
@Test
    public void search() {
    WebElement searchbar = driver.findElement(By.xpath("//input[@id='search']"));
    searchbar.sendKeys("Ena da Epdi Iruka");
}

@After

    public void time2() {
	Date d = new Date();
    System.out.println("End Time : " +d);
}

@AfterClass
    public static void quit() throws InterruptedException {
	Thread.sleep(3000);
    driver.quit();
	}


	
	
	
}
