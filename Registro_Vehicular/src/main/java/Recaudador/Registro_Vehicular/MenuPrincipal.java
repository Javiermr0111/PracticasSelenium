package Recaudador.Registro_Vehicular;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPrincipal {
	public MenuPrincipal(WebDriver driver) {
		super();
		this.driver = driver;
	}
	WebDriver driver;
	
	By menu = By.cssSelector("a[class='xga']");
	By submenu = By.cssSelector("a[href*='RegistroVehicular']");

	public List<WebElement> getMenu () {
		return driver.findElements(menu);
	}
	public int getMenuCount () {
		return driver.findElements(menu).size();
	}
	public WebElement getSubmenu () {
		return driver.findElement(submenu);
	}
}
