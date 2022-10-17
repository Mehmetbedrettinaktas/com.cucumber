package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( // bize JUnit'ten geliyor
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepdefinitions",  // glue yapistirmak
        tags = "@demo", //Ayni anda birden fazla tagi calistirmak istersek "@java or @nutella or @iphone" seklinde yapiliyor
        dryRun = false)
        public class TestRunner {




}
