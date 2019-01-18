$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookFlightTickets.feature");
formatter.feature({
  "line": 2,
  "name": "Book flight tickets",
  "description": "As a user with valid credentials,\r\nI want to be able to search for flight tickets between a given source and destination,\r\nselect from the available options presented, and book the tickets accordingly",
  "id": "book-flight-tickets",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature1"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I login using the valid username mercury and the valid password mercury",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Find and book flight tickets",
  "description": "",
  "id": "book-flight-tickets;find-and-book-flight-tickets",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@completed"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I search for flights using the following criteria:",
  "rows": [
    {
      "cells": [
        "FromPort",
        "FromMonth",
        "FromDate",
        "ToPort",
        "ToMonth",
        "ToDate",
        "Airline",
        "PassengerCount"
      ],
      "line": 14
    },
    {
      "cells": [
        "London",
        "July",
        "23",
        "Paris",
        "July",
        "29",
        "Unified Airlines",
        "2"
      ],
      "line": 15
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I select the first available flight",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I book the tickets using the following passenger details:",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 18
    },
    {
      "cells": [
        "iCIMS",
        "Labs"
      ],
      "line": 19
    },
    {
      "cells": [
        "QA",
        "Automation"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I use the following credit card details:",
  "rows": [
    {
      "cells": [
        "CreditCardType",
        "CreditCardNumber"
      ],
      "line": 22
    },
    {
      "cells": [
        "MasterCard",
        "1234567890"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should get a booking confirmation with a confirmation number",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});