package net.angular.doctormolero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import jakarta.servlet.http.HttpServletRequest;
import net.angular.doctormolero.bean.UserBean;
import net.angular.doctormolero.helper.JWTHelper;

@Service
public class SessionService {

    @Autowired
    HttpServletRequest oHttpServletRequest;

    @Value("${session.username}")
    private String strUsername;

    @Value("${session.password}")
    private String strPass;

    public String login(UserBean oUserBean) {
        if (oUserBean.getUsername() == null || oUserBean.getPassword() == null) {
            throw new RuntimeException("Usuario o contraseña incorrectos");
        } else {
            if (!oUserBean.getUsername().equals(strUsername) || !oUserBean.getPassword().equals(strPass)) {
                throw new RuntimeException("Usuario o contraseña incorrectos");
            } else {
                return JWTHelper.generateJWT(oUserBean.getUsername());
            }
        }
    }

    public String getUsername() {
       if (oHttpServletRequest.getAttribute("username") instanceof String) {
            return oHttpServletRequest.getAttribute("username").toString();
        } else {
            return null;
        }
    }    

    public boolean isLogged() {
        if (getUsername() != null) {
            return true;
        } else {
            return false;
        }
    }


}
