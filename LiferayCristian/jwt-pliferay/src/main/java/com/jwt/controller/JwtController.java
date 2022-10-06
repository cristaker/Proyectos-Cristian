package com.jwt.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entity.AuthUser;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class JwtController {
	
	String secret = "Mi.clave.secreta";
	
	@GetMapping("/jwt")
	public String createToken(AuthUser authUser) {
		
		Map<String, Object> claims = new HashMap<>();
		claims = Jwts.claims().setSubject(authUser.userName);
		claims.put("id", authUser.id);
		Date now = new Date();
		Date exp = new Date(now.getTime() +900000);
		return Jwts.builder()
				.setClaims(claims)
				.setIssuedAt(now)
				.setExpiration(exp)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}
	
	public boolean validate(String token) {
		try {
			
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getUserNameFromToken(String token) {
		try {
			return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
		} catch (Exception e) {
			return "bad Token";
		}
	}

}
