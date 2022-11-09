package stepDefination;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ElearningUpskill {
	WebDriver driver;
	@Given("elearningupskill url is launched")
	public void elearningupskill_url_is_launched() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003CO1744\\Downloads\\chromedriver_win32 (2)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		Thread.sleep(5000);
	}

	@Then("Click on the Signup")
	public void click_on_the_Signup() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[contains(text(),' Sign up! ')]")).click();
	}

	@Then("Enter all the mandatory details")
	public void enter_all_the_mandatory_details() {
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("dwtyttdf");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("adjguyahg");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("helyluly@mailo.icu");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("askhokofg");
		driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("ansgaallad");
		driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("ansgaallad");
		
	}
	@Then("Click on the Register button")
	public void click_on_the_Register_button() {
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		   boolean b = driver.findElement(By.xpath("//button[contains(text(),' Next')]")).isDisplayed();
		   assertTrue(b);
		   if(b==true) {
			   System.out.println("Next button is displayed");
		   }
		   else {
			   System.out.println("Next button is not displayed");
		   }
	}

	@Then("Click Next button")
	public void click_Next_button() {
		driver.findElement(By.xpath("//button[contains(text(),' Next')]")).click();
	}

	@Then("click on Edit profile")
	public void click_on_Edit_profile() {
		driver.findElement(By.xpath("//a[contains(@role,'button')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Profile')]")).click();
	    driver.findElement(By.xpath("(//a[contains(@href,'profile')])[1]")).click();
	}

	@And("edit the required details")
	public void edit_the_required_details() {
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("dssatishhys");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("adnagallakys");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("12876");
	}

	@Then("save settings")
	public void save_settings() {
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.close();
	    
	}


	
}
