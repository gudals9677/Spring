package kr.co.ch06.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Builder
@ToString
public class User4DTO {

    private String uid;
    private String name;
    private String gender;
    private int age;
    private String hp;
    private String addr;
}
