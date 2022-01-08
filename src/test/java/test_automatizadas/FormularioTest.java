package test_automatizadas;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormularioTest {
	String name="Coca Cola";
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driverChrome/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
	}
	
	//Prueba 1: agregar nuevo producto
	@Test
	public void agregarProductosTrue() throws InterruptedException {
		WebElement name_producto=driver.findElement(By.id("nameProducto"));
		name_producto.sendKeys(name);
		WebElement fecha=driver.findElement(By.id("fechaV"));
		fecha.sendKeys("2021-12-01");
		Select categoria = new Select (driver.findElement(By.id("categoria")));
	    categoria.selectByVisibleText("Nacional");
		WebElement Precio=driver.findElement(By.id("precio"));
		Precio.sendKeys("1990");
		Thread.sleep(1000);
		WebElement boton=driver.findElement(By.id("botonIngresar"));	
		boton.click();
		Thread.sleep(1000);
		int flag=0;
		if(driver.findElement(By.xpath(".//*[@class='info-producto']")).isDisplayed()) {
			List<WebElement> allInputs = driver.findElements(By.xpath(".//*[@class='info-producto']"));
			for(WebElement e: allInputs){
				String etostring = e.getText();
				if( etostring.contains(name) && etostring.contains("Nacional") && etostring.contains("1990")) {
					System.out.println("Producto agregado, Ok");
					Assert.assertTrue(true);
					flag=1;
					break;
				}
			}
		}
		if (flag==0) {
			System.out.println("Producto no agregado, Error");
			Assert.assertTrue(false);
		}
	}


	//Prueba 2: borrar primer producto
	@Test
	public void borrarProductoTrue() throws InterruptedException {
		int flag=0;
		Thread.sleep(1000);
		List<WebElement> allButtons =driver.findElements(By.xpath(".//*[@class='btn btn-danger']"));	//se buscan todos los botones de borrar
		if(allButtons.size()>1){
			String producto = driver.findElement(By.xpath(".//*[@class='info-producto']")).getText(); //se busca el primer producto y se guarda su dato como string para comparar despues si fue eliminado
			for(WebElement e: allButtons){
				if(e.getText().contains("Borrar producto")) {
					e.click(); //Se borra el primer producto
					flag=1;
					break;
				}
			}
			Thread.sleep(2000);
			int flag1=0;
			List<WebElement> allInputs = driver.findElements(By.xpath(".//*[@class='info-producto']"));
			for(WebElement e: allInputs){
				if(e.getText().equals(producto)) {
					flag1=1;
					break;
				}
			}
			Thread.sleep(1000);
			if (flag1==0 && flag==1) {
				System.out.println("Producto borrado, Ok");
				Assert.assertTrue(true);
			}else{
				System.out.println("Producto no borrado, Error");
				Assert.assertTrue(false);
			}
		}else { //no hay productos para borrar
			System.out.println("No hay elementos por borrar, Error");
			Assert.assertTrue(false);
		}
	}

	//Prueba 3: boton borrar todos los productos
	@Test
	public void borrarTodosProductosTrue() throws InterruptedException {
		int flag=0;
		List<WebElement> allButtons =driver.findElements(By.xpath(".//*[@class='btn btn-danger']"));	//se buscan todos los botones de borrar
		for(WebElement e: allButtons){
			if(e.getText().contains("Deseo borrar todos los productos")) { //buscar boton que borra todos los productos
				e.click(); //Se borran todos los productos
				Thread.sleep(2);
				e.click();
				flag=1;
				break;
			}
		}
		Thread.sleep(2000);
		List<WebElement> allInputs = driver.findElements(By.xpath(".//*[@class='info-producto']"));
		int cantidadProductos = allInputs.size();
		Thread.sleep(2000);
		if (flag==1 && cantidadProductos==0) {
			System.out.println("Todos los productos borrados, Ok");
			Assert.assertTrue(true);
		}else{
			System.out.println("Todos los productos no borrados, Error");
			Assert.assertTrue(false);
		}
	}


	@After
	public void setout() {
		driver.quit();
	}
}

