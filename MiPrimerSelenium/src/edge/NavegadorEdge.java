package edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavegadorEdge {
	
	public void testEdge() {
		
		// crear el comando para controlar el navegar 
				System.setProperty("webdriver.edge.driver","C:\\Selenium\\edge\\MicrosoftWebDriver.exe");
				//crear el robot
				WebDriver David= new EdgeDriver();
				
				//ir a una URL
				David.get("https://www.google.com");
			
				
				/*
				//buscar caracter
				David.findElement(By.xpath("//input[@name='q']")).sendKeys("gmail");
				//dar click
				David.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
				
				try {
				    Thread.sleep(10000);
				} catch (InterruptedException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
				
				//David.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
				//cerrar
				David.quit();
				*/
	}

}
