package kr.co.ch10.controller;

import kr.co.ch10.dto.UserDTO;
import kr.co.ch10.entity.User;
import kr.co.ch10.jwt.JwtProvider;
import kr.co.ch10.security.MyUserDetails;
import kr.co.ch10.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {

    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserDTO userDTO){

        // Security 인증 처리
        UsernamePasswordAuthenticationToken authToken
                = new UsernamePasswordAuthenticationToken(userDTO.getUid(), userDTO.getPass());

        Authentication authentication = authenticationManager.authenticate(authToken);

        // 인증된 사용자 가져오기
        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
        User user = userDetails.getUser();

        // 토큰 발급(액세스, 리프레쉬)
        String access  = jwtProvider.createToken(user, 1); // 1일
        String refresh = jwtProvider.createToken(user, 7); // 7일

        // 리프레쉬 토큰 DB 저장

        // 액세스 토큰 클라이언트 전송
        Map<String, Object> map = new HashMap<>();
        map.put("grantType", "Bearer");
        map.put("access", access);

        return ResponseEntity.ok().body(map);
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserDTO>> list(){
        return userService.selectUsers();
    }
}
