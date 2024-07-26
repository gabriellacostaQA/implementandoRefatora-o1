import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class TesteLogin {

    public static final String URL_LOGIN = "https://www.saucedemo.com/";
    public static WebDriver driver;

    public void inicializao() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL_LOGIN);
    }

    public void finalizacao() {
            driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void login(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    public static void adicionarItem(String itemId) {
        driver.findElement(By.id(itemId)).click();
    }

    public static void adicionarItem2(String itemId2) {
    	WebElement element =  driver.findElement (By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Name (Z to A)");
		driver.findElement(By.id(itemId2)).click();
    }
    
    public static void adicionarItem3(String itemIdA, String itemIdB, String itemIdC) {
  		
		WebElement btoA = driver.findElement(By.id(itemIdA));
		btoA.click();
		
		WebElement btoB = driver.findElement(By.id(itemIdB));
		btoB.click();
		
		WebElement btoC = driver.findElement(By.id(itemIdC));
		btoC.click();
		
	}
    public static void produtoCarrinho() {
        driver.findElement(By.id("shopping_cart_container")).findElement(By.tagName("a")).click();
        driver.findElement(By.id("checkout")).click();
    }

    public static void confirmacaoPedido(String firstName, String lastName, String postalCode) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
        driver.findElement(By.id("continue")).click();
    }

    public static void finalizandoCompra() {
        driver.findElement(By.id("finish")).click();
    }

    public static void mensagemConfirmacao() {
        Assert.assertEquals("Thank you for your order!", driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText());
        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText());
    }
}
