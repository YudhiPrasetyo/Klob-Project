package klobid.steps.enduserstep;

import klobid.pages.KebijakanPrivasiPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class KebijakanPrivasiStep {

    @Steps
    KebijakanPrivasiPage kebijakanPrivasiPage;

    @Step
    public void linkKebijakanPrivasi(){
        kebijakanPrivasiPage.kebijakanPrivasi();
    }

    @Step
    public void contTerms(){
        Boolean actual = kebijakanPrivasiPage.contTerms();
        assertThat("Container is shown",actual, equalTo(true));
    }
}
