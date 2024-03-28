package kr.co.ch07.repository;

import kr.co.ch07.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface User2Repository extends JpaRepository<User2, String> {

    // 사용자 정의 쿼리 메서드
    User2 findUser2ByUid(String uid);
    List<User2> findUser2ByName(String name);
    List<User2> findUser2ByNameNot(String name);

    User2 findUser2ByUidAndName(String uid, String name);
    List<User2> findUser2ByUidOrName(String uid, String name);

    List<User2> findUser2ByNameLike(String name);
    List<User2> findUser2ByNameContains(String name);
    List<User2> findUser2ByNameStartsWith(String name);
    List<User2> findUser2ByNameEndsWith(String name);

    List<User2> findUser2ByOrderByName();

    int countUser2ByUid(String uid);
    int countUser2ByName(String name);

    // JPQL 정의

    @Query("select u2 from User2 u2 WHERE u2.name = ?1")
    List<User2> selectUser2ByName(String name);

    @Query("select u2 from User2 u2 WHERE u2.name = :name")
    List<User2> selectUser2ByNameParam(@Param("name") String name);

    @Query("select u2.uid, u2.name, u2.addr from User2 u2 WHERE u2.uid = :uid")
    List<Object[]> selectUser2ByUid(@Param("uid") String uid);
}