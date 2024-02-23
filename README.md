# Framework_RestAssured_Cucumber
This is an E2E automation testing framework for testing Rest APIs using Java, RestAssured and Cucumber BDD.

Characteristics

1. The use of cucumber BDD is implemented to use the Gherkin language and behavior-driven development.
2. Implementation of the design pattern as POM to encapsulate the code and perform maintenance.
3. Be sure to use methods to test APIs
4. Junit to run test cases and make assertions.
5. Allure Reports is a test reporting tool to run and generate reports.

  # To Run test cases and generarte allure reports:

  ```bash
mvn clean test -Dallure.results.directory=target/allure-results
mvn allure:serve

 # Performance Testing K6

You could find scripts for performance testing using K6 you could find it at the folder called Performance_Tesitng_K6

To Run performance testing use:

```bash
 k6 run Performance_Testing_K6/main.js --out json=result.json

  
