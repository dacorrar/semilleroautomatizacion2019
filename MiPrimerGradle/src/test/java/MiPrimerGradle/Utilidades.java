package MiPrimerGradle;
import static org.junit.Assert.assertNotNull;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Utilidades {

static WebDriver David;
	
	
	public static void IngresarGoogle(WebDriver David) {
		David.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		David.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void EscribirEnLogin(WebDriver David) throws InterruptedException {
		David.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dacorrar");Thread.sleep(1000);
	}
	
	public static void RealizarBusqueda(WebDriver David) throws InterruptedException {
		David.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	        David.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public static void EscribirEnPass(WebDriver David) throws InterruptedException {
		David.findElement(By.xpath("//input[@name='password']")).sendKeys("Lyam2019");
	}
	public static void RealizarSiguiente(WebDriver David) throws InterruptedException {
		David.findElement(By.xpath("//span[contains(text(),'Siguiente')]")).click();
	        David.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	
	public static void TomarFoto(String ruta, WebDriver David) throws IOException {
		//Declaracion del Formato Fecha 
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		assertNotNull(" La variable 'date', no puede ser nula", date);
		//TomarFotografia
		File scrFile4 = ((TakesScreenshot)David).getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(scrFile4, new File(ruta+"screenshot "+dateFormat.format(date)+".png"));
	}
	
	public static ATUTestRecorder IniciarGrabacion() throws ATUTestRecorderException {
		
		//Declaracion del Formato Fecha
	    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
	    Date date = new Date();
		//Inicio grabacion
	    ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\practicas\\videos","TestVideo-"+dateFormat.format(date),false);
	    //Inicio grabacion
	    recorder.start();
	    
	    return recorder;	
	}
	
	public static void DetenerGrabacion(ATUTestRecorder recorder) throws ATUTestRecorderException {
		recorder.stop();
	}

	public static void CerrarNavegador(WebDriver David) {
		
		try {
		    Thread.sleep(4000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();}
		David.quit();
	}
}
