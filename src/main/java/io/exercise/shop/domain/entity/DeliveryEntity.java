package io.exercise.shop.domain.entity;

import javax.persistence.*;

@Entity
public class DeliveryEntity {

    @Id @GeneratedValue
    @Column(name = "delivery_no")
    private Long deliveryNo;

    @OneToOne(mappedBy = "deliveryEntity")
    private OrderEntity orderEntity;

}
