package io.exercise.shop.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity @Table(name = "member_tb")
@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class MemberEntity {

    @Id @GeneratedValue
    @Column(name = "member_no")
    private Long memberNo;

    @Column(name = "member_name", length = 25, nullable = false)
    private String memberName;
}
