package io.github.eugenezzf.Hostel.service;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.github.eugenezzf.Hostel.config.EnvConfig;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service 
public class JwtService {   

    private final String secretKey = EnvConfig.get("JWT_SECRET");

    public String generateToken(UserDetails userDetails){
        return Jwts.builder()
        .subject(userDetails.getUsername())
        .issuedAt(new Date())
        .expiration(
            new Date(System.currentTimeMillis() + 1000 *60 * 60)
        )
        .signWith(getSignInKey())
        .compact();
    }

    private SecretKey getSignInKey(){
        return Keys.hmacShaKeyFor(
            secretKey.getBytes(StandardCharsets.UTF_8)
        );
    }

}
