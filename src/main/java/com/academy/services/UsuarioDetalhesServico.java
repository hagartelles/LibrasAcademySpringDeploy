//package com.academy.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.academy.entidades.Funcionario;
//import com.academy.entidades.UsuarioDetalhes;
//import com.academy.repository.FuncionarioRepository;
//
//@Service
//public class UsuarioDetalhesServico implements UserDetailsService {
//	@Autowired
//    private FuncionarioRepository funcionarioRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Funcionario funcionario = funcionarioRepository.findByEmail(email)
//            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
//
//        return new UsuarioDetalhes(funcionario);
//    }    
//}
