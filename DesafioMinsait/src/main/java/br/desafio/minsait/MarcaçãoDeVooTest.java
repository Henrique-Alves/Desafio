package br.desafio.minsait;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarcaçãoDeVooTest {

	private WebDriver driver;
	private MarcaçãoDeVooPage marcarVooPage;

	@Before
	public void executarBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Educação\\Desktop\\Henrique\\Desafio\\DesafioMinsait\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://phptravels.net");
		marcarVooPage = new MarcaçãoDeVooPage(driver);
	}

	@After
	public void quit() {
		driver.quit();
	}
	
	/*
	 * Voo-01 Validar uma marcação de voo de ida com sucesso
	 */
	@Test
	public void RealizarMarcaçãoDeDeIdaDoVoo(){
		marcarVooPage.fecharCookie();		
		marcarVooPage.clicarNaAbaVoos();
		marcarVooPage.scrollParaBaixo();
		marcarVooPage.escreverOrigem("Recife");
		marcarVooPage.clicarOrigem();
		marcarVooPage.escreverDestino("são paulo");
		marcarVooPage.clicarDestino();
		marcarVooPage.clicarDataPartida();
//		marcarVooPage.clicarDataDesejada();
//		marcarVooPage.clicarAdicionarpassageiros();
//		marcarVooPage.adicionarPassageiro("1");
		marcarVooPage.clicarBotaoPesquisar();
		
		assertEquals(marcarVooPage.validarmarcacao(), "REC GRU\n"
				+ "Dates ( 03-01-2023 )\n"
				+ "Adults 1 Childs 0 Infants 0");
	}
	
	/*
	 * Voo-02 Validar uma marcação de voo de ida e volta com sucesso.
	 */
	@Test
	public void RealizarMarcaçãoDeIdaEVoltaDoVoo(){
		marcarVooPage.fecharCookie();		
		marcarVooPage.clicarNaAbaVoos();
		marcarVooPage.clicarCheckboxIdaVolta();
		marcarVooPage.scrollParaBaixo();
		marcarVooPage.escreverOrigem("Recife");
		marcarVooPage.clicarOrigem();
		marcarVooPage.escreverDestino("são paulo");
		marcarVooPage.clicarDestino();
		marcarVooPage.clicarDataPartida();
//		marcarVooPage.clicarDataDePatidaDesejada();
		marcarVooPage.clicarDataRetorn();
//		marcarVooPage.clicarDataDeRetornDesejado();
//		marcarVooPage.clicarAdicionarpassageiros();
//		marcarVooPage.adicionarPassageiro("1");
		marcarVooPage.clicarBotaoPesquisar();
		
		assertEquals(marcarVooPage.validarmarcacao(), "REC GRU\n"
				+ "Dates ( 03-01-202305-01-2023 )\n"
				+ "Adults 1 Childs 0 Infants 0");
	}
}
