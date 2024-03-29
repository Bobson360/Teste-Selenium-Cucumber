package test.atomic.tAutomation.Steps;

import java.util.LinkedHashMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.atomic.tAutomation.pages.GoogleHomePage;
import test.atomic.tAutomation.pages.GoogleSearchResultsPage;
import test.atomic.tAutomation.utils.Utils;

/**
 * 
 * @author Robson Rodrigues da Silva
 * 		   Email: bobson278@gmail.com </br>
 * 		   GitHub: https://github.com/Bobson360</br>
 *
 */
public class Pesquisa {
	
	GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
	GoogleHomePage googleHomePage = new GoogleHomePage();
	
	Utils utils = new Utils();
	
	public static LinkedHashMap<String, Boolean> pesquisa = new LinkedHashMap<String, Boolean>();
	
	@Given("Dado que eu esteja na pagina de buscas do google")
	public void dado_que_eu_esteja_na_pagina_de_buscas_do_google() throws InterruptedException {
		System.out.println("Dado que eu esteja na pagina de buscas do google");
		googleHomePage.googleHome();
	}
	
	@When("quando eu pesquisar por um diretor de cinema e um de seus filmes")
	public void quando_eu_pesquisar_por_um_diretor_de_cinema_e_um_de_seus_filmes() throws InterruptedException {
		System.out.println("quando eu pesquisar por um diretor de cinema e um de seus filmes");
		pesquisa = googleSearchResultsPage.pesquisa();
	}
	
	@Then("entao devo retornar o numero de resultados")
	public void entao_devo_retornar_o_numero_de_resultados() {
		System.out.println("entao devo retornar o numero de resultados");
		utils.validations(pesquisa);
	}
	

}
