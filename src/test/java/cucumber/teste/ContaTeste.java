package cucumber.teste;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste",
        glue = "modelo.teste.passos", monochrome = true, dryRun = false)
public class ContaTeste {



}