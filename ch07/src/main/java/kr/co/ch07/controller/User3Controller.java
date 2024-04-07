package kr.co.ch07.controller;

import kr.co.ch07.dto.User3DTO;
import kr.co.ch07.service.User3Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("/user3")
public class User3Controller {

    private final User3Service service;

    @GetMapping("/list")
    public String list(Model model){
        List<User3DTO> users = service.selectUser3s();
        model.addAttribute("users",users);
        return "/user3/list";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "/user3/register";
    }

    @PostMapping("/register")
    public String register(User3DTO user3DTO){
        service.insertUser3(user3DTO);
        return "redirect:/user3/list";
    }

    @GetMapping("/modify")
    public String modifyForm(String uid, Model model){
        User3DTO user3DTO = service.selectUser3(uid);
        model.addAttribute("user3DTO",user3DTO);
        return "/user3/modify";
    }

    @PostMapping("/modify")
    public String modify(User3DTO user3DTO){
        service.updateUser3(user3DTO);
        return "redirect:/user3/list";
    }

    @GetMapping("/delete")
    public String delete(String uid){
        service.deleteUser3(uid);
        return "redirect:/user3/list";
    }
}
