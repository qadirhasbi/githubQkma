package PageObjectModel;

import BaseUtilities.CommonMethods;
import BaseUtilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObjects extends DriverSetup {

    public WebDriver driver;
    public String usernameData;
    public String passwordData;
    CommonMethods cp = new CommonMethods();

    public LoginPageObjects(WebDriver driver){
    this.driver = driver;
        PageFactory.initElements(driver,this);
}

    @FindBy (xpath = "//input[@name='username']")
    WebElement UserNameInputBox;
    @FindBy (xpath = "//input[@name='password' and @placeholder = 'Password']")
    WebElement PasswordInputBox;
    @FindBy (xpath = "//button[text() = ' Login ' or @type ='submit' ]")
    WebElement SignInBtn;


    @FindBy(xpath = "(//p[contains(@class,'text')])[1]")
    WebElement usernameCredential;
    @FindBy(xpath = "//div[contains(@class,'orangehrm-login-error')]//p[contains(., 'admin123')]")
    WebElement passCredential;

    public String getUsername () throws InterruptedException {

        cp.waitUntilElementVisible(usernameCredential);
        String usrCredText = usernameCredential.getText();
        System.out.println("Extracted text: " + usrCredText);
        String[] splitUsrText = usrCredText.split(":");
        usernameData = splitUsrText[1].trim().toString();
        return usernameData;
    }
    public String getPassword(){
        cp.waitUntilElementVisible(passCredential);
        String passCredText = passCredential.getText();
        String[] splitPassText = passCredText.split(":");
        passwordData = splitPassText[1].trim().toString();
        return passwordData;
    }

    public void loginOHrm() throws InterruptedException {
        cp.waitUntilelementToBeClickable(UserNameInputBox);
        String username = getUsername();
        UserNameInputBox.sendKeys(username);
        String password = getPassword();
        PasswordInputBox.sendKeys(password);
        SignInBtn.click();


    }

}
