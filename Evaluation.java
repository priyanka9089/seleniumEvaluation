package evaluationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Evaluation {

	private static final WebElement dropdown = null;

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("priyanka");
		driver.findElement(By.id("email")).sendKeys("priyankakushwaha9089@gmail.com");
		driver.findElements(By.id("phone")).sendKeys("9899159206");
		driver.findElement(By.id("textarea")).sendKeys("Pratap nager , Delhi, India");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("sunday")).click();
		
		Select drp = new Select(dropdown);
		
		drp.selectByVisibleText("Japan");
		
		driver.findElement(By.id("datepicker")).sendKeys("27/4/2025");
		driver.findElement(By.id("txtDate")).sendKeys("01/05/2025");
		
		driver.findElement(By.id("start-date")).sendKeys("01/05/2025");
		driver.findElement(By.id("end-date")).sendKeys("01/05/2025");
		
		driver.findElement(By.className("submit-btn")).click();
		
		
		
	}

}
