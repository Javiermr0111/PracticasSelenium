package Recaudador.Registro_Vehicular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroVehicular {
	public RegistroVehicular(WebDriver driver) {
		super();
		this.driver = driver;
	}
	WebDriver driver;
	
	By numeroProceso = By.cssSelector("input[name*='NumeroProceso']");
	By buscar = By.cssSelector("button[id*='Buscar']");
	By modelo = By.cssSelector("input[class*='itModelo']");
	
	public WebElement getNumeroProceso () {
		return driver.findElement(numeroProceso);
	}
	public WebElement getBuscar () {
		return driver.findElement(buscar);
	}
	public WebElement getModelo() {
		return driver.findElement(modelo);
	}
}
