package way2automation.Steps;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conexion {

	private WebDriver driver;

	public Conexion() {

	}

	@Before
	@Step
	public WebDriver abrirNavegador()  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


	driver.manage().window().maximize();
		driver.navigate().to("https://zb-tronos-inscriptions-dot-academico-qa.appspot.com/form/programInterest");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		return this.driver;

	}
	

}
