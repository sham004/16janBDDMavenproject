package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nopcommercepage.obejct.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Baseclass {

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() throws Exception {
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		System.setProperty("webdriver.chrome.driver","D:\\QE13 softwares\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		ad=new Admin(driver);



	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		   Thread.sleep(2000);

	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
		ad.setUsername(email);
		ad.setpassword(password);
	  Thread.sleep(2000);

	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
		ad.clicklogin();
  	  Thread.sleep(2000);


	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) throws Exception {
		 Assert.assertEquals(title,driver.getTitle());
		  Thread.sleep(2000);

	}

	@Then("close browser")
	public void close_browsersss() {
		driver.close();

	}

}
