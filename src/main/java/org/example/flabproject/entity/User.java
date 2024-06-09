package org.example.flabproject.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
@Table(name = "usertesttable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Index")
    private Long index;
    @Column(name = "ID")
    private String id;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Name")
    private String name;
    @Column(name = "Comment")
    private String comment;

   @Builder
   public User(String id, String gender, String name, String comment) {
       this.id = id;
       this.gender = gender;
       this.name = name;
       this.comment = comment;
   }


}
