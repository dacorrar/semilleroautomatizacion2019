package PruebaWishbd;

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
import static PruebaWishbd.MetodosWish.iniciarUsuario;
import static PruebaWishbd.MetodosWish.iniciarsesion;
import static PruebaWishbd.MetodosWish.abrirnavegador;
import static PruebaWishbd.MetodosWish.ingresaralapagina;
import static PruebaWishbd.MetodosWish.ingresarnombre;
import static PruebaWishbd.MetodosWish.ingrsearcontraseña;
import static PruebaWishbd.MetodosWish.botoniniciarsesion;
import static PruebaWishbd.MetodosWish.botonseguirnavegando;
import static PruebaWishbd.MetodosWish.ingresarbusqueda;
import static PruebaWishbd.MetodosWish.botonbuscar;
import static PruebaWishbd.MetodosWish.botonselecionar;
import static PruebaWishbd.MetodosWish.selecionarlistatalla;
import static PruebaWishbd.MetodosWish.selecionarNumero;
import static PruebaWishbd.MetodosWish.coloraelegir;
import static PruebaWishbd.MetodosWish.elegirColor;
import static PruebaWishbd.MetodosWish.comprar;
import static PruebaWishbd.MetodosWish.carrito;
import static PruebaWishbd.MetodosWish.cerrar;


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
