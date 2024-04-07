package kr.co.ch06.mapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
@AllArgsConstructor
class User2MapperTest {

    private final User2Mapper mapper;

    
    @Test
    @DisplayName("user2 등록")
    void insertUser2() {

        // given
            User2DTO user2DTO = User2DTO.builder()
                    .uid("a223")
                    .name("호호")
                    .birth("1995-11-11")
                    .addr("부산")
                    .build();
        // when
            mapper.insertUser2(user2DTO);
        // then

    }

    @Test
    @DisplayName("user2 조회")
    void selectUser2() {
    }

    @Test
    @DisplayName("user2 목록")
    void selectUser2s() {
    }

    @Test
    @DisplayName("user2 수정")
    void updateUser2() {
    }

    @Test
    @DisplayName("user2 삭제")
    void deleteUser2() {
    }
}