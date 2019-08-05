package selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Sleeper;
//import org.openqa.selenium.support.ui.WebDriverWait;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class google {
	WebDriver driver;
	static ATUTestRecorder recoder;

	public static void main(String[] args) throws ATUTestRecorderException, IOException ,InterruptedException {

		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		
		// Objeto creado de ATUTestRecorder
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\practicas\\videos",
				"TestVideo-" + dateFormat.format(date), false);
		// To start video recording.
		recorder.start();
		
		
		// crear el comando para controlar el navegar 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//crear el robot
		WebDriver David= new ChromeDriver();
		
		//ir a una URL
		David.get("https://www.google.com");
		//buscar caracter
		David.findElement(By.xpath("//input[@name='q']")).sendKeys("gmail");
		//dar click
		David.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		
		
		
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		//Toma pantallazo
		File captura= ((TakesScreenshot)David).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(captura, new File("C:\\Selenium\\practicas\\capturas "+dateFormat.format(date)+".png"));
		
		/*TakesScreenshot cp=(TakesScreenshot)David;
		File source=cp.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Selenium\\practicas\\capturas\\captura.png"));
		*/
		//David.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
		
		//cerrar
		David.quit();
		recorder.stop();
		
		
		
	}

}
