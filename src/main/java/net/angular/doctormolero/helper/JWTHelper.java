package net.angular.doctormolero.helper;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;
import javax.crypto.SecretKey;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JWTHelper {

    private static final String SECRET = "DrMolero2024";
    private static final String ISSUER = "Dr.Molero";

    private static SecretKey secretKey() {
        return Keys.hmacShaKeyFor((SECRET + ISSUER + SECRET).getBytes());
    }

    public static String generateJWT(String username) {
        Date currentTime = Date.from(Instant.now());
        Date expiryTime = Date.from(Instant.now().plus(Duration.ofHours(1))); // Token válido por 1 hora

        return Jwts.builder()
                .setId(UUID.randomUUID().toString())
                .setIssuer(ISSUER)
                .setIssuedAt(currentTime)
                .setExpiration(expiryTime)
                .claim("name", username)
                .signWith(secretKey())
                .compact();
    }

    public static String validateJWT(String strJWT) {
        try {
            Jws<Claims> headerClaimsJwt = Jwts.parserBuilder()
                    .setSigningKey(secretKey())
                    .build()
                    .parseClaimsJws(strJWT);

            Claims claims = headerClaimsJwt.getBody();

            if (claims.getExpiration().before(new Date())) {
                return null; // Token expirado
            }

            if (!claims.getIssuer().equals(ISSUER)) {
                return null; // Emisor incorrecto
            }

            return claims.get("name", String.class);
        } catch (Exception e) {
            return null; // Error de validación
        }
    }
}
