package batch13;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializations
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		//For connecting driver with webpage
		driver.get("https://trytestingthis.netlify.app/");
		//for opening a window
		driver.manage().window().maximize();
		//First name
		driver.findElement(By.id("fname")).sendKeys("Fuad");
		//Last name
		driver.findElement(By.id("lname")).sendKeys("Farid");
		//clicking radio button
		 WebElement radioButton = driver.findElement(By.id("male"));
		 radioButton.click();
		 //selecting option from dropdown
		 WebElement dropdown1 = driver.findElement(By.id("option"));
		 Select dropdown=new Select(dropdown1);
		 dropdown.selectByIndex(2);
		 //selecting multiple options
		 WebElement multiple1 = driver.findElement(By.id("owc"));
		 Select multiple=new Select(multiple1);
		 multiple.selectByIndex(1);
		 multiple.selectByIndex(3);
		 //Choose applicable options
		 WebElement checkbox1 = driver.findElement(By.name("option3"));
		 checkbox1.click();
		 
		 
		 
		 
		 




	}

}
