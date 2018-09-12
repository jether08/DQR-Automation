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
import com.kms.katalon.core.util.KeywordUtil

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.logging.KeywordLogger


//Call Login custom keyword
CustomKeywords.'utility.ValidLogin.Level0Login'()

WebUI.delay(10)

//Initializing webdriver script
WebDriver driver = DriverFactory.getWebDriver()

//Click Hamburger Icon
WebUI.click(findTestObject('trade.html/Hamburger Menu'))

//Click Deposit link text
WebUI.click(findTestObject('Object Repository/SideMenuBar/Withdraw'))

WebUI.delay(3)

// Locate Pop-up Modal 
driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div"))

//Create a collection for all currencies in the dropdown
List <WebElement> collection = driver.findElements(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select/option"))

int count = collection.size()
println(count)


//Iterate through all the dropdown options
for(int i=1;i<=count;i++){
	
	//Select the currency
	WebElement selectCoin = driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select/option["+i+ "]"))
	selectCoin.click()
	
	//Get what the currency is
	String coin = selectCoin.getText()
	println('Selected coin: ' + coin)

	//Click next button
	driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[2]/button")).click()
	
	//Storing Title header text
	String VAmodal = WebUI.getText(findTestObject("Deposit Modal/VAtitle"),FailureHandling.CONTINUE_ON_FAILURE)
	//WebElement Aptitle = driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[1]/div[1]"));
	//String Title = Aptitle.getText();
	System.out.println('Popup title: ' + VAmodal);
	KeywordLogger log = new KeywordLogger()
	
	if(VAmodal.equals("VERIFY ACCOUNT"))
	{
		log.logInfo('PASSED')
		KeywordUtil.markPassed("Verify Account is displayed")
		driver.findElement(By.xpath("//*[contains(text(), 'Close')]")).click()
	}
		
	else
	{
		log.logWarning('Verify Account pop-up is not displayed')
		KeywordUtil.markFailed("No Verify Account displayed")
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div/div[2]/div/div[2]/div[4]/div/button[1]")).click()
		
	}
	
	
	//driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']")).click()
		
	WebUI.click(findTestObject('Object Repository/SideMenuBar/Withdraw'))
	
}





















/*//Selecting Dropdown Option
Select currency = new Select(driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select")))

//Choosing currency value
currency.selectByValue("8");

//Click next button
driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[2]/button")).click()


//Finding Title header modal
WebElement VAmodal = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/div/div[1]/div"));

//Storing Title header text
String TitleHeader = VAmodal.getText();

//Matching Title header
WebUI.verifyMatch(TitleHeader, "VERIFY ACCOUNT", true)

System.out.println(TitleHeader);*/