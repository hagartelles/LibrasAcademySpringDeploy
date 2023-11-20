package com.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.academy.entidades.Aluno;
import com.academy.repository.AlunoRepository;



@Controller
@RequestMapping("/src")
public class CadastroSiteController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@PostMapping("/cadastrar")
    public String cadastrar(Aluno aluno) {
        alunoRepository.save(aluno);

        return "redirect:/";
    }
	
	@PostMapping("/loginFalso")
	public String loginFalso() {
		return "redirect:/cursos";
	}
}
