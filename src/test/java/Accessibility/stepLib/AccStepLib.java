package Accessibility.stepLib;

import com.deque.axe.AXE;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class AccStepLib extends PageObject {
    private static final URL SCRIPT = AccStepLib.class.getResource("/features/Accessibility/axe-min.js");
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void validateAccessibility(String standard) {
        JSONObject responseJSON = new AXE.Builder(getDriver(), SCRIPT)
                .options(standardFormatter(standard))
                .analyze();
        JSONArray violations = responseJSON.getJSONArray("violations");
        Serenity.recordReportData().withTitle("Axe Report")
                .andContents(AXE.report(violations));

        if (violations.length() == 0) {
            assertTrue("No violations found", true);
        } else {
            AXE.report(violations);
            System.out.println(ANSI_RED + "Number of violations: " + violations.length() + ANSI_RESET);
        }
    }

    private String standardFormatter(String standard) {
        return "{ runOnly: { type: \"tag\", values: [\""
        + standard.replaceAll("\\s|[^\\w|-]", "").toLowerCase() + "\"] } }";
    }
}
