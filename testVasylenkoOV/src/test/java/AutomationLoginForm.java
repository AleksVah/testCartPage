import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationLoginForm extends BaseTest {
    final String HomePageURL = "https://subsly.com/checkout/?order=698";
    final String LOGIN = "";
    final String MAIL = "test@gmail.com";

    @Test
    public void setWrongLogin(){
    openUrl(HomePageURL);
    SubslyCartPageMethods subslyCartPageMethods = new SubslyCartPageMethods(driver);
    subslyCartPageMethods.setLoginData(LOGIN, MAIL);
    //перевірка на виведення помилки
    Assert.assertTrue(subslyCartPageMethods.getErrMessage().isDisplayed());
    }
}