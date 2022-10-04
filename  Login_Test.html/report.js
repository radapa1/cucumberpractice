$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "login to application with correct user id and password",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully login into the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I opened application in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "uk.adapa.cucumber.stepdefs.LoginStepDefs.i_opened_application_in_browser()"
});
formatter.result({
  "error_message": "java.lang.NoSuchMethodError: com.google.common.collect.ImmutableMap.of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap;\r\n\tat org.openqa.selenium.chrome.AddHasCasting.getAdditionalCommands(AddHasCasting.java:38)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.getExtraCommands(ChromeDriver.java:98)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.\u003cinit\u003e(ChromeDriver.java:93)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:81)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:49)\r\n\tat uk.adapa.cucumber.stepdefs.LoginStepDefs.i_opened_application_in_browser(LoginStepDefs.java:20)\r\n\tat ✽.I opened application in browser(file:///E:/LEARNING/AUTOMATION/cucumber_practice/src/test/resources/features/login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I entered user id and password and clicked on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "uk.adapa.cucumber.stepdefs.LoginStepDefs.i_entered_user_id_and_password_and_clicked_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "successfully logged into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "uk.adapa.cucumber.stepdefs.LoginStepDefs.successfully_logged_into_the_application()"
});
formatter.result({
  "status": "skipped"
});
});