package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProviderPage extends BasePage{

    public ProviderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



}
