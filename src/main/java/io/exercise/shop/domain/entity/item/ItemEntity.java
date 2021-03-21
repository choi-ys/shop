package io.exercise.shop.domain.entity.item;

import io.exercise.shop.domain.entity.CategoryEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "d_type")
public abstract class ItemEntity {

    @Id @GeneratedValue
    @Column(name = "item_no")
    private Long itemNo;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price ")
    private int itemPrice;

    @ManyToMany(mappedBy = "itemEntityList")
    private List<CategoryEntity> categoryEntityList = new ArrayList<>();
}
