import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;

public class LoginPage {

	public static void main(String[] args) {
		String expected_result="noKodr";
		//Open the Browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//navigate to noKodr
		driver.get("https://app-staging.nokodr.com/");
		//verify
		String actual_result=driver.getTitle();
		if (expected_result.equals(actual_result)) {
			System.out.println("User is in noKoder webpage");
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("anshultembhurne04@gmail.com");		
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anshul@1234");
			driver.findElement(By.id("rememberMe")).click();
			
			driver.findElement(By.xpath("//div[text()='Log In']")).click();
		}
		String error="Invalid Email or Password";
		
		WebElement message = driver.findElement(By.xpath("//h2[text()='Invalid Email or Password']"));
		String text= message.getText();
		if (text.contains(error)) {
			System.out.println(error);
		}
		//close the browse
		driver.close();
		
		
	}

}
