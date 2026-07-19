package com.tp.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    //Base de Datos "Logica"
    private Map<String, String> usuarios = new HashMap<>();

    public LoginController() {

        usuarios.put("Luisina", "1234");
        usuarios.put("TodoCode", "java");
        usuarios.put("Ibra", "perro");
        usuarios.put("Colapinto", "f1");
    }


    //Login
    @GetMapping("/login")
    public String login() {
        return  "login";
    }


    // Inicio de sesion
    @PostMapping("/login")
    public String procesarLogin(@RequestParam String username
                              , @RequestParam String password,
                                HttpSession session,
                                Model model) {

        //validar que el usuario exista
        if(usuarios.containsKey(username)){
            //validar la contrasenia
            String passwordOk = usuarios.get(username); //obtenemos la passsword del hashmap
            if(passwordOk.equals(password)){
                //Guardar el usuario en la session
                session.setAttribute("usuario", username);
                return "redirect:/bienvenida";
            }
        }
        //Si no existe o si falla
        model.addAttribute("error", "Usuario o contraseña incorrectos");

        return  "login";


    }

    //Pagina de Bienvenida
    @GetMapping("/bienvenida")
    public String mostrarBienvenida(HttpSession session) {

        String username = (String) session.getAttribute("usuario");
        if(username == null){
            return "redirect:/login";
        }
        return "bienvenida";
    }

    // Cerrar Sesion
    @GetMapping("/logout")
    public String cerrarSesion(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
