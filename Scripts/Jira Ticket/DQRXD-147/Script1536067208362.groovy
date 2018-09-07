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

//Create a collection for all currencies in the dropdown
List <WebElement> collection = driver.findElements(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select/option"))

//Get the total number of currencies
int count = collection.size()
println(count)

//Iterate through all the dropdown options
for(int i=1;i<=count;i++){
	
	//Select the currency
	WebElement selectCoin = driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select/option["+i+ "]"))
	selectCoin.click()
	
	//Get what the currency is
	String coin = selectCoin.getText()
	println(coin)

	//Click next button
	driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[2]/button")).click()

	//Storing Title header text
	String Title = WebUI.getText(findTestObject("Deposit Modal/Title"),FailureHandling.OPTIONAL)
	//WebElement Aptitle = driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[1]/div[1]"));
	//String Title = Aptitle.getText();
	System.out.println(Title);
	
	if(coin == "Bitcoin" && Title.contains(GlobalVariable.Bitcoin))
	{
		System.out.println("PASSED: Header is visible and title is similar");
		WebUI.verifyElementPresent(findTestObject('Deposit Modal/AddressField'),3)
		//Close Modal
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()
	
	}
	else if(coin == "Bitcoin Cash" && Title.contains(GlobalVariable.BitcoinCash))
	{
		System.out.println("PASSED: Header is visible and title is similar");
		WebUI.verifyElementPresent(findTestObject('Deposit Modal/AddressField'),3)
		//Close Modal
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()
	}
	else if(coin == "Ethereum" && Title.contains(GlobalVariable.Ethereum)){
		System.out.println("PASSED: Header is visible and title is similar");
		WebUI.verifyElementPresent(findTestObject('Deposit Modal/AddressField'),3)
		//Close Modal
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()
	}
	else if(coin == "Ripple" && Title.contains(GlobalVariable.Ripple)){
		System.out.println("PASSED: Header is visible and title is similar");
		WebUI.verifyElementPresent(findTestObject('Deposit Modal/AddressField'),3)
		//Close Modal
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()
	}
	else if(coin == "Litecoin" && Title.contains(GlobalVariable.Litecoin)){
		System.out.println("PASSED: Header is visible and title is similar");
		WebUI.verifyElementPresent(findTestObject('Deposit Modal/AddressField'),3)
		//Close Modal
		driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div/div[2]/div/div/div[4]/div/button")).click()
	}
	else if(coin == "Euro"){
		//Click Cancel
		driver.findElement(By.xpath('//*[@id="trade-deposit-dialog"]/div/div[2]/div/div[2]/div/div/div/button[1]')).click()
	}
	else if(coin == "Ethereum Classic"){
		//Click X
		driver.findElement(By.xpath('//*[@id="trade-deposit-dialog"]/div/div[1]/div/i')).click()
		WebUI.refresh()
		WebUI.delay(10)
		//Click Hamburger Icon
		WebUI.click(findTestObject('trade.html/Hamburger Menu'))
		
	}
	else if(coin == "DQR10"){
		//Click Close
		driver.findElement(By.xpath('/html/body/div[5]/div/div/div[2]/div/div/div[2]/div/div/a[1]')).click()
	}
	else if(coin == "DQR30"){
		//Click Close
		driver.findElement(By.xpath('/html/body/div[5]/div/div/div[2]/div/div/div[2]/div/div/a[1]')).click()
	}
	else if(coin == "IOTA"){
		//Click Close
		driver.findElement(By.xpath('/html/body/div[5]/div/div/div[2]/div/div/div[2]/div/div/a[1]')).click()
	}
	else if(coin == "Dash"){
		//Click Close
		driver.findElement(By.xpath('/html/body/div[5]/div/div/div[2]/div/div/div[2]/div/div/a[1]')).click()
	}
	
	//Click Deposit link text
	WebUI.click(findTestObject('Object Repository/SideMenuBar/Deposit'))

	WebUI.delay(3)

	// Location Pop-up Modal
	driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div"))
		
}


//currency.selectByVisibleText("Ripple");
//Selecting Dropdown Option
//Select currency = new Select(driver.findElement(By.xpath("//*[@id='trade-deposit-dialog']/div/div[2]/div/div[2]/div/form/div[1]/select")))

//Choosing Ripple value
//Select value = currency.selectByValue("5");



