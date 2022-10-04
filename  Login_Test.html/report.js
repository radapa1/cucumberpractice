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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I entered user id and password and clicked on signin button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "successfully logged into the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});