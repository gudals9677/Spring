package kr.co.ch07.entity;

import jakarta.persistence.*;
import kr.co.ch07.dto.User5DTO;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user5")
public class User5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "addr")
    private String addr;

    public User5DTO toDTO(){
        return User5DTO.builder()
                .seq(seq)
                .name(name)
                .gender(gender)
                .age(age)
                .addr(addr)
                .build();
    }
}
