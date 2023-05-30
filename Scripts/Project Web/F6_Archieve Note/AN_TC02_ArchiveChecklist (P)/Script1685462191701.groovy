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

Mobile.startExistingApplication('com.socialnmobile.dictapps.notepad.color.note')

Mobile.verifyElementVisible(findTestObject('Object Repository/Archieve Note/android.widget.TextView - Archive Checklist'), 
    0)

Mobile.tap(findTestObject('Archieve Note/android.widget.TextView - Archive Checklist'), 0)

Mobile.tap(findTestObject('Object Repository/Archieve Note/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Archieve Note/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Archieve Note/android.widget.TextView - Archive (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Archieve Note/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Archieve Note/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Archieve Note/android.widget.ImageView (3)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Archieve Note/android.widget.TextView - Archive Checklist (1)'), 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

