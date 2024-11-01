package part4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.id("drop1"));
		
		Select select = new Select(element);
		
		List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		
		System.out.println("----------");
		
		for (@SuppressWarnings("unused") WebElement option : options) {
		System.out.println(((WebElement) options).getText());
		}
	}

}
