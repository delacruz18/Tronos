package way2automation.Definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import way2automation.Paginas.DatosFamiliares;
import way2automation.Paginas.Formularios;
import way2automation.Steps.Conexion;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Formularios formularios = new Formularios(driver);
	private DatosFamiliares datosFamiliares = new DatosFamiliares(driver);



	@Given("^abrir el navegador$")
	public void abrir_navegador()  {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}


	@When("^inscripciones$")
	public void inscripciones() throws Throwable {
		this.formularios = new Formularios(driver);
		this.formularios.Programa_de_interes();
		this.formularios.Datos_personales();
		this.datosFamiliares = new DatosFamiliares(driver);
		this.datosFamiliares.Registrofamiliares();

	}


}




