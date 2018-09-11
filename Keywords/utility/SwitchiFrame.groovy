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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

public class SwitchiFrame {
	@Keyword

	def chart() {
		WebDriver driver = DriverFactory.getWebDriver()

		WebElement select = driver.findElement(By.xpath('/html/body/div[1]/div[2]/header2/div[1]/div/ul/li[contains(@class,"instrument-XRPBTC")]'))
		select.click()

		//WebElement iframe = driver.findElement(By.xpath('//div[contains(@id,"tradingview")]//iframe'));
		//WebElement iframe = driver.findElement(By.xpath('//*[@id="tradingview_46ed0"]/iframe'));
		//WebElement frame = driver.findElement(By.tagName("iframe"))
		//String frameID = frame.getAttribute("id")
		//println(frameID)
		//driver.switchTo().frame(frameID)
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));

		String currency = "XRPBTC"
		//String chart = driver.findElement(By.xpath('//*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]')).getText();
		WebUI.switchToFrame(findTestObject('trade.html/Chart ifRame'), 15)
		String chart = WebUI.getText(findTestObject('trade.html/Chart Currency'))

		//Verify if currency in the chart contains the selected currency text: “<ABCDEF>” in: //*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]/span
		if (chart.contains(currency)){
			println("Currency in the chart is correct.")
		}
		else{
			println(chart)
		}
	}

}
