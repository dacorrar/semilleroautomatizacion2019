package MiPrimerGradle;

import static org.junit.Assert.*;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import java.util.concurrent.TimeUnit;



public class ProbarGoogle {
	
private WebDriver David;
WebDriver driver;
ATUTestRecorder recorder;
DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
Date date = new Date();
	

	@Before	
	public void setUp() throws Exception {
		// ubicacion y formato en donde queda el video
		recorder = new ATUTestRecorder("C:\\Selenium\\practicas\\videos","TestVideo-"+dateFormat.format(date),false);
		//valida que el contenido no sea null
		assertNotNull("la variable 'recorder', no puede ser null", recorder);
		//valida si es nulo si no lo es llama el error
		// assertNull("No esta nulo el objeto", recorder);
		  //To start video recording.
		  recorder.start();  
		  //iniciar el web driver
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 David= new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		
		/*try {
		    Thread.sleep(10000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		*/
		// si el robot no encunetra el objeto espere
		David.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS);
		
		File scrFile = ((TakesScreenshot)David).getScreenshotAs(OutputType.FILE);
		//generar cactura
		FileUtils.copyFile(scrFile, new File("C:\\Selenium\\practicas\\capturas\\"+dateFormat.format(date)+".png"));
        //esperar
		Thread.sleep(4000);
		//cerrar todo
		David.quit();
		// finalizar grabacion
		recorder.stop();
	}

	@Test
	public void test() throws InterruptedException {
		
		//ir a una URL
				David.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				
				
				//buscar caracter
				David.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dacorrar");Thread.sleep(1000);
				//dar click
				David.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
				
				//esperar un tiempo 
				
				
				David.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS); 
				// parar un momento
				Thread.sleep(1000);
				
				David.findElement(By.xpath("//input[@name='password']")).sendKeys("Lyam2019");
				
				David.findElement(By.xpath("//span[contains(text(),'Siguiente')]")).click();
				David.manage (). timeouts (). implicitlyWait (15, TimeUnit.SECONDS);
				
				
				
	
		
	}
	

}

