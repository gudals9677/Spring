package kr.co.ch06.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class User2DTO {

    private String uid;
    private String name;
    private String birth;
    private String addr;
}
