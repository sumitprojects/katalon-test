import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.co.in/')

WebUI.setText(findTestObject('google login m/Page_Sign in - Google Accounts/input_Use your Google Account_identifier'), 
    'kekanmanjusha@gmail.com')

WebUI.click(findTestObject('google login m/Page_Sign in - Google Accounts/span_Next'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('google login m/Page_Sign in - Google Accounts/input_Too many failed attempts_password'), 
    '/oi8xjQaoTvgiSPrrA3aGg==')

WebUI.sendKeys(findTestObject('google login m/Page_Sign in - Google Accounts/input_Too many failed attempts_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('google login m/Page_Google/span_Collections_gb_Ba gbii'))

WebUI.click(findTestObject('google login m/Page_Google/a_Sign out'))

WebUI.closeBrowser()

