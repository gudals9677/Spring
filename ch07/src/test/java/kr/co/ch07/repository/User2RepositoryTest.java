package kr.co.ch07.repository;

import kr.co.ch07.entity.User2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class User2RepositoryTest {


    private final User2Repository repository;

    @Autowired
    User2RepositoryTest(User2Repository repository) {
        this.repository = repository;
    }
    @Test
    @DisplayName("user2 등록")
    public void insertUser2(){
        //given
        User2 user2 = User2.builder()
                .uid("a888")
                .name("김성샌")
                .birth("1992-11-12")
                .addr("부산")
                .build();

        //when
        repository.save(user2);
        //then
        Optional<User2> savedUser2 = repository.findById("a888");
        if(savedUser2.isPresent()){
            log.info("등록된 user2: {}", savedUser2.get().toString());
        }else{
            log.info("user2 등록실패");
        }
    }
    @Test
    @DisplayName("user2 조회")
    public void selectUser2(){
        //given
        String uid= "a888";

        //when
        Optional<User2> result = repository.findById(uid);
        User2 user2 = result.get();
        log.info(user2.toString());
        //then
    }
    @Test
    @DisplayName("user2 목록")
    public void selectUser2s(){
        //given

        //when
        List<User2> user2s = repository.findAll();


        //then
    }
    @Test
    @DisplayName("user2 수정")
    public void updateUser2(){

        //given
        String uid = "a888";
        //when
        Optional<User2> modifyUser2 = repository.findById(uid);

        //then
        User2 user2 = modifyUser2.get();

        User2 updateUser2 = User2.builder()
                .uid(uid)
                .name("하하하")
                .birth("1004-11-21")
                .addr("서울")
                .build();

        repository.save(updateUser2);

        log.info("updateUser2 : " + updateUser2);
    }
    @Test
    @DisplayName("user2 삭제")
    public void deleteUser2(){

        //given
        String uid = "a888";
        //when
        repository.deleteById(uid);
        //then
    }
}