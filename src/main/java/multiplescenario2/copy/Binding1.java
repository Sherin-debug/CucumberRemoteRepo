package multiplescenario2.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Binding1 {
	public static String URL = "https://petstore.octoperf.com/";

	public static WebDriver driver;

	public static Actions act;

	@Given("Launch the Application")
	public void launch_the_application() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		act = new Actions(driver);

		driver.get(URL);
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		

	}
	

	@When("I click Fish")
	public void i_click_fish() {
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();

	}

	@When("I clicked F1-SW-{int}")
	public void i_clicked_f1_sw(Integer int1) {
		driver.findElement(By.xpath("//a[text()='FI-SW-01']")).click();

	}

	@When("I clicked EST-{int}")
	public void i_clicked_est(Integer int1) {
		driver.findElement(By.xpath("//a[text()='EST-1']")).click();

	}

	@When("I clicked Add to Cart")
	public void i_clicked_add_to_cart() {
		driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();

	}

	@When("I clicked Proceed to Checkout")
	public void i_clicked_proceed_to_checkout() {
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		

	}
	

	@When("I clicked Continue")
	public void i_clicked_continue() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@When("I clicked Confirm")
	public void i_clicked_Confirm() {
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();

	}

	@Then("I clicked Return to Main Menu")
	public void i_clicked_Return_to_Main_Menu() {
		driver.findElement(By.xpath("//a[text()='Return to Main Menu']")).click();

	}

}
