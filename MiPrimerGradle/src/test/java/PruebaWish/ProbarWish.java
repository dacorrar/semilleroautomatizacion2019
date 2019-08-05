package PruebaWish;

import static org.junit.Assert.assertNotNull;

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
import java.util.concurrent.TimeUnit;
import static PruebaWish.MetodosWish.iniciarUsuario;
import static PruebaWish.MetodosWish.iniciarsesion;
import static PruebaWish.MetodosWish.abrirnavegador;
import static PruebaWish.MetodosWish.ingresaralapagina;
import static PruebaWish.MetodosWish.ingresarnombre;
import static PruebaWish.MetodosWish.ingrsearcontraseña;
import static PruebaWish.MetodosWish.botoniniciarsesion;
import static PruebaWish.MetodosWish.botonseguirnavegando;
import static PruebaWish.MetodosWish.ingresarbusqueda;
import static PruebaWish.MetodosWish.botonbuscar;
import static PruebaWish.MetodosWish.botonselecionar;
import static PruebaWish.MetodosWish.selecionarlistatalla;
import static PruebaWish.MetodosWish.selecionarNumero;
import static PruebaWish.MetodosWish.coloraelegir;
import static PruebaWish.MetodosWish.elegirColor;
import static PruebaWish.MetodosWish.comprar;
import static PruebaWish.MetodosWish.carrito;
import static PruebaWish.MetodosWish.cerrar;


public class ProbarWish {
	
	
	
	public static WebDriver bot;
	WebDriver driver;
	ATUTestRecorder recorder;
	DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();
	
	
	@Before	
	public void setUp() throws Exception {
	
		
	}

	@After
	public void tearDown() throws Exception {
		
		
	
		
	}

	@Test
	public void test() throws InterruptedException, IOException {
		
		//abrir navegador
		abrirnavegador();
		//ir a una URL		
		ingresaralapagina();
		// login
		iniciarUsuario();
		// nombreo o correo
		ingresarnombre();
		// ingresar password
		ingrsearcontraseña();
		// click boton iniciar sesion
		botoniniciarsesion();
		//click boton seguir navegando
		botonseguirnavegando();
		//ingresar valior a buscar
		ingresarbusqueda();
		//click boton buscar
		botonbuscar();
		//selecionar producto
		botonselecionar();
		//selecionar talla
		selecionarlistatalla();
		// selecionar el numero de la talla
		selecionarNumero();
		//selecionar color
		coloraelegir();
		// elegir color
		elegirColor();
		// comprar
		comprar();
		//ir al corrito 
		carrito();
		//cerrar
		cerrar();
		
		
		
		
		
		
		
		
				
				
			
							
				
				
	
		
	}
	


	
	
	

}
