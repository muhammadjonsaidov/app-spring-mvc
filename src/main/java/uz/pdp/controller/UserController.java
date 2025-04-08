package uz.pdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.model.User;
import uz.pdp.repository.UserRepository;
import org.springframework.web.servlet.ModelAndView;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping // "/users" uchun GET
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "user-list";
    }

    @GetMapping("/new") // "/users/new" uchun GET
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping // "/users" uchun POST
    public String saveUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "redirect:/users"; // Redirect
    }


}