import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.comment('Input All Field Blank')

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/Button Request Demo'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Mileapp  Request Demo/Error Text'), 'The organization name field is required.')

WebUI.comment('Input Only Company Name')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/Input Company Name'), 'Dirumah Aja')

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/Button Request Demo'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Mileapp  Request Demo/Error Text'), 'The full name field is required.')

WebUI.comment('Input Company & Full Name')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Full name_name'), 'Dianita Ananda')

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/Button Request Demo'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Mileapp  Request Demo/Error Text'), 'The phone field is required.')

WebUI.comment('Input Company, Name & Phone Number')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Phone number_phone'), '89606535286')

WebUI.click(findTestObject('Page_Mileapp  Request Demo/Button Request Demo'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Mileapp  Request Demo/Error Text'), 'The email field is required.')

WebUI.comment('Input Invalid Email Format')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Email_email'), 'dianita')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Mileapp  Request Demo/span_The email field must be a valid email'), 
    'The email field must be a valid email.')

WebUI.closeBrowser()

