//package com.example.bookservice.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableMethodSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()       // Not necessary for token-based auth
//                .formLogin().disable()  // Disable default login form
//                .httpBasic().disable()  // Disable basic auth prompts
//                .authorizeHttpRequests()
//                // Permit all for now, so we can test register/login easily
//                .anyRequest().permitAll();
//
//        return http.build();
//    }
//
//}
