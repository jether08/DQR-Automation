import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.WebDriver as WebDriver
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
CustomKeywords.'utility.ValidLogin.login'()

WebUI.delay(15)
WebUI.click(findTestObject('trade.html/Currency Selector'))

//Call Select XRPBTC custom keyword
CustomKeywords.'utility.selectXRPBTC.xrpbtc'()

/*WebUI.click(findTestObject('trade.html/Currency Selector'))

WebDriver driver = DriverFactory.getWebDriver()
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

WebUI.closeBrowser()


