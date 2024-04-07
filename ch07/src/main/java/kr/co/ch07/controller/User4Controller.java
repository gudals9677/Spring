package kr.co.ch07.controller;

import kr.co.ch07.dto.User4DTO;
import kr.co.ch07.service.User4Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("/user4")
public class User4Controller {

    private final User4Service service;

    @GetMapping("/list")
    public String list(Model model){
        List<User4DTO> users = service.selectUser4s();
        model.addAttribute("users",users);
        return "/user4/list";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "/user4/register";
    }

    @PostMapping("/register")
    public String register(User4DTO user4DTO){
        service.insertUser4(user4DTO);
        return "redirect:/user4/list";
    }

    @GetMapping("/modify")
    public String modifyForm(String uid, Model model){
        User4DTO user4DTO = service.selectUser4(uid);
        model.addAttribute(user4DTO);
        return "/user4/modify";
    }

    @PostMapping("/modify")
    public String modify(User4DTO user4DTO){
        service.updateUser4(user4DTO);
        return "redirect:/user4/list";
    }

    @GetMapping("/delete")
    public String delete(String uid){
        service.deleteUser4(uid);
        return "redirect:/user4/list";
    }
}
