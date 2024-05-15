package practical;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Machine { 
	WebDriver driver;
@Test(dataProvider="storeExcel")


public void cls1(String username,String password ) {
	System.setProperty("Webdriver.edge.driver","D:\\edgedriver_win64 (shhh)\\Edgedriver.exe");
	  EdgeOptions options=new EdgeOptions();
	  driver=new EdgeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.demoblaze.com/index.html");
	  driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(username);
	  driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	  
}
public void testlog() {
	  driver.quit();
}
@DataProvider(name="storeExcel")
public Object[][] getData() throws IOException {
    FileInputStream inputStream = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\datadriven.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
    Sheet sheet = workbook.getSheet("Sheet1");

    int rowCount = sheet.getLastRowNum();
    int colCount = sheet.getRow(0).getLastCellNum();
    Object[][] data = new Object[rowCount][colCount];
    for (int i = 0; i < rowCount; i++) {
        Row row = sheet.getRow(i + 1);
        for (int j = 0; j < colCount; j++) {
            Cell cell = row.getCell(j);
            data[i][j] = cell.toString();
        }
    }
    workbook.close();
    inputStream.close();
    return data;
}

@AfterTest
public void teardown() {
if(driver !=null)
{
driver.quit();
 }
   }
}
