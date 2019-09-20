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

WebUI.navigateToUrl('https://listify-demos.astoundify.com/rentals/')

WebUI.click(findTestObject('listify object/sign up/a_Sign Up'))

WebUI.setText(findTestObject('listify object/sign up/input_First Name_sr_firstname'), 'manjusha')

WebUI.setText(findTestObject('listify object/sign up/input_Last Name_sr_lastname'), 'gire')

WebUI.setText(findTestObject('listify object/sign up/input__email'), 'Durincess1979@cuvox.de')

WebUI.setEncryptedText(findTestObject('listify object/sign up/input__password'), '/oi8xjQaoTvgiSPrrA3aGg==')

WebUI.click(findTestObject('listify object/sign up/input_Anti-spam_register'))

WebUI.click(findTestObject('listify object/sign up/li_ma'))

WebUI.delay(2)

WebUI.click(findTestObject('listify object/sign up/li_ma'))

WebUI.click(findTestObject('listify object/sign up/a_Log Out'))

WebUI.closeBrowser()

