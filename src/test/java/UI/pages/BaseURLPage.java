package UI.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.NoSuchElementException;

@DefaultUrl("page:webdriver.base.url")
public class BaseURLPage extends PageObject {

    @FindBy(css = "h1")
    WebElement h1;

    public String getH1(){
        if(doesH1Exist()){
            return h1.getText();
        }
        return null;
    }

    public boolean doesH1Exist() {
        try{
            if(h1.isDisplayed()){
                return true;
            }
            return false;
        } catch (NoSuchElementException e){
            return false;
        }
    }

}
