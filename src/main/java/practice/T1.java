package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@Test//(priority=1,description="Check the Search field")
public class T1 {
static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\properties.properties.txt");
Properties pro=new Properties();
pro.load(fis);
String URL=pro.getProperty("url");
String USERNAME=pro.getProperty("username");
String PASSWORD=pro.getProperty("password");
driver.get(URL);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys(USERNAME);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
//Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='icon-box']")).click();
//Thread.sleep(1000);

driver.findElement(By.xpath("//div[@class='checkboxContainer d-flex justify-content-center align-item-center pointer ']")).click();
//Thread.sleep(1000);

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@href='/admin-reports']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//h4[normalize-space()='Job Progress']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Search Document (Min. 3 characters)']")).sendKeys("4003");
Thread.sleep(1000);
JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)","");
Thread.sleep(1000);
driver.close();
	}
	

}
