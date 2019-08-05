package PruebaWish;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import atu.testrecorder.ATUTestRecorder;



public class MetodosWish {
	//variables globales
	
		static WebDriver bot;
		static File source; //para guardar foto de evidencia
		static ATUTestRecorder grabador; //para grabar evidencia
		static DateFormat dateFormat; //para dar formato al nombre del archivo del video
		static Date date; //para nombre del archivo de video
		static ReadExcelFile readFile;
		
		
	
		//mapeo de elementos de la página
		
		static String ruta = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		static String navegador = "webdriver.chrome.driver";
		static String paginainicial = "https://www.wish.com/mx";
		
		static By iniciarsesion = By.xpath("//div[starts-with(@class='AuthenticationModal__')]");
		
		static By ingresarcorreo = By.xpath("//input[@placeholder='Introduce tu email']");
		static By ingresarcontraseña = By.xpath("//div[@class='WishTextInput__Wrapper-sc-1k4jzwj-0 hxQunR']//input[@class='WishTextInput__WishTextInputOld-sc-1k4jzwj-5 ietITx']");
		static By clickbotoniniciarsesion = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]");
        static By seguirnavegango = By.xpath("//body[@class='body']/div[@id='react-app']/div[@class='app']/div[@class='modal-root BaseModal__ModalContainer-sc-188teto-4 bFHXBY']/div/div[@class='BaseModal__PlainBackDrop-sc-188teto-0 BaseModal__BackDrop-sc-188teto-1 jgxFQP']/div[@class='BaseModal__BasicModal-sc-188teto-2 bvFtJB']/div[@class='BaseModal__CloseButton-sc-188teto-3 fxAPnK']/div[@class='SvgUtils__SvgWrapper-sc-1y6nr70-0 eYRdEa']/*[1]");
        static By buscar = By.xpath("//input[@placeholder='¿Qué quieres encontrar?']");
        static By clickbotonbuscar = By.xpath("//div[@class='WishButtons__WishButton-sc-13cvktr-0 jCEAqv']");
        static By selecionarcompra = By.xpath("//img[@alt='zippersweater, Moda, Manga, Long Sleeve']");
        static By selecionartalla = By.xpath("//div[contains(text(),'Seleccionar talla')]");
        static By selecionarnumero = By.xpath("//div[@class='DimensionSection__DimensionText-sc-1sp8lqj-3 iapERx'][contains(text(),'M')]");
	    static By selecionarcolor = By.xpath("//div[contains(text(),'Seleccionar color')]");
		static By elegircolor = By.xpath("//div[contains(text(),'Gris oscuro')]");
		static By clickcomprar = By.xpath("//div[@class='BuyButton__Button-z0grbs-0 BuyButton__Buy-z0grbs-1 iNNvoN']");
		static By botoncarrito = By.xpath("//div[@class='Navbar__Wrapper-v426jc-1 bxJKTz']//div[4]//a[1]");
		
		public static void abrirnavegador() {
			// iniciamos el navegador con ruta y navegador
			System.setProperty(navegador,ruta);
			 bot= new ChromeDriver();
			 readFile = new ReadExcelFile();
			 
			
		}
		public static void ingresaralapagina() {
			// ingresamos a la url
			bot.get(paginainicial);
		}
		
		public static void iniciarUsuario() throws InterruptedException {
			// se inicia secion para poder continuar navegando
			bot.findElement(By.xpath("//*[contains(text(), 'Iniciar sesión')]")).click();
			
			   bot.manage (). timeouts (). implicitlyWait (10, TimeUnit.SECONDS); 
				
			
		}
		
		public static void ingresarnombre() throws IOException {
			
			// se indica la ruta donde se encuentra nuestro archivo de exel
			String filepath = "C:\\Users\\semillero\\Desktop\\datosWish.xlsx";
			// se le indica el nombre de la hoja , la ruta y la pocision
			String searchText = readFile.getCellValue("Sheet1", filepath, 1, 0);
			//System.out.println("searchText");
			// se ingresa en el campo correo el dato de la celda selecionada
			bot.findElement(ingresarcorreo).sendKeys(searchText);
			// se valida que no sea nula 
			assertNotNull("la variable 'ingresarcorreo', no puede ser null", ingresarcorreo);
		}
		
		public static void ingrsearcontraseña() throws InterruptedException, IOException {
			// se inidca la ruta donde esta nuestro archivo de excel
			String filepath = "C:\\Users\\semillero\\Desktop\\datosWish.xlsx";
			// se le indica el nombre de la hoja , la ruta y la pocision
			String searchText = readFile.getCellValue("Sheet1", filepath, 1, 1);
			//System.out.println("searchText");
			
			// se ingresa en el campo contraseña que esta en el dato de la celda selecionada
			bot.findElement(ingresarcontraseña).sendKeys(searchText);
			assertNotNull("la variable 'ingresarcontraseña', no puede ser null", ingresarcontraseña);
			// parar un momento
			Thread.sleep(1000);
	
			
		}
		public static void botoniniciarsesion() {
			
			// click en el boton iniciar sesion
			bot.findElement(clickbotoniniciarsesion).click();
		}
        public static void botonseguirnavegando() {
			// saltamso publicidad 
			bot.findElement(seguirnavegango).click();
		}
		
        public static void ingresarbusqueda() {
			// ingresamos el dato a buscar
			bot.findElement(buscar).sendKeys("chaquetas hombre");
			
		}  

        public static void botonbuscar() {
			// click boton buscar
			bot.findElement(clickbotonbuscar).click();
		}
        public static void botonselecionar() {
			// desplegamos la lista a selecionar
			bot.findElement(selecionarcompra).click();
		}
        
  public static void selecionarlistatalla() {
			// escogemos talla
	   bot.findElement(selecionartalla).click();
		}
  public static void selecionarNumero() {
		// selecionamos la talla
	   bot.findElement(selecionarnumero).click();
		}
  public static void coloraelegir() {
		// desplegamos la lista de colores
	   bot.findElement(selecionarcolor).click();
	   bot.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
  public static void elegirColor() {
		// elegimos color
	   bot.findElement(elegircolor).click();
	   bot.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   
		}
  
  public static void comprar() throws InterruptedException {
		// click comprar para añadir al carrito
	   bot.findElement(clickcomprar).click();
	   Thread.sleep(3000);
		}
  public static void carrito() throws InterruptedException {
		// abrimos el carrito
	   bot.findElement(botoncarrito).click();
	   Thread.sleep(3000);
	   // validamos que la chaqueta sea la misma que elegimos 
	   assertEquals("2019 Men's Fashion Long Sleeve Cardigan"  , bot.findElement(By.xpath("//div[@class='CartItem__CartProductName-vgrrkw-5 fYSGHj']")).getText());
		}
  public static void cerrar() throws InterruptedException {
	  Thread.sleep(4000);
	  // cerramos el navegador
	  bot.quit();
  }
 
}
