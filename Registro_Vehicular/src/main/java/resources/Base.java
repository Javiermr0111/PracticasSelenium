package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
 public static WebDriver driver;
 
 public static WebDriver initializerDriver() throws IOException {
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("..\\PracticaNS_001\\src\\main\\java\\resources\\Data.properties");
	 
	 prop.load(fis);
	 
	 String browserName = prop.getProperty("browser");
	 String driverUrl = prop.getProperty("driver");
	 if (browserName.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", driverUrl);		
		 	driver=new ChromeDriver();
	 }else if (browserName.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver", driverUrl);		
			driver=new FirefoxDriver();
	 }else if (browserName.equals("ie")) {
		 System.setProperty("webdriver.ie.driver", driverUrl);		
			driver=new InternetExplorerDriver();
	 }
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 return driver;
 }
 
}
