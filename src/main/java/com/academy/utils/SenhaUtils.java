//package com.academy.utils;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//public class SenhaUtils {
//    
//    public static String encode(String senha) {
//    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//    	String result = encoder.encode("myPassword");
//    	assertTrue(encoder.matches("myPassword", result));
//        return encoder.encode(senha);
//    }
//
//    public static boolean matches(String senha, String hash) {
//    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//    	String result = encoder.encode("myPassword");
//    	assertTrue(encoder.matches("myPassword", result));
//
//        return encoder.matches(senha, hash);
//    }
//
//}