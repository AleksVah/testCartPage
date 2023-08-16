import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubslyCartPageMethods extends SubslyCartPageElements {

    public SubslyCartPageMethods(WebDriver driver) {
        super(driver);
    }

    public SubslyCartPageElements setLoginData(String login, String mail) {
        getLoginField().sendKeys(login);
        getMailField().sendKeys(mail);
        getContinButt().click();
        return this;
    }
    public WebElement getErrMessage(){
        return waitVisibleOfElementByXpath(ERR_MESSAGE);
    }
}
