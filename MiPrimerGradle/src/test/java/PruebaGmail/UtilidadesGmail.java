package PruebaGmail;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;

public class UtilidadesGmail {

	//variables globales
	
//		static WebDriver David;
//		static File source; //para guardar foto de evidencia
//		static ATUTestRecorder grabador; //para grabar evidencia
//		static DateFormat dateFormat; //para dar formato al nombre del archivo del video
//		static Date date; //para nombre del archivo de video
//		
		
	public static WebDriver David;
	WebDriver driver;
	ATUTestRecorder recorder;
	static DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	static Date date = new Date();
		
		//mapeo de elementos de la página 

		static String ruta = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		static String navegador = "webdriver.chrome.driver";
		static String paginainicial = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		static By nombreusuario = By.xpath("//input[@id='identifierId']");
		static By clicksigientenombre = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span");
		static By contraseñauser = By.xpath("//input[@name='password']");
		static By clicksiguientecontraseña = By.xpath("//span[contains(text(),'Siguiente')]");
		static String rutapatallazo = "C:\\Selenium\\practicas\\capturas\\";
		
		
		
		
		public static void abrirnavegador() {
			System.setProperty(navegador,ruta);
			 David= new ChromeDriver();
			
		}
		
		public static void abrirpagina() {
			
			
			David.get(paginainicial);
			
		}
		
		public static void nombrelogin() {
			
			David.findElement(nombreusuario).sendKeys("dacorrar");
			
		}
		
		public static void clickvalidaruser() {
			
			David.findElement(clicksigientenombre).click();
			David.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS); 

		}
		
		public static void contraseña() {
			
			David.findElement(contraseñauser).sendKeys("Lyam2019");
			David.manage (). timeouts (). implicitlyWait (15, TimeUnit.SECONDS);
		}
		
		public static void clickvalidarcontraseña() {
			
			David.findElement(clicksiguientecontraseña).click();
			David.manage (). timeouts (). implicitlyWait (15, TimeUnit.SECONDS);
		}
		
		public static void cerrarnavegador() {
			
			//cerrar todo
			David.quit();
		}
		
		public static void tomarfoto() throws IOException {
			File scrFile = ((TakesScreenshot)David).getScreenshotAs(OutputType.FILE);
			//generar cactura
			FileUtils.copyFile(scrFile, new File(rutapatallazo +dateFormat.format(date)+".png"));
			
			
			
		}
		
		
		
		
}
