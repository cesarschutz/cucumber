package cucumber.teste;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags = "@ContaTeste",
        glue = "modelo.teste.passos", monochrome = true, dryRun = false)
//features - caminho das features
//tags - informa qual cenario vai ser executado
//monochrome - serve para ficar mais legivel os resultados dos testes
//DRyRun - cria automaticamente os metodos caso não exista na classe de testes
public class ContaTeste {
}