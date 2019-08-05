package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
public static void main(String[]args) {
		
		// crear el comando para controlar el navegar 
	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    
		//crear el robot
		WebDriver David=new FirefoxDriver();
		
		//ir a una URL
		David.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		//buscar caracter
		David.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dacorrar");
		//dar click
		David.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		//esperar un tiempo 
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		David.findElement(By.xpath("//input[@name='password']")).sendKeys("Lyam2019");
		
		David.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
		
		//esperar un tiempo 
		try {
		    Thread.sleep(10000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		//David.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//cerrar
		David.quit();
		
		
		
	}


}
