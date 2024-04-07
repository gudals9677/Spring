package kr.co.ch07.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.ch07.dto.User4DTO;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user4")
public class User4 {

    @Id
    private String uid;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "hp")
    private String hp;

    @Column(name = "addr")
    private String addr;

    public User4DTO toDTO(){
        return User4DTO
                .builder()
                .uid(uid)
                .name(name)
                .gender(gender)
                .age(age)
                .hp(hp)
                .addr(addr)
                .build();
    }
}
