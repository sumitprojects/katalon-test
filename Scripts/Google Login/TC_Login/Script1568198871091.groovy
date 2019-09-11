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

WebUI.openBrowser('https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.co.in/')

not_run: WebUI.navigateToUrl('https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.co.in/')

WebUI.setText(findTestObject('Object Repository/Login_Objects/Page_Sign in - Google Accounts/input_Use your Google Account_identifier'), 
    'sumit.templatic')

WebUI.click(findTestObject('Login_Objects/Page_Sign in - Google Accounts/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Objects/Page_Sign in - Google Accounts/input_Too many failed attempts_password'), 
    'FUS8lcXGduaZZKg9WZ54Tw==')

WebUI.click(findTestObject('Login_Objects/Page_Sign in - Google Accounts/span_NextPassword'))

WebUI.click(findTestObject('Object Repository/Login_Objects/Page_Google/span_Collections_gb_Ba gbii'))

WebUI.click(findTestObject('Object Repository/Login_Objects/Page_Google/a_Sign out'))

not_run: WebUI.closeBrowser()

