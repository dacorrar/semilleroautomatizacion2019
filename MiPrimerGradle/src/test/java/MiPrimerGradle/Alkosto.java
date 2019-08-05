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



public class Alkosto {
	
private WebDriver LJD;
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
		LJD= new ChromeDriver();
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
		LJD.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS);
		
		File scrFile = ((TakesScreenshot)LJD).getScreenshotAs(OutputType.FILE);
		//generar cactura
		FileUtils.copyFile(scrFile, new File("C:\\Selenium\\practicas\\capturas\\"+dateFormat.format(date)+".png"));
        //esperar
		Thread.sleep(20000);
		//cerrar todo
		LJD.quit();
		// finalizar grabacion
		recorder.stop();
	}

	@Test
	public void test() throws InterruptedException {
		
		//ir a una URL
		LJD.get("https://www.alkosto.com/tv");
				
				
				//buscar caracter
		       LJD.findElement(By.xpath("//input[@id='search']")).sendKeys("TV LG");Thread.sleep(1000);
				//dar click
		       LJD.findElement(By.xpath("//span[contains(text(),'Buscar')]")).click();
		       
		      
		       
		       LJD.findElement(By.id("//*[@id='cartpopup_btn_86311']")).click();
				
				//esperar un tiempo 
				
				
		       LJD.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS); 
				// parar un momento
				Thread.sleep(1000);
				
							
				
				
	
		
	}
	

}

