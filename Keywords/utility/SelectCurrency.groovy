package utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

public class SelectCurrency {
	@Keyword

	def xrpbtc() {

		WebDriver driver = DriverFactory.getWebDriver()

		//Select XRPBTC
		WebElement select = driver.findElement(By.xpath('/html/body/div[1]/div[2]/header2/div[1]/div/ul/li[2]'))
		select.click()
		//WebUI.delay(30)

		//Store primary and secondary currencies in variables
		String currency = "XRPBTC"
		String primary = "XRP"
		String secondary = "BTC"

		//Get the displayed currencies in the page
		String above = WebUI.getText(findTestObject('trade.html/Currency Above'))
		String below = WebUI.getText(findTestObject('trade.html/Currency Below'))
		String buy_amt = WebUI.getText(findTestObject('trade.html/Buy Amount Label'))
		String priceper = WebUI.getText(findTestObject('trade.html/Price Per Label'))
		String pricebookheader = WebUI.getText(findTestObject('trade.html/Order Book Price Header'))
		String qtybookheader = WebUI.getText(findTestObject('trade.html/Order Book Qty Header'))
		String marketprice = WebUI.getText(findTestObject('trade.html/Market Price Currency'))
		String ordertotal = WebUI.getText(findTestObject('trade.html/Order Total Currency'))
		String fees = WebUI.getText(findTestObject('trade.html/Fees Currency'))
		String net = WebUI.getText(findTestObject('trade.html/Net Currency'))
		String chart_footer = WebUI.getText(findTestObject('trade.html/Chart Footer'))
		
		//WebUI.getAttribute(null, id)	
		//WebUI.switchToFrame(findTestObject('trade.html/Chart Currency'), 10)
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		//String chart = WebUI.getText(findTestObject('trade.html/Chart Currency'))
		String chart = driver.findElement(By.xpath('//*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]/span')).getText()
		
		
		//Verify if currency above matches the secondary currency: “<DEF>” in: //*[@id="main-content"]/div[1]/div[1]/div/div/table/tbody/tr[1]/td[1]
		WebUI.verifyMatch(above, secondary, true)

		//Verify if currency below matches the primary currency: “<ABC>” in: //*[@id="main-content"]/div[1]/div[1]/div/div/table/tbody/tr[2]/td[1
		WebUI.verifyMatch(below, primary, true)

		/*//Verify if currency in the chart contains the selected currency text: “<ABCDEF>” in: //*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]/span
		if (chart.contains(currency)){
			println("Currency in the chart is correct.")
		}
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}*/
		
		//“Buy amount (<ABC>)”: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[2]/div[1]/label
		if(buy_amt.contains(primary)){
			println("Buy Amount label is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“Price per (<DEF>)”: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[2]/div[2]/label
		if(priceper.contains(secondary)){
			println("Price per label is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“Price (<DEF>)”: //*[@id="priceBookHeader"]
		if(pricebookheader.contains(secondary)){
			println("Order Book Price label is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“Quantity (<ABC>)”: //*[@id="quantityBookHeader"]
		if(qtybookheader.contains(primary)){
			println("Order Book Quantity label is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“<n DEF>” where n is a number: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[3]/div/div[2]/div[1]
		if(marketprice.contains(secondary)){
			println("Market Price currency is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“<n DEF>” where n is a number: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[3]/div/div[2]/div[2]
		if(ordertotal.contains(secondary)){
			println("Order Total currency is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“<n ABC>” where n Is a number: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[3]/div/div[2]/div[3]
		if(fees.contains(primary)){
			println("Fees currency is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“<n DEF>” where n is a number: //*[@id="trigger-content-1"]/div/div/div/div/div/div/div[3]/div/div[2]/div[4]
		if(net.contains(secondary)){
			println("Net currency is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		//“<ABCDEF> chart”: //*[@id="chart-trigger-content-1"]/div/div[2]/a/span
		if(chart_footer.contains(currency)){
			println("Chart Footer currency is correct")
		}
		
		else{
			FailureHandling.CONTINUE_ON_FAILURE
		}
		
		
	}
}
