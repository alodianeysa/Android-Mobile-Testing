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

//Mobile.startApplication('D:\\Downloads\\Foody Find Reserve Delivery_v5.3.1_apkpure.com.apk', false)

Mobile.tap(findTestObject('Foody/btn_profile1'), 0)

Mobile.tap(findTestObject('Foody/btn_login'), 0)

Mobile.tap(findTestObject('Foody/btn_connectFB'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Foody/txt_email'), 'nurivahalodia0001@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Foody/txt_password'), 'O4je174kpW+idHpk4X1AGA==', 0)

Mobile.tap(findTestObject('Foody/btn_masuk'), 0)

Mobile.tap(findTestObject('Foody/btn_lanjut'), 0)

