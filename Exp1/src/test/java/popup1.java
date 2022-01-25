import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup1 {
	
	
		
		@Test//(enabled=false)
		public void popup() {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		
		ChromeDriver d1;
		WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		//d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		d1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		String msg1= d1.switchTo().alert().getText();
		System.out.println(msg1);
		d1.switchTo().alert().accept();
		d1.findElement(By.linkText("Alert with OK & Cancel")).click();
		d1.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		d1.switchTo().alert().dismiss();
		d1.findElement(By.linkText("Alert with Textbox")).click();
		d1.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		d1.switchTo().alert().sendKeys("HCL");
		String msg2= d1.switchTo().alert().getText();
		System.out.println(msg2);
		d1.switchTo().alert().accept();
		
		
		
	}

}
