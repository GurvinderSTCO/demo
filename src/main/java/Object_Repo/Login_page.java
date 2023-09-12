package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
@FindBy(name = "user_name")
private WebElement userNameEdt;

@FindBy(name = "user_password")
private WebElement passwordEdt;

@FindBy(id="submitbutton")
private WebElement loginbtn;

public Login_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUserNameEdt() {
	return userNameEdt;
}

public WebElement getPasswordEdt() {
	return passwordEdt;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
	static WebDriver driver=new ChromeDriver();
Login_page lp=new Login_page(driver);
lp.get

}
