package test_automatizadas;

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

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driverChrome/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("localhost:3000");
	}
	
	@Test
	public void agregarProductosTrue() throws InterruptedException {
		WebElement name_producto=driver.findElement(By.xpath(".//*[@placeholder='Ej: Mermerlada, Leche, etc.']"));
		name_producto.sendKeys("Coca Cola");
		WebElement fecha=driver.findElement(By.xpath(".//*[@placeholder='formato: YYYY-MM-DD']"));
		fecha.sendKeys("2021/12/01");
		Select categoria = new Select (driver.findElement(By.xpath(".//*[@class='form-select form-select-lg mb-3']")));
	    categoria.selectByVisibleText("Nacional");
		WebElement boton=driver.findElement(By.id("boton"));
		boton.click();

	}
	@After
	public void setout() {
		driver.quit();
		}
}

