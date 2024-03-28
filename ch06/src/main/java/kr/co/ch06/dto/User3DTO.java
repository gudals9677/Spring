package kr.co.ch06.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class User3DTO {

    private String uid;
    private String name;
    private String birth;
    private String hp;
    private String addr;
}
