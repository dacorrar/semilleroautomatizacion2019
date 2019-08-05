package PomGogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google {

	WebDriver David;
	By campobusqueda =By.name("q");
	By botonBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");

	
	public  void  escribirencampobusqueda(String cadenadebuscar) {
		David.findElement(campobusqueda).sendKeys(cadenadebuscar);
		
		
	}
	
	
}
