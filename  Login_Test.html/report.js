$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/checkicon.feature");
formatter.feature({
  "name": "Test the assertions in BBC website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that icon is present in the website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "uk.adapa.cucumber.stepdefs.LoginStepDefs.user_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
});