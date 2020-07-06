package com.tanoshii.junitpageobjects.tests;

import org.junit.Test;

import com.tanoshii.junitpageobjects.objects.BasePage;
import com.tanoshii.junitpageobjects.objects.DictionaryPage;
import com.tanoshii.junitpageobjects.objects.EntryPage;
import com.tanoshii.junitpageobjects.objects.HomePage;
import com.tanoshii.junitpageobjects.objects.ResultsPage;

public class Tests extends ParentTest{

	@Test
	public void buscaKanji(){
		HomePage inicio = new HomePage(driver,wait);
		inicio.veAPagina();
		inicio.verificaPagina();
		DictionaryPage diccionario= inicio.veADiccionario();
		diccionario.verificaPagina();
		BasePage redireccionado = diccionario.buscaPalabra("horobiru");
		if(redireccionado instanceof ResultsPage){
			ResultsPage resultados = (ResultsPage) redireccionado;
			EntryPage resultado = resultados.damePrimerResultado();
			resultado.verificaPagina();
		}else{
			EntryPage resultado = (EntryPage) redireccionado;
			resultado.verificaPagina();
		}
	}
	
	@Test
	public void buscaKanji2(){
		HomePage inicio = new HomePage(driver,wait);
		inicio.veAPagina();
		inicio.verificaPagina();
		DictionaryPage diccionario= inicio.veADiccionario();
		diccionario.verificaPagina();
		BasePage redireccionado = diccionario.buscaPalabra("toufu");
		if(redireccionado instanceof ResultsPage){
			ResultsPage resultados = (ResultsPage) redireccionado;
			EntryPage resultado = resultados.damePrimerResultado();
			resultado.verificaPagina();
		}else{
			EntryPage resultado = (EntryPage) redireccionado;
			resultado.verificaPagina();
		}
	}
}
