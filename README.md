OLXSeleniumTests
Serenity + Selenium WebDriver

To work with project you should do two steps:

1. Update serenity.properties (located at src/main/resources):

These properties need to be updated to point to your driver location
webdriver.driver=chrome
webdriver.chrome.driver=E:\\Selenium\\chromedriver.exe

E.G. to run tests in FireFox use next:
webdriver.driver=firefox
webdriver.chrome.driver=E:\\Selenium\\geckodriver.exe


2. Now goto root directory of the project and call next command:
mvn clean verify

This command will clean "target" directory of the project and the will start tests. After tests are finished
goto /target/site/serenity folder and open index.html to view resuls.