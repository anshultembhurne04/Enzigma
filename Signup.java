import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		
		//Open the Browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//navigate to noKodr
		driver.get("https://app-staging.nokodr.com/");
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signup.click();
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("anshultembhurne04@gmail.com");
		WebElement checkbox = driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']"));
		checkbox.click();
		WebElement proceed = driver.findElement(By.xpath("//div[text()='Proceed']"));
		proceed.click();
		String error="User already exists";

		String verifycationCode="Verification code sent successfully";

		

		WebElement message = driver.findElement(By.xpath("//div[@class=\"slds-notify slds-notify_toast slds-p-around_small slds-theme_error\"]"));

		

		String text=message.getText();

		if (text.contains(error)) {

			System.out.println("User already exists");

			

		} else if (text.contains(verifycationCode)) {

			System.out.println("Verification code successfully");

			WebElement otp = driver.findElement(By.xpath("//input[@name='code']"));

			WebElement verifycode = driver.findElement(By.xpath("//div[text()='Verify Code']"));
			verifycode.click();
			
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
			firstname.sendKeys("Anshul");
			
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
			lastname.sendKeys("Tembhurne");
			
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("Anshul@123");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='password-confirmpassword']"));
			confirmPassword.sendKeys("Anshul@123");
			
			WebElement register = driver.findElement(By.xpath("///div[text()='Register']"));
				register.click();
			
			
			
			
		}
		
		//close the browse
		driver.close();
	}

}
