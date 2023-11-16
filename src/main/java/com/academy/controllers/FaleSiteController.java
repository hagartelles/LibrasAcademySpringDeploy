package com.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.academy.entidades.FaleConosco;
import com.academy.repository.FaleRepository;

@Controller
@RequestMapping("/src")
public class FaleSiteController {
	@Autowired
	private FaleRepository faleRepository;
	
	@PostMapping("/cadastroMsg")
    public String cadastrar(FaleConosco fale) {
        //String senhaEncriptada = SenhaUtils.encode(aluno.getSenha());//
        //aluno.setSenha(senhaEncriptada);
        faleRepository.save(fale);

        return "redirect:/";
    }
}
