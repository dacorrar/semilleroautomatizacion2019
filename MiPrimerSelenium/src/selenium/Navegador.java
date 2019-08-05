package selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
public class Navegador {
	
	
	public class Test {
		WebDriver driver;
		static ATUTestRecorder recoder;

		public static void main(String[] args) throws ATUTestRecorderException, IOException {

			DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
			Date date = new Date();
			
			// Objeto creado de ATUTestRecorder
			ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\semillero\\Documents\\video\\",
					"TestVideo-" + dateFormat.format(date), false);
			// To start video recording.
			recorder.start();
			// Crea un comando que controla el navegador
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");

			// crear robot
			WebDriver yesica = new InternetExplorerDriver();
			
			//abre y maximiza ventana
			yesica.manage().window().maximize();
			//tiempo de recorrido 
			yesica.get("https://www.google.com/");
			yesica.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Toma pantallazo
			File captura= ((TakesScreenshot)yesica).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(captura, new File("C:\\Selenium\\Evidencias\\captura1 "+dateFormat.format(date)+".png"));
			

			//campos a  buscar 
			yesica.findElement(By.xpath("//input[@name='q']")).sendKeys("mattelsa");
			yesica.findElement(By.xpath("//input[@name='btnK']")).click();
			yesica.findElement(By.xpath("//h3[contains(text(),'Mattelsa | | Tienda de Ropa')]")).click();
			yesica.findElement(By.xpath("//span[contains(text(),'Hombre')]")).click();
			yesica.findElement(By.xpath("//a[contains(text(),'Camisetas')]")).click();
			yesica.findElement(By.xpath("//dd[@id='filtro-collapse1']//li[1]//a[1]")).click();
			yesica.findElement(By.xpath("//a[contains(text(),'CAMISETA AZUL LAVANDERIA')]")).click();
			yesica.findElement(By.xpath("//select[@id='attribute133']")).click();
			//
			

			yesica.quit();
			recorder.stop();
			
		}

	}

}
