package org.example.flabproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.example.flabproject.entity.User;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto {

    private Long index;

    private String id;

    private String gender;

    private String name;

    private String comment;

    public User toEntity() {
        return User.builder()
                .id(id)
                .gender(gender)
                .comment(comment)
                .name(name)
                .build();
    }
}
