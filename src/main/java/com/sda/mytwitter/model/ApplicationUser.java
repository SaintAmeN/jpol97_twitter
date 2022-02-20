package com.sda.mytwitter.model;

import com.sda.mytwitter.model.AccountStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;
    private String accountName;
    private String urlAccount;

    @CreationTimestamp
    private LocalDateTime creationTime;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Lob
    private Blob avatar;

    // relacja - kogo obserwujemy
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany
    private Set<ApplicationUser> observedUsers;

    // relacja - przez kogo jesteśmy obserwowani
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "observedUsers")
    private Set<ApplicationUser> observedByUsers;

    // posty użytkownika
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "creator")
    private Set<Post> posts;

    // hearts użytkownika
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "creator")
    private Set<Heart> hearts;

    // comments użytkownika
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "creator")
    private Set<PostComment> comments;
}
