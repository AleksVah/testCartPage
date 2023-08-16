import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubslyCartPageElements extends BasePage {

    public SubslyCartPageElements(WebDriver driver) {
        super(driver);
    }
        final String LOGIN_FIELD = "//input[@name= 'page']";
        final String MAIL_FIELD = "//input[@name= 'email']";

        final String CONTIN_BUTT = "/html/body/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div[3]/a";

        final String ERR_MESSAGE = "/html/body/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div[2]/p";

    public WebElement getLoginField(){
        return waitClickableElementByXpath(LOGIN_FIELD);
    }
    public WebElement getMailField(){
        return waitClickableElementByXpath(MAIL_FIELD);
    }
    public WebElement getContinButt(){
        return waitClickableElementByXpath(CONTIN_BUTT);
    }

}
