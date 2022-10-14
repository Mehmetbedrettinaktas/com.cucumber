package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( // bize JUnit'ten geliyor
        plugin={"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml" },
        features = "src/test/resources/features",
        glue = "stepdefinitions",  // glue yapistirmak
        tags = "@web", //Ayni anda birden fazla tagi calistirmak istersek "@java or @nutella or @iphone" seklinde yapiliyor
        dryRun = false)
public class TestRunner2 {
}
