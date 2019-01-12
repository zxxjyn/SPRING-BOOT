package com.amaduse.dao;

import com.amaduse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
    User findUserByName(String name);
}
