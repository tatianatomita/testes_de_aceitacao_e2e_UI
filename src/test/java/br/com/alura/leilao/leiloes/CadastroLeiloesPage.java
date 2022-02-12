package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroLeiloesPage {
	
	private WebDriver browser;
	
	
	public CadastroLeiloesPage(WebDriver browser) {
			this.browser = browser;
	}

	public void fechar() {
		this.browser.quit();
	}

	public LeiloesPage cadastrarLeilao(String nome, String valorInicial, String dataAbertura) {
		this.browser.findElement(By.id("nome")).sendKeys(nome);
		this.browser.findElement(By.id("valorInicial")).sendKeys(valorInicial);
		this.browser.findElement(By.id("dataAbertura")).sendKeys(dataAbertura);
		this.browser.findElement(By.id("button-submit")).submit();
		
		return new LeiloesPage(browser);
		
	}


	
}

