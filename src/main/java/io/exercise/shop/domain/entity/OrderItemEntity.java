package io.exercise.shop.domain.entity;

import io.exercise.shop.domain.entity.item.ItemEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderItemEntity {

    @Id @GeneratedValue
    @Column(name = "order_item_no")
    private Long orderItemNo;

    @ManyToOne
    @JoinColumn(name = "order_no")
    private OrderEntity orderEntity;

    @ManyToOne
    @JoinColumn(name = "item_no")
    private ItemEntity itemEntity;

}
