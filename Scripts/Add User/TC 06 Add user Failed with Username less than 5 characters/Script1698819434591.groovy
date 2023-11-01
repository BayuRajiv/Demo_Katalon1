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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Add user/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Add user/Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Add user/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Add user/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Add user/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Dropdown_Role_User'))

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Dropdown_Status'))

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/span_Enabled'))

WebUI.setText(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/Add_input_employee_name'), 'Ravi M B')

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/span_Ravi M B'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/Add_input_Username'), 'Bay')

WebUI.setEncryptedText(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/Add_input_Password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.setEncryptedText(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/Add_input_Confirm Password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Add user/Page_OrangeHRM/Page_OrangeHRM/button_Save'))

