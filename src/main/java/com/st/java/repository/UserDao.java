package com.st.java.repository;

import com.st.java.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    @Query("select u from user u where u.role =:role")
    List<User> getAdmin(@Param("role") String role);
}
