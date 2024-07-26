import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaboratorioSwag {

	@Test
	public void LoginSwag (){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement bto = driver.findElement(By.id("login-button"));
		bto.click();
		
		WebElement bto2 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		bto2.click();
		
		WebElement bto3 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		bto3.click();
		
		WebElement bto4 = driver.findElement(By.id("checkout"));
		bto4.click();
		
		driver.findElement(By.id("first-name")).sendKeys("Hermione");
		driver.findElement(By.id("last-name")).sendKeys("Granger");
		driver.findElement(By.id("postal-code")).sendKeys("24120210");
		
		WebElement bto5 = driver.findElement(By.id("continue"));
		bto5.click();
		
		WebElement bto6 = driver.findElement(By.id("finish"));
		bto6.click();
		
		Assert.assertEquals("Thank you for your order!", driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText());
		Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText());
		driver.quit();
	}

	
}
