package steps;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Script1 {
	private By d1;

	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\Karthik\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		WebDriver d1;
		//WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		d1.manage().window().maximize();
		Thread.sleep(3000);
		 System.out.println("Given done");
	}


@When("Enter {string}, {string} and click on the login button")
public void enter_and_click_on_the_login_button(String username, String password) throws AWTException, IOException {
   
		WebDriver d1 = new ChromeDriver();
		d1.findElement( By.id("email")).sendKeys("username");
		d1.findElement( By.id("passwd")).sendKeys("@password");
		d1.findElement( By.id("SubmitLogin")).click();
		
		
		System.out.println("When done");
		
		
		/*Robot robo=new Robot();
		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc_size);
		BufferedImage Source=robo.createScreenCapture(rect);//to save the time instead of taking snaps pixl by pixl we use buffered image
		File destination=new File("C:\\Users\\Karthik\\Downloads\\screenshot\\screen3.jpg");
		ImageIO.write(Source, "png", destination);*/
		
		d1.close();
	}

	@Then("success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then done");

	}
	
	@Then("close the appliaction")
	public void close_the_appliaction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
