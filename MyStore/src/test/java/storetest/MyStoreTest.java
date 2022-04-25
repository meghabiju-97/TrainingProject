package storetest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basefunction1.BaseClass1;

public class MyStoreTest extends BaseClass1 {
public WebDriver driver;

@BeforeMethod
public void browser() {
	driver=initializedriver();
}

@Test
public void tc01() throws InterruptedException {
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).click();
	
}

}
