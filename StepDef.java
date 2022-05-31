package stepsMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public static ChromeDriver driver;
	
	@Given("Open Chrome Browser")
	public void openchrome()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@And("Load Leaftaps URL")
	public void LoadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");	
		System.out.println("Main Java");
	}
	
	
	@And ("Enter the username as {string}")	
	public void EnterUsername(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And ("Enter the password as {string}")	
	public void Enterpwd(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on login button")	
	public void ClickOnLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Home page should be launched")
	public void HomePageVerify()
	{
	String title = driver.getTitle();
	
	
		if (title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Home page launched successfully");	
		}
		else 
		{
			System.out.println("Home page is not launched");	
		}
	}
	
	@But("Error message should be displayed")
	public void Errormsg()
	{
	boolean errormsg = driver.findElement(By.id("errorDiv")).isDisplayed();
	
	
		if (errormsg)
		{
			System.out.println("Login details are wrong.Home page is not launched.");	
		}
		else 
		{
			System.out.println("Home page launched");	
		}
	}
	
	//create lead starts
	@When("Click on CRMSFA link")
	public void clickonCRMSFAlink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	
	@Then("My Home page should be launched")
	public void MyHomePageVerification()
	{
	 boolean isTitleDisplayed = driver.findElement(By.id("sectionHeaderTitle_myHome")).isDisplayed();
	 
	 if (isTitleDisplayed)
	 {
		System.out.println("My Home page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching my home page");  
	 }
	}
	
	
	@When("Click on Create Lead link")
	public void clickonCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();	
	}
	
	@Then("Create Lead page should be launched")
	public void CreateLeadPageVerification()
	{
	 boolean isTitleDisplayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
	 
	 if (isTitleDisplayed)
	 {
		System.out.println("Create Lead page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching Create Lead Page");  
	 }
	}
	
	@Given("Enter the companyname as {string}")
	public void enterCompName(String CompanyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		
	}
	
	@And("Enter the Firstname as {string}")
	public void enterFirstName(String FirstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		
	}
	@And("Enter the LastName as {string}")
	public void enterLastName(String LastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		
	}
	
	@And("Enter the phoneno as {string}")
	public void enterphno(String phno)
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		
	}
	
	@When("Click on Create Lead Button")
	public void clickCreateLead()
	{
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	
	@Then("View Lead page should be launched")
	public void ViewLeadPageVerification()
	{
	 boolean isTitleDisplayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
	 
	 if (isTitleDisplayed)
	 {
		System.out.println("View Lead page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching view Lead Page");  
	 }
	}
	// Create Lead Ends
	
	//Edit lead starts
	@When("Click on Leads tab")
	public void clickonLeadsTab()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	
	@Then("My Leads page should be launched")
	public void LeadPageVerification()
	{
	 String Leads  = driver.getTitle();

	 if (Leads.equals("My Leads | opentaps CRM"))
	 {
		System.out.println("My Leads page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching My Leads Page");  
	 }
	
	}
	
	@When("Click on Find Leads")
	public void clickonFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Then("Find leads page should be launched")
	public void FindLeadPageVerification()
	{
	 String findLeads  = driver.getTitle();
	 
	 if (findLeads.equals("Find Leads | opentaps CRM"))
	 {
		System.out.println("Find Leads page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching Find Leads Page");  
	 }
	
	}
	
	@When("Clickon phone tab")
	public void clickonPhoneTab()
	{
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@And("Enter the phone number as{string}")
	public void EnterPhno(String phno)
	{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}
	
	
	@And("Clickon Find Leads")
	public void clickonFindLeadsbutton()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And("Clickon LeadID")
	public void clickonLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("Click on Edit button")
	public void clickEditbutton()
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Then("Edit Lead page should be launched")
	public void EditpageVerify()
	{
		String EditLead  = driver.getTitle();
		 
		 if (EditLead.equals("opentaps CRM"))
		 {
			System.out.println("Edit Lead page verified"); 
		 }
		 else
		 {
			 System.out.println("Not launching Edit Lead Page");  
		 }	
	}
	
	@When("Click on update button")
	public void clickupdatebutton()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	//Edit lead ends
	
	//Delete lead starts
	@When("Click on Delete button")
	public void clickDeletebutton()
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	
	//Delete lead ends
	
	//Duplicate lead starts
	@When("Click on Duplicate button")
	public void clickDuplicatebutton()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@Then("Duplicate Lead page should be launched")
	public void DuplicatepageVerify()
	{
		String DuplicateLead  = driver.getTitle();
		 
		 if (DuplicateLead.equals("Duplicate Lead | opentaps CRM"))
		 {
			System.out.println("Duplicate Lead page verified"); 
		 }
		 else
		 {
			 System.out.println("Not launching Duplicate Lead Page");  
		 }	
	}
	
	//Duplicate lead ends
	
	//Merge Lead starts
	@When("Click on Merge Leads")
	public void clickMergeLeads()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@Then("Merge leads page should be launched")
	public void MergeLeadsPageVerify()
	{
		String MergeLead  = driver.getTitle();
		 
		 if (MergeLead.equals("Merge Leads | opentaps CRM"))
		 {
			System.out.println("Merge Lead page verified"); 
		 }
		 else
		 {
			 System.out.println("Not launching Merge Lead Page");  
		 }			
	}
	
	@When("Clickon From Lead icon")
	public void clickFromLeadIcon()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
	@Then("Find leads page should get launched")
	public void FindmrgLeadPageVerification()
	{
	//	System.out.println("Window Handling started");
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		
	 String findLeads  = driver.getTitle();
	 
	 if (findLeads.equals("Find Leads"))
	 {
		System.out.println("Find Leads page verified"); 
	 }
	 else
	 {
		 System.out.println("Not launching Find Leads Page");  
	 }
	
	}
	
	
	@And("Enter the firstname as {string}")
	public void firstname(String firstname)
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
	}
	
	
	
	@Then("Find leads window should get closed")
	public void windowHandling()
	{
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	}

	
	@Then("From LeadID should get displayed")
	public void FromLeadEmpty()
	{
		boolean fromLead = driver.findElement(By.id("ComboBox_partyIdFrom")).isDisplayed();
		if (fromLead)
		{
		System.out.println("FromLead column is not empty");	
		}
		else
		{
		System.out.println("FromLead column is empty");		
		}
	}
	
	
	@When("Clickon To Lead icon")
	public void clickToLeadIcon()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	
	@Then("To LeadID should get display")
	public void ToLeadEmpty()
	{
		boolean ToLead = driver.findElement(By.id("ComboBox_partyIdTo")).isDisplayed();
		if (ToLead)
		{
		System.out.println("ToLead column is not empty");	
		}
		else
		{
		System.out.println("ToLead column is empty");		
		}
	}
	
	@When("Click on Merge button")
	public void clickonMerge()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	
	@And("Are you sure Alert window will appear to confirm")
	public void alertWindow()
	{
	driver.switchTo().alert().accept();
	}
	
}
