package com.example.demo.Controller;

import com.example.demo.Model.TaiKhoan;
import com.example.demo.Service.TaiKhoanService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "${frontend.url}", allowCredentials = "true")

@RestController
public class TaiKhoanCTL {
    @Autowired
    private TaiKhoanService service;

    @PostMapping("/api/login")
    public Map<String, Object> login(@RequestParam("username") String username,
                        @RequestParam("password") String password, HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(7200);
        Map<String, Object> response = new HashMap<>();
        Object user = service.login(username, password);

        if (user != null) {
            session.setAttribute("user", user);
            response.put("message", "Login Succeeded!");
            response.put("user", user);
        } else {
            response.put("message", "Login Failed!");
            response.put("error", "Invalid username or password");
        }

        return response;
    }
    @GetMapping("/api/session")
    public Map<String, Object> getSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Map<String, Object> response = new HashMap<>();

        if (session != null) {
            Object user = (Object) session.getAttribute("user");
            if (user != null) {
                response.put("user", user);
                response.put("authenticated", true);
            } else {
                response.put("authenticated", false);
            }
        } else {
            response.put("authenticated", false);
        }

        return response;
    }
    @PostMapping("/api/register")
    public boolean register(@RequestParam("fullname") String fullname,
                           @RequestParam("email") String email,
                           @RequestParam("phone") String phone,
                           @RequestParam("password") String password
                           ) {
        return service.register(fullname, password, email, phone);
    }
}
