package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException	{
		// Localizamos el directorio del driver a utilizar
		System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//Driver//geckodriver.exe");
		
		//Abrimos el navegador
		WebDriver driver = new FirefoxDriver();
		
		//Maximizamos la ventana
		driver.manage().window().maximize();
		
		//Nos dirigimos buscador de google
		driver.get("https://www.google.com");
		
		//Obtenemos el título de la página
		System.out.println("Page Title: " + driver.getTitle());	
	
		//Introducimos "Wikipedia" en el buscador
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Wikipedia");
		
		//Simulamos presionar el boton enter
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//Esperamos unos segundos
		Thread.sleep(1000);
		System.out.println("Page Title : " + driver.getTitle());
									
		//Simulamos un clic en el enlace "Wikipedia"
		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a")).click();

		Thread.sleep(1000);
		System.out.println("Page Title : " + driver.getTitle());

		//Simulamos un clic sobre la pestaña "Acceder"
		driver.findElement(By.linkText("Acceder")).click();
		
		Thread.sleep(1000);
		System.out.println("Page Title : " + driver.getTitle());
		
		//Introducimos el usuario en la pagina de inicio de sesion
		driver.findElement(By.id("wpName1")).sendKeys("GarciCrespo");
		
		//Introducimos la contraseña en la pagina de inicio de sesion
		driver.findElement(By.cssSelector("#wpPassword1")).sendKeys("testingwikipedia");
		driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		System.out.println("Page Title : " + driver.getTitle());
		
		//Cerramos la sesión en Wikipedia
		driver.findElement(By.id("pt-logout")).click();
		
		Thread.sleep(2000);
		System.out.println("Page Title : " + driver.getTitle());
		
		//Introducimos un texto en la barra de busqueda
		driver.findElement(By.id("searchInput")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		System.out.println("Page Title : " + driver.getTitle());
		
		//Hacemos clic sobre la opcion "Pruebas de software"
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[4]/ul/li[1]/div[1]/a")).click();
		
		Thread.sleep(3000);
		System.out.println("Page Title : " + driver.getTitle());
		
		//Finalmente cerramos el navegador
		driver.quit();
	}
	
}