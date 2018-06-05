package Recaudador.Registro_Vehicular;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import resources.Base;

public class ConsultaProceso extends Base{
	static Login l;
	static MenuPrincipal mp;
	static RegistroVehicular rv;
	static Properties prop = new Properties();
	static FileInputStream fis;
	static Connection con;
	
	/*public static void main(String args[]){  


		}    */
  @BeforeClass
  public static void setup() throws IOException {
	  driver=initializerDriver();
	  l = new Login(driver);
	  mp = new MenuPrincipal(driver);
	  rv = new RegistroVehicular(driver);
	  fis = new FileInputStream("..\\Registro_Vehicular\\src\\main\\java\\resources\\Data.properties");
	  prop = new Properties();	
	  
	  String host = "odb12.tgc.mx";
	  String port = "1521";
	  
		/*try{  
			 
		Class.forName("oracle.jdbc.driver.OracleDriver");  

		con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@odb12.tgc.mx:1521:rec","TEST_RECCUU","test_reccuu");  

		}catch(Exception e){ System.out.println(e);}  */
  }

  @Test
  public void consultaProcesoActivo() throws IOException, SQLException {
	  prop.load(fis);
	  //Statement stmt=con.createStatement(); 
	  String url = prop.getProperty("url");
	  String usuario = prop.getProperty("usuario");
	  String password = prop.getProperty("password");
	  String numeroProceso = prop.getProperty("numeroProceso");
	  
	  driver.get(url);
	  
	  l.getUsuario().sendKeys(usuario);
	  l.getPassword().sendKeys(password);
	  l.getBuscar().click();
	  
	  int menuCount = mp.getMenuCount();
	  
	  for (int c=0;c<menuCount;c++) {
		  String menuBusacdo=mp.getMenu().get(c).getText();

		  if(menuBusacdo.equals("Menú de Registro vehicular")) {
			  mp.getMenu().get(c).click();
			  break;
		  }
	  }	  
	  mp.getSubmenu().click();
	  
	  rv.getNumeroProceso().sendKeys(numeroProceso);
	  rv.getBuscar().click();
	 /* ResultSet rs=stmt.executeQuery("SELECT modelo FROM ve_vehiculos "
	  		+ "WHERE numero_serie = 'VDZ49UL14R51LFNSX'"); 
	  
	  Assert.assertEquals(rv.getModelo().getAttribute("value"), rs);*/	  
  }
}
