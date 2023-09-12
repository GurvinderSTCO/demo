import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Navigate all the side bars
public class A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();

		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin.akssai.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gurvindersinghmatharu@stco.co.in");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='icon-box']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='checkboxContainer d-flex justify-content-center align-item-center pointer ']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/services\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/assign-columns\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/assign-invoice-columns\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/assign-clients\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/open-items/admin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/admin-reports\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/all-users\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/change-credentials\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/user-management\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href=\"/id-password-manager\"]")).click();
		driver.close();

	}

}
