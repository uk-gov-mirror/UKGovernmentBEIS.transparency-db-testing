package UK.GOV.BEIS.SCTDB.runners.api.admin;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/api/PUTApproveSubsidyAwardAPI.feature"}
        ,glue= "UK/GOV/BEIS/SCTDB/steps/api")

public class ApproveSubsidyAward_APIRunner {
}
