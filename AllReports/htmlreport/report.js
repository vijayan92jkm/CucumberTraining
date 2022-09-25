$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/MyAccount.feature");
formatter.feature({
  "name": "",
  "description": "  Validate the my account functionality of the star three sixty application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    Validate the my account functionality of the star360 application",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User got to the star360 application by chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userGotToTheStar360ApplicationByChrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicks the my account option",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.iClicksTheMyAccountOption()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression (//[text()\u003d\u0027My Account\u0027])[1] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027(//[text()\u003d\u0027My Account\u0027])[1]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d105.0.5195.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.1.39\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002719\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53802}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b446e1d569462243bbcf961de1bcaae1\n*** Element info: {Using\u003dxpath, value\u003d(//[text()\u003d\u0027My Account\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy20.click(Unknown Source)\r\n\tat org.base.BaseClass.buttonClick(BaseClass.java:49)\r\n\tat org.stepdefinition.StepDefinition.iClicksTheMyAccountOption(StepDefinition.java:141)\r\n\tat ✽.I clicks the my account option(file:src/test/resources/FeatureFiles/MyAccount.feature:56)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User provide user name in user name field",
  "rows": [
    {
      "cells": [
        "1vijadfd2@gmail.com",
        "2fgsfghsf@gmail.com"
      ]
    },
    {
      "cells": [
        "3fscshc@gmail.com",
        "4sfsfsfh@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userProvideUserNameInUserNameField(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User provide password in password field",
  "rows": [
    {
      "cells": [
        "1sfsfh",
        "2sffh",
        "3sfwfhw"
      ]
    },
    {
      "cells": [
        "4dvhfw",
        "5dfh3",
        "6dbhs"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userProvidePasswordInPasswordField(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks singin button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userClicksSinginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user nvg to invld crdntl page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userNvgToInvldCrdntlPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});