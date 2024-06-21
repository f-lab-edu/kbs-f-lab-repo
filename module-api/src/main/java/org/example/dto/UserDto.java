package org.example.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.entity.User;


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
