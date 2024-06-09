package org.example.flabproject.service;


import lombok.RequiredArgsConstructor;
import org.example.flabproject.dto.UserDto;
import org.example.flabproject.entity.User;
import org.example.flabproject.repository.UserRepositoy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepositoy userRepositoy;

    @Transactional(readOnly = true)
    public List<User> getUserIndex(int index) {

        return userRepositoy.findByIndex(index);

    }

    public String save() {
        User param = User.builder()
                .id("YDW")
                .gender("F")
                .comment("Tester")
                .name("Dowon")
                .build();
        User userdt0 = userRepositoy.save(param);
        return userdt0.getName();

    }
}
