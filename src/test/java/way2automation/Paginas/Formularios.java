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

import java.awt.*;
import java.awt.event.KeyEvent;

public class Formularios {

    private WebDriver driver;
    private Botones botones;

    public Formularios(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
       ;
    }


    @FindBy(how = How.ID, using = "inscriptionType")
    private WebElement TipoInscripcion;

    @FindBy(how = How.ID, using = "leveleducation")
    private WebElement leveleducation;

    @FindBy(how = How.ID, using = "program")
    private WebElement programa;

    @FindBy(how = How.ID, using = "period")
    private WebElement periodo;

    @FindBy(how = How.ID, using = "campus")
    private WebElement sede;

    @FindBy(how = How.ID, using = "journal")
    private WebElement jornada;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Siguiente')]")
    private WebElement Siguiente;



public void Programa_de_interes () throws InterruptedException, AWTException {

    new Select(TipoInscripcion).selectByVisibleText("Registro");
    new Select(leveleducation).selectByVisibleText("Prueba equipo QA");
    new Select(programa).selectByVisibleText("Programa Equipo QA");
    new Select(periodo).selectByVisibleText("2022 - 1 - De 2022 01 06 a 2022 02 02");
    new Select(sede).selectByVisibleText("Sede QA con pisos");
    new Select(jornada).selectByVisibleText("Jornada equipo QA");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Siguiente);
    Thread.sleep(20000);
    Siguiente.click();
}
//------------------------------------------------------------------------------------------------------------------------

    @FindBy(how = How.ID, using = "ID_TYPE") // tipo de documento
    private WebElement TipoDocumento;

    @FindBy(how = How.ID, using = "ID_NUMBER") //numero de doumento
    private WebElement ID_NUMBER_Infopersonal;

    @FindBy(how = How.ID, using = "ID_EXPEDITION_DATE") // fecha de expedición de documento
    private WebElement Expedición;

    @FindBy(how = How.ID, using = "ID_EXPEDITION_COUNTRY")// pais de expedicón
    private WebElement Pais;

    @FindBy(how = How.ID, using = "ID_EXPEDITION_DEPARTMENT")// depertamento de expedición
    private WebElement DepartamentExpe;

    @FindBy(how = How.ID, using = "ID_EXPEDITION_MUNICIPALITY")// Municipio de expedición
    private WebElement MunicipioExpe;

    @FindBy(how = How.ID, using = "FIRST_NAME")//
    private WebElement PrimerNombre;

    @FindBy(how = How.ID, using = "SECOND_NAME")//
    private WebElement SegundoNombre;

    @FindBy(how = How.ID, using = "LAST_NAME_ONE")//
    private WebElement PrimerApellido;

    @FindBy(how = How.ID, using = "LAST_NAME_TWO")//
    private WebElement SegundoApellido;

    @FindBy(how = How.ID, using = "BIRTHDATE")//
    private WebElement FechaNacimiento;

    @FindBy(how = How.ID, using = "ID_BIRTH_COUNTRY")//
    private WebElement PaisNacimiento;

    @FindBy(how = How.ID, using = "ID_BIRTH_DEPARTMENT")//
    private WebElement DepNacimiento;

    @FindBy(how = How.ID, using = "BIRTH_MUNICIPALITY")//
    private WebElement CiudadNacimiento;

    @FindBy(how = How.ID, using = "GENDER")//
    private WebElement Genero;

    @FindBy(how = How.ID, using = "CIVIL_STATUS")//
    private WebElement EstadoCivil;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-2']//span[@class='zb-radio__mark']")//
    private WebElement NoLibreta;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-4']//span[@class='zb-radio__mark']")//
    private WebElement NoSisben;

    @FindBy(how = How.ID, using = "ETHNIC_GROUP")//
    private WebElement GrupoEtnico;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-6']//span[@class='zb-radio__mark']")//
    private WebElement NoDiscapacidad;

    @FindBy(how = How.ID, using = "BLOOD_TYPE")//
    private WebElement GrupoSangre;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-7']//span[@class='zb-radio__mark']")//
    private WebElement TipoSangre;


    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-10']//span[@class='zb-radio__mark']")//
    private WebElement NoTratamiento;

    @FindBy(how = How.XPATH, using = "//label[@for='zb-radio-12']//span[@class='zb-radio__mark']")//
    private WebElement NoAlergia;

    @FindBy(how = How.ID, using = "EPS")//
    private WebElement EPS;

    @FindBy(how = How.XPATH, using = "//div[@id='cdk-overlay-0']/div/zb-option[2]/div")//Selecciona la segunda opción de busqueda
    private WebElement Sanitas;

    @FindBy(how = How.ID, using = "EMAIL")//
    private WebElement EMAIL;

    @FindBy(how = How.ID, using = "CELLPHONE")//
    private WebElement Celular;

    @FindBy(how = How.ID, using = "TELEPHONE")//
    private WebElement Telefono;

    @FindBy(how = How.ID, using = "CORRESPONDENCE_DEPARTMENT")//
    private WebElement DepartCorrespondencia;

    @FindBy(how = How.ID, using = "CORRESPONDENCE_MUNICIPALITY")//
    private WebElement MunicpCorrespondencia;

    @FindBy(how = How.ID, using = "CORRESPONDENCE_NEIGHBORHOOD")//
    private WebElement BarrioCorrespo;


    @FindBy(how = How.ID, using = "CORRESPONDENCE_ADDRESS")//
    private WebElement DirecciónCorespo;

    @FindBy(how = How.ID, using = "CORRESPONDENCE_STRATUM")//
    private WebElement Estrato;

    @FindBy(how = How.XPATH, using = "//zb-dialog-ok-button[normalize-space()='Aceptar']")//
    private WebElement AceptarLlenado;


    public void Datos_personales() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", TipoDocumento);
        wait.until(ExpectedConditions.elementToBeClickable(TipoDocumento));
        new Select(TipoDocumento).selectByVisibleText("Cédula de Ciudadanía");
        ID_NUMBER_Infopersonal.clear();
        ID_NUMBER_Infopersonal.sendKeys("1.082.969.425");
        Expedición.clear();
        Expedición.sendKeys("11/07/2011");
        new Select(Pais).selectByVisibleText("Colombia");
        new Select(DepartamentExpe).selectByVisibleText("Magdalena");
        new Select(driver.findElement(By.id("ID_EXPEDITION_MUNICIPALITY"))).selectByVisibleText("Santa Marta");
        PrimerNombre.clear();
        PrimerNombre.sendKeys("carlos");
        SegundoNombre.clear();
        SegundoNombre.sendKeys("alberto");
        PrimerApellido.clear();
        PrimerApellido.sendKeys("De la cruz");
        SegundoApellido.clear();
        SegundoApellido.sendKeys("polo");
        FechaNacimiento.clear();
        FechaNacimiento.sendKeys("11/06/2021");
        new Select(PaisNacimiento).selectByVisibleText("Colombia");
        new Select(DepNacimiento).selectByVisibleText("Magdalena");
        new Select(CiudadNacimiento).selectByVisibleText("Santa Marta");
        new Select(Genero).selectByVisibleText("Masculino");
        new Select(EstadoCivil).selectByVisibleText("Soltero");
        NoLibreta.click();
        NoSisben.click();
        new Select(GrupoEtnico).selectByVisibleText("No pertenece");
        new Select(GrupoSangre).selectByVisibleText("O");
        NoDiscapacidad.click();
        TipoSangre.click();
        NoTratamiento.click();
        NoAlergia.click();
        EPS.clear();
        EPS.sendKeys("Sanitas");
        Sanitas.click();
        EMAIL.clear();
        EMAIL.sendKeys("sanitas123@gmail.com");
        Celular.clear();
        Celular.sendKeys("(301) 268-8709");
        Telefono.clear();
        Telefono.sendKeys("433-3322");
        new Select(DepartCorrespondencia).selectByVisibleText("Magdalena");
        new Select(MunicpCorrespondencia).selectByVisibleText("Santa Marta");
        BarrioCorrespo.clear();
        BarrioCorrespo.sendKeys("carcel");
        DirecciónCorespo.clear();
        DirecciónCorespo.sendKeys("cr 12 23 45");
        new Select(Estrato).selectByVisibleText("1");
        Siguiente.click();
        Thread.sleep(2000);
        AceptarLlenado.click();



    }



}
