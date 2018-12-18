set projectLocation=C:\Users\hemant\Desktop\Hemanth_Selenium_WorkSpace\H_DifferentConceptsPractice

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\POB_testng.xml

pause



