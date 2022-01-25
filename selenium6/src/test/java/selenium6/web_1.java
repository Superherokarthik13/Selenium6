

package selenium6;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class web_1 {
	
	@Test(enabled=false)
	public void popup1() {
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
	
	

		@Test(enabled=false)
		public void iframes() {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		WebDriver d1;
		WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Frames.html");
		d1.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();
		d1.switchTo().frame("SingleFrame");
		d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Karthik Narayan");
		d1.switchTo().defaultContent();

		//d1.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		//WebElement element1=d1.findElement(By.xpath("//iframe[contains(@src,'Multiple')]"));
		//d1.switchTo().frame(element1);

		 

		//WebElement element2=d1.findElement(By.xpath("//iframe[contains(@src,'Single')]"));
		//d1.switchTo().frame(element2);
		///d1.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Successfully mapped the frame");
		}
		
		@Test(enabled=false)
		public void window1() {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		WebDriver d1;
		WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		String w1=d1.getTitle();
		d1.get("http://leafground.com/pages/Window.html");
		d1.findElement(By.id("home")).click();
		Set <String> windows = d1.getWindowHandles();
		Iterator<String> iter=windows.iterator();
		String window1=iter.next();
		String window2=iter.next();
		d1.switchTo().window(window2);
	
		String w2=d1.getTitle();
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(window1);
		System.out.println(window2); 
	
		}

		
		
		
		@Test(enabled=false)
		public void iwindow() {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		WebDriver d1;
		WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		String w1=d1.getTitle();
		d1.get("http://demo.automationtesting.in/Windows.html");
		d1.findElement(By.linkText("Open New Seperate Windows")).click();
		
		
		d1.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
		
		Set <String> windows = d1.getWindowHandles();
		Iterator<String> iter=windows.iterator();
		String window1=iter.next();
		String window2=iter.next();
		d1.switchTo().window(window2);
	
		String w2=d1.getTitle();
		//System.out.println(w1);
		System.out.println(w2);
		//System.out.println(window1);
		System.out.println(window2); 
		}
		
		
		@Test(enabled=false)
		public void window2() {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			String w1=d1.getTitle();
			d1.get("http://demo.automationtesting.in/Windows.html");
			d1.findElement(By.linkText("Open Seperate Multiple Windows")).click();
			
			d1.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
			
			Set <String> windows = d1.getWindowHandles();
			Iterator<String> iter=windows.iterator();
			String window1=iter.next();
			String window2=iter.next();
			d1.switchTo().window(window2);
		
			String w2=d1.getTitle();
			System.out.println(w1);
			System.out.println(w2);
			System.out.println(window1);
			System.out.println(window2); 
			}
		
		@Test(enabled=false)
		public void window3() {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			String w1=d1.getTitle();
			d1.get("http://demo.automationtesting.in/Windows.html");
			d1.manage().window().maximize();
			
			d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
			
			d1.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
			
			Set <String> windows = d1.getWindowHandles();
			Iterator<String> iter=windows.iterator();
			String window1=iter.next();
			String window2=iter.next();
			d1.switchTo().window(window2);
		
			String w2=d1.getTitle();
			System.out.println(w1);
			System.out.println(w2);
			System.out.println(window1);
			System.out.println(window2); 
			}	
		
		
		
		@Test(enabled=false)
		public void Ordered_li() {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://leafground.com/pages/selectable.html");
			List<WebElement> element= d1.findElements(By.xpath("//ol[@id='selectable']/li"));
			
			
			System.out.println(element.size());
			
			Actions act5=new Actions(d1);
			
			act5.keyDown(Keys.CONTROL).click(element.get(0)).click(element.get(2)).click(element.get(4)).click(element.get(6)).build().perform();
		}
		
		@Test(enabled=false)
		public void unorderd_li() throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://leafground.com/pages/autoComplete.html");
			d1.findElement(By.id("tags")).sendKeys("A");
			Thread.sleep(3000);
	List<WebElement> element1=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			
	
			for(WebElement el:element1) {
				if(el.getText().equalsIgnoreCase("Rest API")) {
					el.click();
					break;
				}
			}
		}
	
		
	
		
		@Test(enabled=false)
		public void tab1(){
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://leafground.com/pages/table.html");
		
			//d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[3]/input")).click();
			d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/input")).click();
			d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input")).click();
			//d1.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[5]/td[3]/input")).click();
			
			
			 WebElement parentTable = d1.findElement(By.xpath("//table[@class='display']/tbody"));

			 List<WebElement> rows = parentTable.findElements(By.xpath("./tr"));
		
			 List<WebElement> columns = parentTable.findElements(By.xpath("./th"));
			 
			int count = rows.size();
				System.out.println("ROW COUNT : "+count);
				
			
				int icount = columns.size();
				System.out.println("ROW COUNT : "+count);
			
		}
		
		@Test(enabled=false)
		public void drag_drop() {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://leafground.com/pages/drop.html");
			d1.manage().window().maximize();
		
			WebElement from_Element = d1.findElement(By.id("draggable"));
			WebElement to_Element = d1.findElement(By.id("droppable"));
			Actions builder = new Actions(d1);
			
			Action dragAndDrop = builder.clickAndHold(from_Element)
					.moveToElement(to_Element)
					.release(to_Element)
					.build();
		
			dragAndDrop.perform();
		}
		
		
		@Test(enabled=false)
		public void uli() throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://demo.automationtesting.in/AutoComplete.html");
			d1.findElement(By.id("searchbox")).sendKeys("A");
			Thread.sleep(3000);
			
	List<WebElement> element_ul=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
			
			
		
		
			for(WebElement el:element_ul) {
				if(el.getText().equalsIgnoreCase("Afghanistan")) {
					el.click();
					break;
				}
			}
		}
		
		
		
		
		@Test//(enabled=false) //yet to complete
		public void li1() {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://demo.automationtesting.in/Selectable.html");
			d1.manage().window().maximize();
		
			d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
			List<WebElement> element_li= d1.findElements(By.xpath("//*[@id=\"Serialize\"]/ul"));
			
			

			Actions act51=new Actions(d1);
			
			act51.keyDown(Keys.CONTROL).click(element_li.get(0)).click(element_li.get(2)).click(element_li.get(4)).click(element_li.get(6)).build().perform();
			System.out.println(element_li.size());
		}
		
		
		@Test(enabled=false)
		public void tab2(){
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriver d1;
			WebDriverManager.chromedriver().setup();
			d1=new ChromeDriver();
			d1.get("http://www.espncricinfo.com/icc-womens-world-cup-2013/engine/current/match/594903.html");
			d1.manage().window().maximize();
			d1.switchTo().frame("live_iframe");

		d1.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//*[@id='st_1']")).click();
		}
		
		
			@Test(enabled=false)
			public void SelectExample() throws InterruptedException 
			 {
			System.setProperty("webdriver.chrome.driver", ("C:\\Users\\a_karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
			WebDriverManager.chromedriver().setup();
			WebDriver d1 = new ChromeDriver();
			d1.get("https://www.browserstack.com/");
			d1.manage().window().maximize();
			WebElement developers_dropdown = d1.f indElement(By.id("developers-menu-dropdown"));
			Select objSelect = new Select(developers_dropdown);
			objSelect.selectByIndex(2);
		
			Thread.sleep(3000);
			d1.navigate();
			WebElement solutions_dropdown = d1.findElement(By.id("solutions-menu-dropdown"));
			Select solutions = new Select(solutions_dropdown);
			solutions.selectByValue("4000");
			Thread.sleep(3000);
			WebElement solutions_d = d1.findElement(By.id("solutions-menu-dropdown"));
			Select s1 = new Select(solutions_d);
			s1.selectByVisibleText("Geolocation Testing"); 
			}

			@Test(enabled=false)
			public void drop_down() {
		System.setProperty("webdriver.chrome.driver", ("/home/karthik/Downloads/chromedriver_linux64/chromedriver.deb"));
				
				ChromeDriver d1;
				WebDriverManager.chromedriver().setup();
				d1=new ChromeDriver();
				d1.get("http://leafground.com/pages/Dropdown.html"); 
				Select drop1=new Select(d1.findElement(By.id("dropdown1")));
				drop1.selectByVisibleText("UFT/QTP");
				Select drop2=new Select(d1.findElement(By.name("dropdown2")));
				drop2.selectByValue("4");
				Select drop3=new Select(d1.findElement(By.name("dropdown3")));
				drop3.selectByIndex(3);
				Select drop4=new Select(d1.findElement(By.className("dropdown")));
				drop4.selectByValue("2");
				
				//Select drop4=new Select(d1.findElement(By.className("dropdown")));
				//Boolean msg=drop4.isMultiple();
				//System.out.println(msg);
				
				d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select/option[4]")).click();
				
				d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[3]")).click();
				d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[5]")).click();
				
				Select drop6=new Select(d1.findElement(By.className("multiple")));
						
				//drop6.selectByIndex(1);
				//drop6.selectByIndex(2);
				
				//drop6.selectByVisibleText("Selenium");
				//drop6.selectByVisibleText("Appium");
				
				Boolean msg=drop6.isMultiple();
				System.out.println(msg);
						
			}

		
		
		}
		
		
		
		
			





	

