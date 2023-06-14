package com.itb.inf2fm.comercio.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;
@Controller 
@RequestMapping("/comercio/produtos") 
public class LojaController {
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	@GetMapping("/listar")
	public String listarProdutos() {
		System.out.println("LISTA DE PRODUTOS!");
		
			Produto p1 = new Produto();
			p1.setId((long) 201);
			p1.setNome("Maquina de lavar Brastemp 15 l");
			p1.setCodigoBarras("13jho123f");
			p1.setDescricao("Produto Linha Branca com painel ");
			p1.setProco(1);
			
			
			Produto p2 = new Produto();
			p2.setId((long) 201);
			p2.setNome("televisão");
			p2.setCodigoBarras("sdasdasdasd");
			p2.setDescricao("Televisor tela plana let Samsung");
			p2.setProco(1);
			
			Produto p3 = new Produto();
			p3.setId((long) 201);
			p3.setNome("wacon One");
			p3.setCodigoBarras("sdasdasdasd");
			p3.setDescricao("Mesa digitaluzadorea");
			p3.setProco(1);
			
			listaDeProdutos.add(p1);
			listaDeProdutos.add(p2);
			
			return "produtos";
		
	}
}