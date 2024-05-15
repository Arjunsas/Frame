package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Machin2 {
	WebDriver driver;
	@Test(dataProvider="loginData")

	public void clss2(String username,String password) {
		System.setProperty("webDriver.Edgedriver","C:\\Users\\arjun\\Downloads\\edgedriver_win64 (1)\\edgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		 driver=new EdgeDriver(options);
		 driver.get("https://www.demoblaze.com/index.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"itemc\"]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
			
			
			
			
			
			driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("arjunk1997327@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys("Arjun");
			driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("just for testing");
			driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("arjun");
			driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("india");
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("thalassery");
			
			
			
			 
}
}