package com.example.snapEvent.entity;

import com.example.snapEvent.entity.audit.BaseTimeEntity;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.Map;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Follower extends BaseTimeEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private String followerId;
    @Column
    private String followerNickname;
    @Type(JsonType.class)
    @Column
    private Map<String, String> subList;
    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member memberId;
}
