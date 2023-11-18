//package com.academy.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//
//import com.academy.enums.Perfil;
//import com.academy.services.UsuarioDetalhesServico;
//
//
//@Configuration
//@EnableReactiveMethodSecurity
//public class ConfiguracaoSeguranca{
//	
//	@Autowired
//	private UsuarioDetalhesServico userDetailsServiceImpl;
//		
//	@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//        .authorizeHttpRequests((authorize) -> authorize
//                .requestMatchers("/blog/**").permitAll()
//                .requestMatchers("/img/**").permitAll()
//                .requestMatchers("/css/**").permitAll()
//                .requestMatchers("/js/**").permitAll()
//                .requestMatchers("/*/cadastrar").hasAuthority(Perfil.ADMIN.toString())
//                .requestMatchers("//editar").hasAuthority(Perfil.ADMIN.toString())
//	            .requestMatchers("/*/excluir").hasAuthority(Perfil.ADMIN.toString())
//                .anyRequest().authenticated()
//            )
//            .formLogin(formLogin -> formLogin
//                .loginPage("/login")
//                .defaultSuccessUrl("/cursos")
//                .permitAll()
//            );
//           
//            
//       
//
//        return http.build();
//    }
//	
//	@Bean
//	DefaultSecurityFilterChain springSecurity(HttpSecurity http) throws Exception {
//		HttpSessionRequestCache requestCache = new HttpSessionRequestCache();
//		requestCache.setMatchingRequestParameterName("continue");
//		http
//			// ...
//			.requestCache((cache) -> cache
//				.requestCache(requestCache)
//			);
//		return http.build();
//	}
//	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//	String result = encoder.encode("myPassword");
//	assertTrue(encoder.matches("myPassword", result));
////	@Bean
////    RememberMeServices rememberMeServices(UserDetailsService userDetailsService) {
////        String myKey = null;
////		return new TokenBasedRememberMeServices(myKey, userDetailsService);
////    }
//	
////	@Bean
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
////	}
//}
