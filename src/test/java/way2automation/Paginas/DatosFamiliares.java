package way2automation.Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import way2automation.Steps.Botones;

public class DatosFamiliares {


    private WebDriver driver;
    private Botones botones;

    public DatosFamiliares(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        ;
    }

    @FindBy(how = How.ID, using = "FAMILY_RELATIONSHIP")
    private WebElement Parentesco;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-14']//span[@class='zb-radio__mark']")
    private WebElement NoVinculo;

    @FindBy(how = How.ID, using = "FAMILY_NAMES")
    private WebElement NombrreFamiliar;

    @FindBy(how = How.ID, using = "FAMILY_LAST_NAME_ONE")
    private WebElement PrimApellidoFamiliar;

    @FindBy(how = How.ID, using = "FAMILY_LAST_NAME_TWO")
    private WebElement SegApellidoFamiliar;




    public void Registrofamiliares(){

        WebDriverWait wait = new WebDriverWait(driver,15);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Parentesco);
        wait.until(ExpectedConditions.elementToBeClickable(Parentesco));
        new Select(Parentesco).selectByVisibleText("Mamá");
        NoVinculo.click();
        NombrreFamiliar.clear();
        NombrreFamiliar.sendKeys("lorena");
        PrimApellidoFamiliar.clear();
        PrimApellidoFamiliar.sendKeys("lopez");
        SegApellidoFamiliar.clear();
        SegApellidoFamiliar.sendKeys("Diaz");





    }


}
