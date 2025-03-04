package com.java.practiceautomation.bdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.example.practiceautomation.po.BrokenLinksPage;
import com.example.practiceautomation.po.PageObject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitionsBrokenLinks {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	BrokenLinksPage BrokenLinks;


	
	/*
	@Given("I am in page Broken Links")
	public void i_am_in_page_broken_links() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://practice-automation.com/broken-links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		BrokenLinks = new BrokenLinksPage(driver);
	}
	
	@Then("I verify the logo is displayed")
	public void i_verify_the_logo_is_displayed() {
		assertTrue("Le logo n'est pas affiché", BrokenLinks.getLogo().isDisplayed());
	}

	@Then("I verify the text HTTP response code")
	public void i_verify_the_text_http_response_code() {
		assertEquals("HTTP response code", BrokenLinks.getHTTPResponseCodeText().getText());
	}

	@Then("I verify the text Broken Links\"")
	public void i_verify_the_text_broken_links() {
		assertEquals("Broken Links", BrokenLinks.getbrokenLinksTitle().getText());
	}

	@Then("I verify the text Home")
	public void i_verify_the_text_home() {
		assertEquals("Home", BrokenLinks.getHomeText().getText());
	}

	@Then("I verify the text Name")
	public void i_verify_the_text_name() {
		assertEquals("Name", BrokenLinks.getNameText().getText());
	}

	@Then("I verify the text missing-page.html")
	public void i_verify_the_text_missing_page_html() {
		assertEquals("missing-page.html", BrokenLinks.getMissingPageText().getText());
	}

	@Then("I verify the text Status")
	public void i_verify_the_text_status() {
		assertEquals("Status", BrokenLinks.getStatusText().getText());	
	}
	
	@Then("I verify the value QuatresCentsQuatres")
	public void i_verify_the_value_quatres_cents_quatres() {
		assertEquals("404", BrokenLinks.getQuatreCentQuatrePageText().getText());
	}
	

	@Then("I verify the int {int}")
	public void i_verify_the_int(Integer value) {
	    int actualValue = Integer.parseInt(BrokenLinks.getQuatreCentQuatrePageText().getText());
	    assertEquals(value.intValue(), actualValue);
	}
	*/
	
	
	
	
	@Given("I am in page Broken Links")
	public void i_am_in_page_broken_links() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://practice-automation.com/broken-links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		BrokenLinks = new BrokenLinksPage(driver);
	}
	
	
	@Then("I verify that the {string} displayed")
    public void i_verify_the_text_displayed(String text) {		
		//example
		//driver.findElement(By.xpath("//*[text()='Home']"));
		
        WebElement element = driver.findElement(By.xpath("//*[text()='" + text + "']"));        
        assertEquals(text, element.getText());
        
      
            // Vérification de chaque élément un par un
        switch (text) {
        case "HTTP response code":
            assertEquals(text,BrokenLinks.getHTTPResponseCodeText().getText());
            break;
        case "Broken Links":
            assertEquals(text, BrokenLinks.getBrokenLinksTitle().getText());
            break;
        case "Home":
            assertEquals(text,BrokenLinks.getHomeText().getText());
            break;
        case "Name":
            assertEquals(text,BrokenLinks.getNameText().getText());
            break;
        case "missing-page.html":
            assertEquals(text,BrokenLinks.getMissingPageText().getText());
            break;
        case "Status":
            assertEquals(text,BrokenLinks.getStatusText().getText());
            break;
        default:
            throw new AssertionError("Unexpected text: " + text);
    }

    
    }



	}
	
	

