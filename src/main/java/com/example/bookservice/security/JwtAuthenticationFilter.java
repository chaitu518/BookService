//package com.example.bookservice.security;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.JwtException;
//import io.jsonwebtoken.Jwts;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.Collections;
//import java.util.List;
//
//@Service
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    private final String secretKey; // or decode if it's base64
//
//    public JwtAuthenticationFilter(@Value("${jwt.secret-key}")String secretKey) {
//        this.secretKey = secretKey;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain)
//            throws ServletException, IOException {
//
//        String authHeader = request.getHeader("Authorization");
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            String token = authHeader.substring(7);
//
//            try {
//                Claims claims = Jwts.parser()
//                        .setSigningKey(secretKey)
//                        .parseClaimsJws(token)
//                        .getBody();
//
//                // Now you can read the custom claims
//                String email = (String) claims.get("email");
//                String scope = (String) claims.get("scope"); // e.g., "READ"
//                if (scope != null) {
//                    // Convert to a GrantedAuthority
//                    GrantedAuthority authority = new SimpleGrantedAuthority(scope);
//
//                    // Create the Authentication object
//                    UsernamePasswordAuthenticationToken authToken =
//                            new UsernamePasswordAuthenticationToken(email ,
//                                    null ,
//                                    Collections.singletonList(authority));
//
//                    // Put in SecurityContext
//                    SecurityContextHolder.getContext().setAuthentication(authToken);
//                }
//
//                // e.g., set them in your SecurityContext if needed
//                // ...
//            } catch (JwtException ex) {
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                return;
//            }
//        }
//
//        // continue
//        filterChain.doFilter(request, response);
//    }
//}
//
