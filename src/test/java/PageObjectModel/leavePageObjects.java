package PageObjectModel;

import BaseUtilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leavePageObjects extends DriverSetup {
    WebDriver driver;

    public leavePageObjects (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 /*   public leavePageObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }*/
    @FindBy(xpath = "//span[text() ='Leave']")
    WebElement leaveMenu;
    @FindBy(xpath = "//label[text()= 'From Date']/ancestor::div[contains(@class,'oxd-input-group')]/following-sibling::div//i[contains(@class,'oxd-icon bi-calendar oxd-date-input-icon')]")
    WebElement fromDateIcon;
    @FindBy(xpath = "//label[text()= 'To Date']/ancestor::div[contains(@class,'oxd-input-group')]/following-sibling::div//i[contains(@class,'oxd-icon bi-calendar oxd-date-input-icon')]")
    WebElement toDateIcon;



}
