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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgoogle+login%26rlz%3D1C1GGRV_enIN796IN796%26oq%3Dgoogle+login%26aqs%3Dchrome..69i57j69i64.8072j0j0%26sourceid%3Dchrome%26ie%3DUTF-8&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/google login m/input_Use your Google Account'), 'kekanmanjusha@gmail.com')

WebUI.click(findTestObject('Object Repository/google login m/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/google login m/input_Too many failed'), '/oi8xjQaoTvgiSPrrA3aGg==')

WebUI.click(findTestObject('Object Repository/google login m/span_Next'))

WebUI.click(findTestObject('Page_google login - Google Search/span_Accessibility feedback_gb_Ba gbii'))

WebUI.click(findTestObject('Page_google login - Google Search/a_Sign out'))

WebUI.closeBrowser()

