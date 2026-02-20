package BaseUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {

public WebDriver driver;

@BeforeClass
public void LaunchDriver(){
    driver = new ChromeDriver();
}
@AfterClass
public void CloseDriver(){
    driver.quit();
}

}
