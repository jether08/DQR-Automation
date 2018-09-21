import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Call Login custom keyword
CustomKeywords.'utility.ValidLogin.Level4Login'()

WebUI.delay(15)
WebUI.click(findTestObject('trade.html/Currency Selector'))

//OPTION 1: Call Select Currency custom keyword
//CustomKeywords.'utility.SelectCurrency.xrpbtc'()
CustomKeywords.'utility.SwitchiFrame.chart'()


/*/OPTION 2: Loop through the currencies in the list
WebDriver driver = DriverFactory.getWebDriver()

//Store all list items
def currencies = driver.findElements(By.cssSelector('.dropdown-menu.ticker li'))
//List <WebElement> currencies = currenciesUL.findElements(By.tagName('li')) 

for(WebElement c:currencies){
//currencies[1].each({def c->
	//select currency
	c.click()
	
	//get the text value of the selected currency and print it for later comparison
	String selected = c.getText()
	println(selected)
	
	//get the secondary currency
	String secondary = selected.substring(3,5)
	//get the  primary currency
	String primary = selected.substring(0, 2)
	
	//Get the currencies above, below, and in the chart
	String above = WebUI.getText(findTestObject('trade.html/Currency Above'))
	String below = WebUI.getText(findTestObject('trade.html/Currency Below'))
	String chart = WebUI.getText(findTestObject('null'))
	
	//Verify if currency above matches the secondary currency
	WebUI.verifyMatch(above, secondary, true)
	
	//Verify if currency below matches the primary currency
	WebUI.verifyMatch(below, primary, true)
	
	//Verify if currency in the chart contains the selected currency text
	if (chart.contains(selected)){
		println("Currency in the chart is correct.")
	}
	else{
		FailureHandling.STOP_ON_FAILURE
	}
	
	WebUI.click(findTestObject('trade.html/Currency Selector'))

}









/*WebDriver driver = DriverFactory.getWebDriver()
<<<<<<< HEAD
def currencies = driver.findElements(By.cssSelector('.dropdown-menu.ticker li'))
currencies.
=======

def currencies = driver.findElements(By.cssSelector('.li.instrument-symbol'))

>>>>>>> branch 'Dev' of https://github.com/jether08/DQR-Automation.git
def count = currencies.size()

println(count)

<<<<<<< HEAD
currencies.each({def currency
	WebUI.click(findTestObject('trade.html/Currency Selector'))
	currency.click()
	
	
	
	
}
)*/


