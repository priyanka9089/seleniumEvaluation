package evaluationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		
		//oslo and Norway
		WebElement source =driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box101"));
		
		action.dragAndDrop(source, target).perform();
		
		//stockholm and Sweden
		WebElement source1 =driver.findElement(By.id("box2"));
		WebElement target1 = driver.findElement(By.id("box102"));
		
		action.dragAndDrop(source1, target1).perform();
		
		//Washington and united state
		WebElement source2 =driver.findElement(By.id("box3"));
		WebElement target2 = driver.findElement(By.id("box103"));
		
		action.dragAndDrop(source2, target2).perform();
		
		//copenhagen  and denmark
		WebElement source3 =driver.findElement(By.id("box4"));
		WebElement target3 = driver.findElement(By.id("box104"));
		
		action.dragAndDrop(source3, target3).perform();
		
		//seoul and south korea
		WebElement source4 =driver.findElement(By.id("box5"));
		WebElement target4 = driver.findElement(By.id("box105"));
		
		action.dragAndDrop(source4, target4).perform();
		
		//Rome and itly
		WebElement source5 =driver.findElement(By.id("box6"));
		WebElement target5 = driver.findElement(By.id("box106"));
		
		action.dragAndDrop(source5, target5).perform();
		
		
		//Madrid and spain
		WebElement source6 =driver.findElement(By.id("box7"));
		WebElement target6 = driver.findElement(By.id("box107"));
		
		action.dragAndDrop(source6, target6).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
