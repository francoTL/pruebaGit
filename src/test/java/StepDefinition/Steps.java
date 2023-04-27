package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
*/
public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_chrome() {
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Franco\\eclipse-workspace\\testCucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://ced.iplacex.cl/login/index.php");
		driver.get("http://localhost:8090/Integracion2/");
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		System.out.println("En este paso ingresa las credenciales de usuario para la pagina de login");
		driver.findElement(By.id("usermane")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then("inicia sesion")
	public void inicia_sesion() {
		System.out.println("En este paso inicia sesion con los datos ingresados desde Mytest.feature");
		driver.findElement(By.id("loginbtn")).click();
	}

}
