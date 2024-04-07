package kr.co.ch07.controller;

import kr.co.ch07.dto.User5DTO;
import kr.co.ch07.service.User5Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("/user5")
public class User5Controller {

    private final User5Service service;

    @GetMapping("/list")
    public String list(Model model){
        List<User5DTO> users = service.selectUser5s();
        model.addAttribute("users",users);
        return "/user5/list";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "/user5/register";
    }

    @PostMapping("/register")
    public String register(User5DTO user5DTO){
        service.insertUser5(user5DTO);
        return "redirect:/user5/list";
    }

    @GetMapping("/modify")
    public String modifyForm(int seq, Model model){
        User5DTO user5DTO = service.selectUser5(seq);
        model.addAttribute(user5DTO);
        return "/user5/modify";
    }

    @PostMapping("/modify")
    public String modify(User5DTO user5DTO){
        service.updateUser5(user5DTO);
        return "redirect:/user5/list";
    }

    @GetMapping("/delete")
    public String delete(int seq){
        service.deleteUser5(seq);
        return "redirect:/user5/list";
    }
}
