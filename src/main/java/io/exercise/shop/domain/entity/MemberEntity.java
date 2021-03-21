package io.exercise.shop.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberEntity {

    @Id @GeneratedValue
    @Column(name = "member_no")
    private Long memberNo;

    private String memberName;

    @Embedded
    private AddressValue address;

    @OneToMany(mappedBy = "memberEntity")
    private List<OrderEntity> orderEntityList = new ArrayList<>();
}
