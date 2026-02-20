package TestSuites;

import BaseUtilities.DriverSetup;
import PageObjectModel.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testLoginOhrm extends DriverSetup {


    @Test
    public void loginToOrangeHRM() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        LoginPageObjects lp = new LoginPageObjects(driver);
        lp.loginOHrm();
        //to check git pull

    }

}
