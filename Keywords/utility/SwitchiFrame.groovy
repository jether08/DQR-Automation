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

public class SwitchiFrame {
	WebDriver driver = DriverFactory.getWebDriver()
	
	WebElement iframe = driver.findElement(By.xpath('//*[@id="tradingview_46ed0"]/iframe'))
	
	String chart = driver.findElement(By.xpath('//*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]/span')).getText();

	//Verify if currency in the chart contains the selected currency text: “<ABCDEF>” in: //*[@id="chart-area"]/div/div[3]/table/tbody/tr[1]/td[2]/div/div[3]/div[1]/span
	 /*if (chart.contains(currency)){
		 println("Currency in the chart is correct.")
	 }
	 else{
		 println(chart)
	 }*/

	
}
