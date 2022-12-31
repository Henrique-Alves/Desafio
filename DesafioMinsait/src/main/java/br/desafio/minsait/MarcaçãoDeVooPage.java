package br.desafio.minsait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MarcaçãoDeVooPage {

	public WebDriver driver;
//	WebDriverWait wait=new WebDriverWait(driver, 5);
	

	public MarcaçãoDeVooPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicarNaAbaVoos(){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"flights-tab\"]/span[2]"));
		element.click();
	}
	
	public void clicarCheckboxIdaVolta(){
		WebElement element = driver.findElement(By.id("round-trip"));
		element.click();
	}
	
	public void escreverOrigem(String destino){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		element.clear();
		element.sendKeys(destino);
	}
	
	public void escreverDestino(String destino){
		WebElement element = driver.findElement(By.id("autocomplete2"));
		element.clear();
		element.sendKeys(destino);
	}
	
	public void clicarOrigem(){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div[1]"));
		element.click();
	}
	
	public void clicarDestino(){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		element.click();
	}
	
	public void fecharCookie(){
		WebElement element = driver.findElement(By.id("cookie_stop"));
		element.click();
	}
	
	public void clicarDataPartida(){
		WebElement element = driver.findElement(By.id("departure"));
		element.click();
	}
	
	public void clicarDataRetorn(){
		WebElement element = driver.findElement(By.id("return"));
		element.click();
	}
	
	public void clicarDataDePatidaDesejada(){
//		WebElement element = driver.findElement(By.xpath("//table/tbody/tr["+dataColuna+"]/td["+coluna+"][@class=\"day \"]"));
		WebElement element = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[2]/td[2]"));
		element.click();
	}
	
	public void clicarDataDeRetornDesejado(){
//		WebElement element = driver.findElement(By.xpath("//table/tbody/tr["+dataColuna+"]/td["+coluna+"][@class=\"day \"]"));
		WebElement element = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[12]/div[1]/table/tbody/tr[2]/td[5]"));
		element.click();
	}
	
	public void clicarAdicionarpassageiros(){
		WebElement element = driver.findElement(By.xpath("//a[@href='#']"));
		element.click();
	}
	
//	public void adicionarPassageiro(String idpassajeiro, int i){
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div["+idpassajeiro+"]/div/div/div[2]/i"));
//		for (i = 0; i < array.length; i++) {
//			
//		}
//	}
	
	public void adicionarPassageiro(String idpassajeiro){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div["+idpassajeiro+"]/div/div/div[2]/i"));
		element.click();
	}
	
	public void clicarBotaoPesquisar(){
		WebElement element = driver.findElement(By.id("flights-search"));
		element.click();
	}
	
	public void scrollParaBaixo(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,150)");
	}
	
	public String validarmarcacao(){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div/div/div[1]/div/div/div"));
		String validamarcacao = element.getText();
		System.out.println(validamarcacao);
		return validamarcacao;
	}

	
}
