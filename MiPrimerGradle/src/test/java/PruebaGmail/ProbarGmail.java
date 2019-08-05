package PruebaGmail;
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



import atu.testrecorder.ATUTestRecorder;
import java.util.concurrent.TimeUnit;
import static PruebaGmail.UtilidadesGmail.abrirnavegador;
import static PruebaGmail.UtilidadesGmail.abrirpagina;
import static PruebaGmail.UtilidadesGmail.nombrelogin;
import static PruebaGmail.UtilidadesGmail.clickvalidaruser;
import static PruebaGmail.UtilidadesGmail.contraseña;
import static PruebaGmail.UtilidadesGmail.clickvalidarcontraseña;
import static PruebaGmail.UtilidadesGmail.cerrarnavegador;
import static PruebaGmail.UtilidadesGmail.tomarfoto;


public class ProbarGmail {

	

		@Before	
		public void setUp() throws Exception {
			  
			  abrirnavegador();
		}

		@After
		public void tearDown() throws Exception {
	
			cerrarnavegador(); Thread.sleep(1000);
		
		}

		@Test
		public void test() throws InterruptedException, IOException {
			
//			//ir a una URL
			abrirpagina();
//					
//					
//			//buscar caracter
			nombrelogin(); Thread.sleep(1000);
			
//			//dar click
			clickvalidaruser(); Thread.sleep(1000);

//			ingresar contraseña 		
			contraseña();
//					
			clickvalidarcontraseña();
			tomarfoto();
//					David.manage (). timeouts (). implicitlyWait (15, TimeUnit.SECONDS);
//					
//			
		
			
		}
		

}
