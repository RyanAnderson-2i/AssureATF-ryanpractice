package UI.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

    @FindBy(id = "#user-name")
    WebElement username;

    @FindBy(id = "#user-password")
    WebElement password;

    @FindBy(css = "input[data-test=\"password\"]")
    WebElement password2;

    public void fillInput(String name, String pass){
            username.sendKeys(name);
            password.sendKeys(pass);
    }

}
