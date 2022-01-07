package way2automation.Steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Botones {

    private WebDriver driver;






    public Botones(WebDriver driver)  {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    @FindBy(how = How.NAME, using = "name")
    private WebElement name;

    @FindBy(how = How.NAME, using = "phone")
    private WebElement phone;

    @FindBy(how = How.NAME, using = "email")
    private WebElement email;

    @FindBy(how = How.NAME, using = "country")
    private WebElement country;

    @FindBy(how = How.NAME, using = "city")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@name='username']")
    private WebElement username;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@name='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//div[@id='load_box']//input[@value='Submit']")
    private WebElement Submit;

    @Step
    public void Dummy()throws Throwable  {



    }


}
