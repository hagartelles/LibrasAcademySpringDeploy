package com.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academy.entidades.FaleConosco;
import com.academy.repository.FaleRepository;

@Controller
@RequestMapping("/faleMsg")
public class FaleController {
	
	@Autowired
	private FaleRepository faleRepository;
	
	@GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("fale/home");
        modelAndView.addObject("msgs", faleRepository.findAll());
        
        return modelAndView;
	}
	
	@GetMapping("/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("fale/detalhes");
        modelAndView.addObject("msg", faleRepository.getReferenceById(id));

        return modelAndView;
    }
	
	@GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("fale/formulario");
        modelAndView.addObject("msg", new FaleConosco());      

        return modelAndView;
    }
	
	@GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("fale/formulario");
        modelAndView.addObject("msg", faleRepository.getReferenceById(id));

        return modelAndView;
    }
    	
	@PostMapping("/{id}/editar")
    public String editar(FaleConosco fale, @PathVariable Long id) {
        faleRepository.save(fale);

        return "redirect:/faleMsg";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        faleRepository.deleteById(id);

        return "redirect:/faleMsg";
    }
}
