package io.exercise.shop.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderEntity {

    @Id @GeneratedValue
    @Column(name = "order_no")
    private Long orderNo;

    @ManyToOne
    @JoinColumn(name = "member_no")
    private MemberEntity memberEntity;

    @OneToOne
    @JoinColumn(name = "delivery_no")
    private DeliveryEntity deliveryEntity;

    @OneToMany(mappedBy = "orderEntity")
    private List<OrderItemEntity> orderItemEntityList = new ArrayList<>();
}
