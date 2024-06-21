package org.example.service;


import lombok.RequiredArgsConstructor;
import org.example.entity.User;
import org.example.repository.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
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
        User userdto = userRepositoy.save(param);
        return userdto.getName();

    }
}
