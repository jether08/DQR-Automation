import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory

//Call Login custom keyword
CustomKeywords.'utility.ValidLogin.Level4Login'()

WebUI.delay(10)

//Initializing webdriver script
WebDriver driver = DriverFactory.getWebDriver()

//Click Hamburger Icon
WebUI.click(findTestObject('trade.html/Hamburger Menu'))

//Click Deposit link text
WebUI.click(findTestObject('Object Repository/SideMenuBar/Deposit'))

WebUI.delay(3)

// Location Pop-up Modal
driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div"))


Select currency = new Select(driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select")))
 List <WebElement> currencies = currency.getOptions()
 println(currencies)
 int count = currencies.size()
 println(count)

//Select Bitcoin currency


//currency.selectByVisibleText(MoneyValue);

for(i=0;i<=count;i++){
	currency.selectByIndex(i)
	
	String coin = currencies.get(i).getText()
	println(coin)

	String Bitcoin = "BTC"
	String Ripple = "XRP"
	
		
	//Click next button
	driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[2]/button")).click()

	//Storing Title header text
	WebElement Aptitle = driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[1]/div[1]"));
	String Title = Aptitle.getText();
	System.out.println(Title);
		

/*	if(coin.contentEquals("Bitcoin"))
	{
		System.out.println("Header is visible and title is similar");
	
	}
	else
	{
		System.out.println("tae nah");
	}	*/
	
	//Close Modal
	driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()

	
}


//currency.selectByVisibleText("Ripple");
//Selecting Dropdown Option
//Select currency = new Select(driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select")))

//Choosing Ripple value
//Select value = currency.selectByValue("5");



