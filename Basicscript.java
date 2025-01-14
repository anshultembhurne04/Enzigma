import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException {
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
		} else {
			System.out.println("User is not in noKoder webpage");
		}
		Thread.sleep(2000);
		//close the browse
		driver.close();
		
	}

}
