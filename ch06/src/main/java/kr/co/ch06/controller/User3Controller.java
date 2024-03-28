package kr.co.ch06.controller;

import kr.co.ch06.dto.User3DTO;
import kr.co.ch06.service.User3Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Controller
public class User3Controller {

    private final User3Service service;

    @GetMapping("/user3/list")
    public String list(Model model){
        List<User3DTO> users = service.selectUser3s();
        log.info(users.toString());

        model.addAttribute("users",users);
        return "/user3/list";
    }

    @GetMapping("/user3/register")
    public String registerForm(){
        return "/user3/register";
    }
    @PostMapping("/user3/register")
    public String register(User3DTO user3DTO){
        service.insertUser3(user3DTO);
        log.info("register:" + user3DTO);

        return "redirect:/user3/list";
    }
    @GetMapping("/user3/modify")
    public String modifyForm(@RequestParam("uid")String uid,Model model){
        log.info("modifyForm :" + uid);

        User3DTO user3DTO = service.selectUser3(uid);
        log.info("user3DTO:" + user3DTO);

        model.addAttribute("user3DTO", user3DTO);

        return "/user3/modify";
    }
    @PostMapping("/user3/modify")
    public String modify(User3DTO user3DTO){
        service.updateUser3(user3DTO);
        log.info("modify:" + user3DTO);

        return "redirect:/user3/list";
    }
    @GetMapping("/user3/delete")
    public String delete(@RequestParam("uid")String uid){
        log.info("delete:" + uid);
        service.deleteUser3(uid);

        return "redirect:/user3/list";
    }
}
