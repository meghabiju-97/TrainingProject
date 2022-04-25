package basefunction1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
public WebDriver driver;

public WebDriver initializedriver() {
	
	//Used to configure browser driver path
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//resources//driver//chromedriver.exe");
	//Create an instance of Chrome Driver
	driver=new ChromeDriver();
	
	return driver;
}
}
