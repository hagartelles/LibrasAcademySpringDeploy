package com.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.academy.entidades.Aluno;
import com.academy.entidades.Cursos;
import com.academy.repository.AlunoRepository;
import com.academy.repository.CursosRepository;
import com.academy.repository.ProfessorRepository;

@Controller
@RequestMapping("/cursoAndamento")
public class CursoAndamentoController {
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private CursosRepository cursosRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("cursoAndamento/home");
        modelAndView.addObject("alunos", alunoRepository.findAll());
        modelAndView.addObject("cursos", cursosRepository.findAll());

        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("cursoAndamento/detalhes");
        modelAndView.addObject("curso", cursosRepository.getReferenceById(id));        
        modelAndView.addObject("alunos", alunoRepository.getReferenceById(id));
        return modelAndView;
    }
    
    @GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("cursoAndamento/formulario");
        List<Aluno> alunos = alunoRepository.findAll();
        List<Cursos> cursos = cursosRepository.findAll();
        modelAndView.addObject("cursos", cursos);
        modelAndView.addObject("alunos", alunos);
        modelAndView.addObject("curso", new Cursos());
        

        return modelAndView;
    }
    
    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("cursoAndamento/editCursoAndamento");
        modelAndView.addObject("cursos", cursosRepository.getReferenceById(id));
        modelAndView.addObject("alunos", alunoRepository.getReferenceById(id));
        
        return modelAndView;
    }
    
    @PostMapping("/cadastrar")
    public String cadastrar(@RequestParam("alunoId") Long alunoId, @RequestParam("cursoId") Long cursoId) {
//        cursosRepository.save(curso);
    	Aluno aluno = alunoRepository.findById(alunoId).orElseThrow(); // Supondo que você tenha um método findById no repositório
        Cursos curso = cursosRepository.findById(cursoId).orElseThrow(); // Supondo que você tenha um método findById no repositório

        curso.getEstudantes().add(aluno);
        alunoRepository.save(aluno);

        return "redirect:/cursoAndamento";
    }
    
    @PostMapping("/{id}/editar")
    public String editar(Cursos curso, @PathVariable Long id) {
        cursosRepository.save(curso);

        return "redirect:/cursoAndamento";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        cursosRepository.deleteById(id);

        return "redirect:/cursoAndamento";
    }
}
