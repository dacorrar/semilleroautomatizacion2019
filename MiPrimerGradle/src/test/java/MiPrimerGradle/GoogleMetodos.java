package MiPrimerGradle;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
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
import atu.testrecorder.exceptions.ATUTestRecorderException;

import java.util.concurrent.TimeUnit;

public class GoogleMetodos {

	public static WebDriver David;
	WebDriver driver;
			

		@Before	
		public void setUp() throws Exception {
			//iniciar web driver
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 David= new ChromeDriver();
		}

		@After
		public void tearDown() throws Exception {
			
			//Cierra el navegador
			Utilidades.CerrarNavegador(David);

		}

		@Test
		public void test() throws InterruptedException, ATUTestRecorderException, IOException {
			
			//Inicia la grabación
			ATUTestRecorder recorder = Utilidades.IniciarGrabacion();
			
			//Acceso a la pagina de busqueda
	        Utilidades.IngresarGoogle(David);
	        
	        //Toma Foto
	        Utilidades.TomarFoto("C:\\Selenium\\practicas\\capturas\\", David);
	        
			//Escribe en la barra de busqueda el termino a buscar 
	        Utilidades.EscribirEnLogin(David);
	        //Clic boton de busqueda
	        
	        Utilidades.RealizarBusqueda(David);
	        
	        //Toma foto
	        Utilidades.TomarFoto("C:\\Selenium\\practicas\\capturas\\", David);
	        
	        // escribir pass
	        Utilidades.EscribirEnPass(David);
	        
	      //Toma foto
	        Utilidades.TomarFoto("C:\\Selenium\\practicas\\capturas\\", David);
	        
	        // realizar siguiente
	        Utilidades.RealizarSiguiente(David);
	        
	        

	        //Detiene la grabacion
			Utilidades.DetenerGrabacion(recorder);
		}
					
					
					
		
			
		}
		

