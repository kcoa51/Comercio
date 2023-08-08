package com.itb.inf2gm.comercio.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2gm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	// array com capacidade flexível
	List<Produto> listaDeProdutos = new ArrayList<Produto>();


	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		
		// passando a lista de produtos para o front-end
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		return "produtos";
	}
	@GetMapping("/novoproduto")
	public String novoProduto(Model model, Produto produto) {
	  
		model.addAttribute("produto", produto);
	return "novoproduto";
	}
	
	@PostMapping("/add-prod")
	public String gravarNovoProduto(Model model, Produto produto) {
		listaDeProdutos.add(produto);
		return "redirect:/comercio/produtos/listar";
		
	}
	
	
	
		
		
		
		
		
		
}

