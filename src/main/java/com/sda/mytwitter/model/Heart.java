package com.sda.mytwitter.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Heart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime creationTime;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private ApplicationUser creator;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Post post;


}
