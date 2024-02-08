package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.servlet.http.HttpServletRequest;
import net.angular.doctormolero.helper.JWTHelper;

@Service
public class SessionService {

    @Autowired
    HttpServletRequest oHttpServletRequest;

    public String login() {
        return JWTHelper.generateJWT("drmolero"); // Generamos el token JWT con el usuario fijo "drmolero"
    }
    
}
