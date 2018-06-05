package Recaudador.Registro_Vehicular;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void demo_test() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.11.0\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.get("...");
	  
	  driver.findElement(By.cssSelector("input[name='txtUsuario']")).sendKeys("RECAUDADOR");
	  driver.findElement(By.cssSelector("input[name='txtPass']")).sendKeys("THEBIGONE");
	  driver.findElement(By.id("cb1")).click();
	  
	  driver.findElement(By.id("submenu1j_id_7")).click();
	  WebDriverWait d=new WebDriverWait(driver,20);
	  d.until(ExpectedConditions.textToBePresentInElement(By.id("cl2"), "Administración de registro vehicular"));
	  driver.findElement(By.id("cl2")).click();
	  
	  driver.findElement(By.cssSelector("input[name*='NumeroProceso']")).sendKeys("2018-8");
	  driver.findElement(By.cssSelector("button[id*='Buscar']")).click();
	  
  }
}
