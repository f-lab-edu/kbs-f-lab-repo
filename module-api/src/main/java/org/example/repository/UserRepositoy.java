package org.example.repository;


import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoy extends JpaRepository <User, Integer> {
    List<User> findByIndex(Integer index);

    User save(User user);

}
