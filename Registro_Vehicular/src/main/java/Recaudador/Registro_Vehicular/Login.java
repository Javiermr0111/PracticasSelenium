package Recaudador.Registro_Vehicular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	WebDriver driver;
	
	By usuario = By.cssSelector("input[name='txtUsuario']");
	By password = By.cssSelector("input[name='txtPass']");
	By buscar = By.id("cb1");
	By passwordOlvidada = By.cssSelector("a[id='cl3']");
	
	public WebElement getUsuario () {
		return driver.findElement(usuario);
	}
	public WebElement getPassword () {
		return driver.findElement(password);
	}
	public WebElement getBuscar () {
		return driver.findElement(buscar);
	}
	public WebElement getPasswordOlvidada () {
		return driver.findElement(passwordOlvidada);
	}
}
