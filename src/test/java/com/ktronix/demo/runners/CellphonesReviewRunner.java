package com.ktronix.demo.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber/fast-report/cucumber-pretty.html",
        "json:target/cucumber/cucumber.json"},
        features = "src/test/java/resources/features/cellphonesReview.feature",
        tags = "@VIEW_CELLPHONES_BY_RAM",
        glue = "com.ktronix.demo.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class CellphonesReviewRunner {
}
