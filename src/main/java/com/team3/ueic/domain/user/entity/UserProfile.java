package com.team3.ueic.domain.user.entity;

import com.team3.ueic.global.entity.BaseTimeEntity;
import com.team3.ueic.test.enums.WeakType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "user_profile")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserProfile extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(nullable = false)
    private Integer targetScore;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private WeakType weakType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private PreferredMode preferredMode;

    @Builder
    public UserProfile(Integer targetScore, PreferredMode preferredMode) {
        this.targetScore = targetScore;
        this.preferredMode = preferredMode;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void updateWeakType(WeakType weakType) {
        this.weakType = weakType;
    }
}
