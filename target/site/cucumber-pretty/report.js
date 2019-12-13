$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFeature1.feature");
formatter.feature({
  "line": 1,
  "name": "Test Feature 1",
  "description": "",
  "id": "test-feature-1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6447800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test POC Scenario",
  "description": "",
  "id": "test-feature-1;test-poc-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@rajat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open url \"http://www.buybooksindia.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify attribute value \"title\" of element \"titleElement\" in page \"HomePage\" should be \"Buy Books India\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on \"menuHowToOrder\" in page \"HomePage\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter value \"Value for Text\" on \"inputSearchBook\" in page \"HowToOrderPage\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.buybooksindia.com/",
      "offset": 12
    }
  ],
  "location": "BrowserStepDefinations.i_open_url(String)"
});
formatter.result({
  "duration": 6333197000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title",
      "offset": 26
    },
    {
      "val": "titleElement",
      "offset": 45
    },
    {
      "val": "HomePage",
      "offset": 68
    },
    {
      "val": "Buy Books India",
      "offset": 89
    }
  ],
  "location": "AssertionStepDefinations.i_verify_attribute_value_of_element_in_page_should_be(String,String,String,String)"
});
formatter.result({
  "duration": 156401800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "menuHowToOrder",
      "offset": 12
    },
    {
      "val": "HomePage",
      "offset": 37
    }
  ],
  "location": "ActionStepDefinations.i_click_on_in_page(String,String)"
});
formatter.result({
  "duration": 1802712100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Value for Text",
      "offset": 15
    },
    {
      "val": "inputSearchBook",
      "offset": 35
    },
    {
      "val": "HowToOrderPage",
      "offset": 61
    }
  ],
  "location": "ActionStepDefinations.i_enter_value_on_in_page(String,String,String)"
});
formatter.result({
  "duration": 415505100,
  "status": "passed"
});
formatter.after({
  "duration": 531828700,
  "status": "passed"
});
formatter.before({
  "duration": 187700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Test POC Scenario 1",
  "description": "",
  "id": "test-feature-1;test-poc-scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@rajat"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I open url \"http://www.buybooksindia.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I verify attribute value \"title\" of element \"titleElement\" in page \"HomePage\" should be \"Buy Books India\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on \"menuHowToOrder\" in page \"HomePage\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter value \"Value for Text\" on \"inputSearchBook\" in page \"HowToOrderPage\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.buybooksindia.com/",
      "offset": 12
    }
  ],
  "location": "BrowserStepDefinations.i_open_url(String)"
});
formatter.result({
  "duration": 1113907200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title",
      "offset": 26
    },
    {
      "val": "titleElement",
      "offset": 45
    },
    {
      "val": "HomePage",
      "offset": 68
    },
    {
      "val": "Buy Books India",
      "offset": 89
    }
  ],
  "location": "AssertionStepDefinations.i_verify_attribute_value_of_element_in_page_should_be(String,String,String,String)"
});
formatter.result({
  "duration": 34200900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "menuHowToOrder",
      "offset": 12
    },
    {
      "val": "HomePage",
      "offset": 37
    }
  ],
  "location": "ActionStepDefinations.i_click_on_in_page(String,String)"
});
formatter.result({
  "duration": 822366800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Value for Text",
      "offset": 15
    },
    {
      "val": "inputSearchBook",
      "offset": 35
    },
    {
      "val": "HowToOrderPage",
      "offset": 61
    }
  ],
  "location": "ActionStepDefinations.i_enter_value_on_in_page(String,String,String)"
});
formatter.result({
  "duration": 133417300,
  "status": "passed"
});
formatter.after({
  "duration": 477416500,
  "status": "passed"
});
});