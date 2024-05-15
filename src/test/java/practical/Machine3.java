package practical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Machine3 {
	WebDriver driver;
	@Test
	public void clss() throws InterruptedException{
		System.getProperty("webDriver.Edgedriver","C:\\Users\\arjun\\Downloads\\edgedriver_win64\\edgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("");
		driver.manage().window().maximize();
}
