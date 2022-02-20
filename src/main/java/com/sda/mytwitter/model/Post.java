package com.sda.mytwitter.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ApplicationUser creator;

    // hearts dodane do posta
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "post")
    private Set<Heart> hearts;

    // comments dodane do posta
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "post")
    private Set<PostComment> comments;
}
