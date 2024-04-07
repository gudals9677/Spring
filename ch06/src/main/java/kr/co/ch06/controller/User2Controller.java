package kr.co.ch06.controller;

import kr.co.ch06.dto.User2DTO;
import kr.co.ch06.service.User2Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller
public class User2Controller {

    private final User2Service service;

    @GetMapping("/user2/list")
    public String list(Model model){
        List<User2DTO> user2s = service.selectUser2s();
        log.info(user2s.toString());

        model.addAttribute("user2s",user2s);
        return "/user2/list";
    }
    @GetMapping("/user2/register")
    public String registerForm(){
        return "/user2/register";
    }
    @PostMapping("/user2/register")
    public String register(User2DTO user2DTO){
        log.info(user2DTO.toString());
        service.insertUser2(user2DTO);
        return "redirect:/user2/list";
    }
    @GetMapping("/user2/modify")
    public String modifyForm(String uid, Model model){
        log.info("modify = {}", uid);

        User2DTO user2DTO = service.selectUser2(uid);
        log.info(user2DTO.toString());

        model.addAttribute(user2DTO);
        return "/user2/modify";
    }
    @PostMapping("/user2/modify")
    public String modify(User2DTO user2DTO){

        service.updateUser2(user2DTO);
        return "redirect:/user2/list";
    }

    @GetMapping("/user2/delete")
    public String delete(String uid){
        service.deleteUser2(uid);
        return "redirect:/user2/list";
    }
}
